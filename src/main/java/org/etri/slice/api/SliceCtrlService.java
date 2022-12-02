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
package org.etri.slice.api;

import org.etri.slice.impl.C;
import org.etri.slice.impl.OLTDevice;
import org.etri.slice.impl.SliceInstance;
import org.etri.slice.impl.gui.PhysicalInfo;
import org.onlab.packet.VlanId;
import org.onosproject.event.ListenerService;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.etri.sis.SliceProfileInformation;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;

import java.util.List;

/**
 * Skeletal ONOS application API.
 */
public interface SliceCtrlService {
    SliceProfileInformation provisionSlice(String sliceName);
    AddSliceResponse addSlice(AddSliceRequest request);
//
    SliceInstance getSliceInstance(String groupName, String sliceName);
    List<SliceInstance> getSliceInstances();

    C.RESULTS addOLTDevice(DeviceId deviceId, C.WB_TYPE wbType);
    C.RESULTS addPonPort(DeviceId deviceId, String portName);
    C.RESULTS addSliceGroup(String groupName, DeviceId deviceId, String ponPortName, int totalBandwidth);
    C.RESULTS addSliceInstance(String groupName, String sliceName, String uniPortName, int fixedBandwidth, int assuredBandwidth, int surplusBandwidth, C.DBA_ALG dba);
    C.RESULTS updateBWOfSliceInstance(String groupName, String sliceName, int reqBandwidth);

    C.RESULTS provisionSubscriber(ConnectPoint cp);
    C.RESULTS provisionSubscriber(ConnectPoint cp, VlanId cTag, VlanId sTag, Integer tpId);

    // for GUI
    List<OLTDevice> getOLTDevices();
    List<PhysicalInfo> getTopology();
}
