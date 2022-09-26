package org.etri.slice.impl;

import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static org.etri.slice.impl.C.BW_UNIT.GB;
import static org.etri.slice.impl.C.BW_UPDATE_OP.ADD;
import static org.etri.slice.impl.C.RESULTS.*;

public class Manager {
    private ConcurrentHashMap<String, SliceInstance> sliceInstances;
    private ConcurrentHashMap<DeviceId, OLTDevice> oltDevices;
    private ConcurrentHashMap<String, PonPort> ponPorts;

    public Manager() {
        sliceInstances = new ConcurrentHashMap<>();
        oltDevices = new ConcurrentHashMap<>();
        ponPorts = new ConcurrentHashMap<>();
    }

    public C.RESULTS addOLTDevice(DeviceId deviceId, C.WB_TYPE wbType) {
        if( oltDevices.containsKey(deviceId) ) return DUPLICATE;

        OLTDevice newDevice = new OLTDevice(deviceId, wbType);
        oltDevices.put(deviceId, newDevice);

        return SUCCESS;
    }

    public C.RESULTS addPonPort(DeviceId deviceId, String ponPortName) {
        if( !oltDevices.containsKey(deviceId) ) return ENTRY_NOT_FOUND;
        if( oltDevices.get(deviceId).getPonPort(ponPortName) != null ) return DUPLICATE;

        OLTDevice oltDevice = oltDevices.get(deviceId);
        oltDevice.addPonPort(ponPortName);

        return SUCCESS;
    }

    public C.RESULTS addSliceInstance(String sliceName,
                                      DeviceId deviceId, String ponPortName, String uniPort,
                                      int allocBandwidth, C.DBA_ALG dbaAlg) {
        if( sliceInstances.containsKey(sliceName) ) return DUPLICATE;
        if( !oltDevices.containsKey(deviceId) ) return ENTRY_NOT_FOUND;
        if( oltDevices.get(deviceId).getPonPort(ponPortName) == null ) return ENTRY_NOT_FOUND;

        OLTDevice oltDevice = oltDevices.get(deviceId);
        PonPort ponPort = oltDevice.getPonPort(ponPortName);

        if( ponPort.updateRemainedBandwidth(ADD, allocBandwidth) == SUCCESS ) {
            SliceInstance newInstance = new SliceInstance(sliceName,
                    oltDevice,
                    ponPort,
                    uniPort,
                    allocBandwidth,
                    dbaAlg
            );
            sliceInstances.put(sliceName, newInstance);
            return SUCCESS;
        }

        return WRONG_INPUT;
    }

    public SliceInstance getSliceInstance(String sliceName) {
        return sliceInstances.get(sliceName);
    }

    public C.RESULTS updateAllocatedBandwidth(String sliceName,
                                              DeviceId deviceId, String ponPortName,
                                              int newAllocBandwidth) {
        if( !oltDevices.containsKey(deviceId) ) return ENTRY_NOT_FOUND;
        if( oltDevices.get(deviceId).getPonPort(ponPortName) == null ) return ENTRY_NOT_FOUND;
        if( !sliceInstances.containsKey(sliceName) ) return ENTRY_NOT_FOUND;

        OLTDevice oltDevice = oltDevices.get(deviceId);
        PonPort ponPort = oltDevice.getPonPort(ponPortName);
        SliceInstance sliceInstance = sliceInstances.get(sliceName);

        int maxAllowableBandwidth =
                ponPort.getRemainedBandwidth() + sliceInstance.getAllocatedBandwidth();
        int minAllowableBandwidth =
                sliceInstance.getAllocatedBandwidth() - sliceInstance.getRemainedBandwidth();

        if( maxAllowableBandwidth < newAllocBandwidth ) return INSUFFICIENT_BANDWIDTH;
        if( minAllowableBandwidth > newAllocBandwidth ) return OVERFLOW_BANDWIDTH;

        sliceInstance.updateAllocatedBandwidth(newAllocBandwidth);

        return SUCCESS;
    }

    public List<String> getSliceInstances() {
        return (List<String>) sliceInstances.keys();
    }
}
