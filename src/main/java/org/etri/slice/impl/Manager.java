package org.etri.slice.impl;

import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

import static org.etri.slice.impl.C.BW_UNIT.GB;
import static org.etri.slice.impl.C.BW_UPDATE_OP.ADD;
import static org.etri.slice.impl.C.RESULTS.*;

public class Manager {
    public static int MAX_OLT_NUMBERS = 1000;
    public static int MAX_ONU_NUMBERS = 10000;
    private int maxSlices;
    private int maxOlts;
    private int maxOnus;
    private int numberOfSlices;
    private int numberOfOLTs;
    private int numberOfONUs;
    private ConcurrentHashMap<String, SliceGroup> sliceGroups;
    private ConcurrentHashMap<String, SliceInstance> sliceInstances;
    private ConcurrentHashMap<DeviceId, OLTDevice> oltDevices;
    private ConcurrentHashMap<DeviceId, Integer> onuDevices;
    private ConcurrentHashMap<String, PonPort> ponPorts;
    private ConcurrentHashMap<Integer, C.USED> sliceIds;
    private ConcurrentHashMap<Integer, C.USED> oltIds;
    private ConcurrentHashMap<Integer, C.USED> onuIds;

    public Manager(int maxSlices) {
        this.maxSlices = maxSlices;
        this.maxOlts = MAX_OLT_NUMBERS;
        this.maxOnus = MAX_ONU_NUMBERS;

        numberOfSlices = 0;
        numberOfOLTs = 0;
        numberOfONUs = 0;
        sliceGroups = new ConcurrentHashMap<>();
        sliceInstances = new ConcurrentHashMap<>();
        oltDevices = new ConcurrentHashMap<>();
        onuDevices = new ConcurrentHashMap<>();
        ponPorts = new ConcurrentHashMap<>();
        sliceIds = new ConcurrentHashMap<>();
        oltIds = new ConcurrentHashMap<>();
        onuIds = new ConcurrentHashMap<>();

        for( int n = 0; n < maxSlices; n++ ) {
            sliceIds.putIfAbsent(n, C.USED.NO);
        }

        for( int n = 0; n < maxOlts; n++ ) {
            oltIds.putIfAbsent(n, C.USED.NO);
        }

        for( int n = 0; n < maxOnus; n++ ) {
            onuIds.putIfAbsent(n, C.USED.NO);
        }
    }

    private int getEmptyONUId(boolean mark) {
        int onuId = -1;

        if( numberOfONUs < maxOnus ) {
            for (Integer id : onuIds.keySet()) {
                if (onuIds.get(id) == C.USED.NO) {
                    onuId = id;

                    if (mark) {
                        onuIds.put(id, C.USED.YES);
                        numberOfONUs = numberOfONUs + 1;
                    }

                    break;
                }
            }
        }

        return onuId;
    }

    public String getEmptyONUName(String onuSerialNum, boolean mark) {
        DeviceId deviceId = DeviceId.deviceId(onuSerialNum);

        if( onuDevices.containsKey(deviceId) ) {
            return "ONU-" + onuDevices.get(deviceId);
        }

        int onuId = getEmptyONUId(mark);
        onuDevices.put(deviceId, onuId);
        return "ONU-" + onuId;
    }

    private int getEmptyOLTId(boolean mark) {
        int oltId = -1;

        if( numberOfOLTs < maxOlts ) {
            for (Integer id : oltIds.keySet()) {
                if (oltIds.get(id) == C.USED.NO) {
                    oltId = id;

                    if (mark) {
                        oltIds.put(id, C.USED.YES);
                        numberOfOLTs = numberOfOLTs + 1;
                    }

                    break;
                }
            }
        }

        return oltId;
    }

    private String getEmptyOLTName(boolean mark) {
        int oltId = getEmptyOLTId(mark);
        return "OLT-" + oltId;
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

        OLTDevice newDevice = new OLTDevice(deviceId, wbType, getEmptyOLTName(true));
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
            SliceInstance newInstance = new SliceInstance(
                    sliceGroup,
                    sliceName,
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
        return new ArrayList<>(sliceInstances.keySet());
    }
    public List<DeviceId> getOLTDeviceIds() { return new ArrayList<>(oltDevices.keySet()); }
    public OLTDevice getOLTDevice(DeviceId deviceId) { return oltDevices.get(deviceId); }
    public OLTDevice getOLTDevice(String macAddress) {
        DeviceId deviceId = DeviceId.deviceId(macAddress);
        return oltDevices.get(deviceId);
    }
    public String getOLTDeviceName(String macAddress) {
        DeviceId deviceId = DeviceId.deviceId(macAddress);
        if( !oltDevices.containsKey(deviceId) ) {
            return null;
        }
        return oltDevices.get(deviceId).getName();
    }

    public List<String> getPonPortNames() { return (List<String>) ponPorts.keys(); }
    public PonPort getPonPort(String ponPortName) { return ponPorts.get(ponPortName); }
}
