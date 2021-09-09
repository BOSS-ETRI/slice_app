/*
 * Copyright 2021-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.cli.AbstractShellCommand;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.etri.sis.SliceProfileInformation;

import org.etri.slice.api.SliceCtrlService;

/**
 * Sample Apache Karaf CLI command.
 */
@Service
@Command(scope="boss", name="add-slice", description="Add Slice Criteria to VOLTHA")
public class SliceAddCommand extends AbstractShellCommand {
	@Argument(index = 0, name = "sliceName", description = "Unique slice name", required = true, multiValued = false)
	private String sliceName = null;

	@Override
	protected void doExecute() {
                SliceCtrlService service = AbstractShellCommand.get(SliceCtrlService.class);

                SliceProfileInformation info = service.provisionSlice(sliceName);
                if (info != null) {
                	System.out.println("                            2021-09-09          ");
                    System.out.println("             PROVISIONED SLICE ENTRY            ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("  ID\t|  Service Type\t|  DBA Type\t|  TP ID");
                    System.out.println("-------------------------------------------------");
                    System.out.printf(" %s\t|  %s\t|  %s\t|  %d\n", info.id(), info.serviceType(), info.dbaType(), info.technologyProfileId());
                    int dbaType;
                    int serviceType;
                    if(info.serviceType().equals("Residential")) {
                    	serviceType =1;
                    }else if(info.serviceType().equals("Mobile")) {
                    	serviceType = 2;
                    }else {
                    	serviceType = 0;
                    }
                    
                    if(info.dbaType().equals("SR-DBA")) {
                    	dbaType = 0;
                    }else if(info.dbaType().equals("CO-DBA")) {
                    	dbaType=2;
                    }else {
                    	dbaType=1;
                    }
                    //System.out.printf("DBA::::%d",dbaType);
                    AddSliceRequest request = AddSliceRequest.newBuilder()
                    		.setTechnologyProfileId(info.technologyProfileId()).setSliceName(info.id())
                    		.setSliceTypeValue(serviceType).setDbaTypeValue(dbaType).build();
                    //System.out.printf("DBA::::%s",request.getDbaType());
                    AddSliceResponse response = service.AddSlice(request);
                    
                    System.out.printf("%s", response.getResult());
                    System.out.println();
                    
                } else {
                    System.out.println("!SLICE ENTRY NOT FOUND!");
                }
        }	 
}
