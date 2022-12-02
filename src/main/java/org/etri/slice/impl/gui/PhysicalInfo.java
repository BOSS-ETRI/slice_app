package org.etri.slice.impl.gui;

import java.util.ArrayList;
import java.util.List;

public class PhysicalInfo {
    public String DeviceId;
    public String DeviceType;
    public String ParentId;
    public int PortNum;
    public List<String> DeviceIds = new ArrayList<>();

    PhysicalInfo() {

    }

    public String getOLTId() {
        return "of:0000" + this.ParentId.replaceAll(":", "");
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("PhysicalInfo{");
        sb.append("deviceId=").append(DeviceId);
        sb.append(", deviceType=").append(DeviceType);
        sb.append(", parentId=").append(ParentId);
        sb.append(", portNum=").append(PortNum);
        sb.append(", DeviceIds=").append(DeviceIds);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(PhysicalInfo other) {
        return this.ParentId.equals(other.ParentId) && this.DeviceId.equals(other.DeviceId);
    }

    public boolean equalOLTDifferentONU(PhysicalInfo other) {
        return this.ParentId.equals(other.ParentId) && !this.DeviceId.equals(other.DeviceId);
    }
}