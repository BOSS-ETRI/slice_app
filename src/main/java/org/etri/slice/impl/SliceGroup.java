package org.etri.slice.impl;

import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SliceGroup extends BandwidthModifier{

    int sliceId;
    String groupName;
    OLTDevice deviceId;
    PonPort ponPort;
    int totalBandwidth;

    ConcurrentHashMap<String, SliceInstance> sliceInstances;

    public SliceGroup(String groupName, int sliceId, OLTDevice deviceId, PonPort ponPort, int totalBandwidth) {
        this.groupName = groupName;
        this.sliceId = sliceId;
        this.deviceId = deviceId;
        this.ponPort = ponPort;
        this.remainedBandwidth = totalBandwidth;
        this.allocBandwidth = totalBandwidth;
        this.sliceInstances = new ConcurrentHashMap<>();
    }

    public void addSliceInstance(String sliceName, SliceInstance instance) {
        this.sliceInstances.put(sliceName, instance);
    }

    public SliceInstance getSliceInstance(String sliceName) {
        return this.sliceInstances.get(sliceName);
    }
    public List<SliceInstance> getSliceInstances() {
        return new ArrayList<>(this.sliceInstances.values());
    }

    public PonPort getPonPort() {
        return this.ponPort;
    }

    public int getSliceId() {
        return this.sliceId;
    }

    public String getDeviceId() {
        return this.deviceId.getDeviceId();
    }
    public String getName() { return this.groupName; }
}
