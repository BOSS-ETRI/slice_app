package org.etri.slice.impl;

import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import static org.etri.slice.impl.C.*;
import static org.slf4j.LoggerFactory.getLogger;

public class PonPort extends BandwidthModifier{
    private DeviceId deviceId;
    private String portName;

    private final Logger log = getLogger(getClass());

    public PonPort(DeviceId oltDeviceId, PORT_TYPE portType, String portName) {
        this.deviceId = oltDeviceId;
        this.portName = portName;

        switch (portType) {
            case PORT_1G:
                this.allocBandwidth = MAX_BW_1G;
                break;

            case PORT_10G:
                this.allocBandwidth = MAX_BW_10G;
                break;

            case PORT_25G:
                this.allocBandwidth = MAX_BW_25G;
                break;

            case PORT_50G:
                this.allocBandwidth = MAX_BW_50G;
                break;
        }

        this.remainedBandwidth = this.allocBandwidth;
    }

    public DeviceId getDeviceId() {
        return this.deviceId;
    }

    public String getPortName() {
        return this.portName;
    }
}
