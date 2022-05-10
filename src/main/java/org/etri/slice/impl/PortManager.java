package org.etri.slice.impl;

import org.onosproject.net.DeviceId;

public class PortManager {
    public enum WB_TYPE {
        OLT_10G,
        OLT_25G
    }

    public static String DEFAULT_SLICE_NAME = "default";
    public static int MAX_BANDWIDTH_10G = (10 * 1024 * 1024); // kBps for 10G WB-OLT
    public static int MAX_BANDWIDTH_25G = (25 * 1024 * 1024); // kBps for 25G WB-OLT

    private DeviceId deviceId;
    private String portNumber;

    private int maxBandwidth;
    private int usedBandwidth;

    PortManager(DeviceId oltDeviceId, WB_TYPE wbType, String portNumber) {
        this.deviceId = oltDeviceId;
        this.portNumber = portNumber;

        switch (wbType) {
            case OLT_10G:
                this.maxBandwidth = MAX_BANDWIDTH_10G;
                break;

            case OLT_25G:
                this.maxBandwidth = MAX_BANDWIDTH_25G;
                break;
        }
    }
}
