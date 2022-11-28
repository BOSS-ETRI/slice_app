package org.etri.slice.impl;

import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

import static org.etri.slice.impl.C.BW_UNIT.GB;
import static org.etri.slice.impl.C.BW_UPDATE_OP.ADD;
import static org.etri.slice.impl.C.RESULTS.*;

public class Manager {
    private int maxSlices;
    private int numberOfSlices;
    private ConcurrentHashMap<String, SliceGroup> sliceGroups;
    private ConcurrentHashMap<String, SliceInstance> sliceInstances;
    private ConcurrentHashMap<DeviceId, OLTDevice> oltDevices;
    private ConcurrentHashMap<String, PonPort> ponPorts;
    private ConcurrentHashMap<Integer, C.USED> sliceIds;

    public Manager(int maxSlices) {
        this.maxSlices = maxSlices;
        numberOfSlices = 0;
        sliceGroups = new ConcurrentHashMap<>();
        sliceInstances = new ConcurrentHashMap<>();
        oltDevices = new ConcurrentHashMap<>();
        ponPorts = new ConcurrentHashMap<>();
        sliceIds = new ConcurrentHashMap<>();

        for( int n = 0; n < maxSlices; n++ ) {
            sliceIds.putIfAbsent(n, C.USED.NO);
        }
    }

    public int getEmptySliceId(boolean mark) {
        int sliceId = -1;

        if( numberOfSlices < maxSlices ) {
            for (Integer id : sliceIds.keySet()) {
                if (sliceIds.get(id) == C.USED.NO) {
                    sliceId = id;

                    if (mark) {
                        sliceIds.put(id, C.USED.YES);
                        numberOfSlices = numberOfSlices + 1;
                    }

                    break;
                }
            }
        }

        return sliceId;
    }

    public void releaseSliceId(int sliceId) {
        sliceIds.put(sliceId, C.USED.NO);
        numberOfSlices = numberOfSlices - 1;
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

    public C.RESULTS addSliceGroup(String groupName, DeviceId deviceId, String ponPortName, int totalBandwidth) {
        if( sliceGroups.containsKey(groupName) ) return DUPLICATE;
        if( !oltDevices.containsKey(deviceId) ) return ENTRY_NOT_FOUND;
        if( oltDevices.get(deviceId).getPonPort(ponPortName) == null ) return ENTRY_NOT_FOUND;

        OLTDevice oltDevice = oltDevices.get(deviceId);
        PonPort ponPort = oltDevice.getPonPort(ponPortName);
        int sliceId = getEmptySliceId(true);

        if( sliceId == -1 ) return FULL_ENTRY;

        if( ponPort.updateRemainedBandwidth(ADD, totalBandwidth) == SUCCESS ) {
            SliceGroup newGroup = new SliceGroup(
                    groupName,
                    sliceId,
                    oltDevice,
                    ponPort,
                    totalBandwidth
            );
            sliceGroups.put(groupName, newGroup);
            return SUCCESS;
        }

        return WRONG_INPUT;
    }

    public C.RESULTS addSliceInstance(String groupName, String sliceName, String uniPort,
                                      int allocBandwidth, C.DBA_ALG dbaAlg) {
        if( !sliceGroups.containsKey(groupName) ) return ENTRY_NOT_FOUND;
        if( sliceInstances.containsKey(sliceName) ) return DUPLICATE;

        SliceGroup sliceGroup = sliceGroups.get(groupName);

        if( sliceGroup.updateRemainedBandwidth(ADD, allocBandwidth) == SUCCESS ) {
            SliceInstance newInstance = new SliceInstance(sliceName,
                    uniPort,
                    allocBandwidth,
                    dbaAlg
            );
            sliceInstances.put(sliceName, newInstance);
            sliceGroup.addSliceInstance(sliceName, newInstance);
            return SUCCESS;
        }

        return WRONG_INPUT;
    }

    public C.RESULTS updateAllocatedBandwidth(String groupName, String sliceName,
                                              int newAllocBandwidth) {
        if( !sliceGroups.containsKey(groupName) ) return ENTRY_NOT_FOUND;
        if( !sliceInstances.containsKey(sliceName) ) return ENTRY_NOT_FOUND;

        SliceGroup sliceGroup = sliceGroups.get(groupName);
        PonPort ponPort = sliceGroup.getPonPort();
        SliceInstance sliceInstance = sliceGroup.getSliceInstance(sliceName);

        int maxAllowableBandwidth =
                ponPort.getRemainedBandwidth() + sliceInstance.getAllocatedBandwidth();
        int minAllowableBandwidth =
                sliceInstance.getAllocatedBandwidth() - sliceInstance.getRemainedBandwidth();

        if( maxAllowableBandwidth < newAllocBandwidth ) return INSUFFICIENT_BANDWIDTH;
        if( minAllowableBandwidth > newAllocBandwidth ) return OVERFLOW_BANDWIDTH;

        sliceInstance.updateAllocatedBandwidth(newAllocBandwidth);

        return SUCCESS;
    }

    public SliceInstance getSliceInstance(String groupName, String sliceName) {
//        return sliceInstances.get(sliceName);
        if( sliceGroups.containsKey(groupName) ) {
             return sliceGroups.get(groupName).getSliceInstance(sliceName);
        }

        return null;
    }

    public SliceInstance getSliceInstance(String sliceName) {
        return sliceInstances.get(sliceName);
    }

    public SliceGroup getSliceGroup(String sliceGroup) {
        return this.sliceGroups.get(sliceGroup);
    }

    public List<String> getSliceInstances() {
        return (List<String>) sliceInstances.keys();
    }
    public List<DeviceId> getOLTDeviceIds() { return (List<DeviceId>) oltDevices.keys(); }
    public OLTDevice getOLTDevice(DeviceId deviceId) { return oltDevices.get(deviceId); }

    public List<String> getPonPortNames() { return (List<String>) ponPorts.keys(); }
    public PonPort getPonPort(String ponPortName) { return ponPorts.get(ponPortName); }
}
