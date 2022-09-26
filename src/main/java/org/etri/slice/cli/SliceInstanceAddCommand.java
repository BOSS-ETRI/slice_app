package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.DeviceId;

@Service
@Command(scope="boss", name="add-slice", description="Add a Logical Slice Instance")
public class SliceInstanceAddCommand extends AbstractShellCommand {
	@Argument(index = 0, name = "sliceName", required = true, multiValued = false)
	private String sliceName = null;

	@Argument(index = 1, name = "deviceId", required = true, multiValued = false)
	private String deviceId = null;

	@Argument(index = 2, name = "ponPortName", required = true, multiValued = false)
	private String ponPortName = null;

	@Argument(index = 3, name = "uniPortName", required = true, multiValued = false)
	private String uniPortName = null;

	@Argument(index = 4, name = "bandwidth", required = true, multiValued = false)
	private int bandwidth = 0;

	@Argument(index = 5, name = "dba", required = true, multiValued = false)
	private C.DBA_ALG dba = null;

	@Override
	protected void doExecute() {
		SliceCtrlService service = get(SliceCtrlService.class);

		DeviceId device = DeviceId.deviceId(deviceId);
		C.RESULTS result = service.addSliceInstance(
				sliceName, device, ponPortName, uniPortName, bandwidth, dba
		);

		switch (result) {
			case DUPLICATE:
				System.out.println("Slice Instance already exists!");
				break;

			case ENTRY_NOT_FOUND:
				System.out.println("There is no existing device or ponPort!");
				break;

			case WRONG_INPUT:
				System.out.println("Something went wrong!");
				break;

			case SUCCESS:
				System.out.println("successfully added the slice instance!");
				break;
		}
//                SliceProfileInformation info = service.provisionSlice(sliceName);
//                if (info != null) {
//                	System.out.println("                            2021-09-09          ");
//                    System.out.println("             PROVISIONED SLICE ENTRY            ");
//                    System.out.println("-------------------------------------------------");
//                    System.out.println("  ID\t|  Service Type\t|  DBA Type\t|  TP ID");
//                    System.out.println("-------------------------------------------------");
//                    System.out.printf(" %s\t|  %s\t|  %s\t|  %d\n", info.id(), info.serviceType(), info.dbaType(), info.technologyProfileId());
//                    int dbaType;
//                    int serviceType;
//                    if(info.serviceType().equals("Residential")) {
//                    	serviceType =1;
//                    }else if(info.serviceType().equals("Mobile")) {
//                    	serviceType = 2;
//                    }else {
//                    	serviceType = 0;
//                    }
//
//                    if(info.dbaType().equals("SR-DBA")) {
//                    	dbaType = 0;
//                    }else if(info.dbaType().equals("CO-DBA")) {
//                    	dbaType=2;
//                    }else {
//                    	dbaType=1;
//                    }
//                    //System.out.printf("DBA::::%d",dbaType);
//                    AddSliceRequest request = AddSliceRequest.newBuilder()
//                    		.setTechnologyProfileId(info.technologyProfileId()).setSliceName(info.id())
//                    		.setSliceTypeValue(serviceType).setDbaTypeValue(dbaType).build();
//                    //System.out.printf("DBA::::%s",request.getDbaType());
//                    AddSliceResponse response = service.AddSlice(request);
//
//                    System.out.printf("%s", response.getResult());
//                    System.out.println();
//
//                } else {
//                    System.out.println("!SLICE ENTRY NOT FOUND!");
//                }
        }	 
}
