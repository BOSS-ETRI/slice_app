package org.etri.slice.impl;

import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import java.util.concurrent.ConcurrentHashMap;

import static org.etri.slice.impl.C.PORT_TYPE.*;
import static org.slf4j.LoggerFactory.getLogger;

public class OLTDevice {
    private DeviceId deviceId;
    private C.WB_TYPE wbType;
    private ConcurrentHashMap<String, PonPort> ports; // port Name, PortManager

    private final Logger log = getLogger(getClass());
    public OLTDevice(DeviceId oltDeviceId, C.WB_TYPE wbType) {
        this.deviceId = oltDeviceId;
        this.wbType = wbType;
        this.ports = new ConcurrentHashMap<>();
    }

    public void addPonPort(String portName) {
        C.PORT_TYPE portType = null;

        switch (wbType) {
            case OLT_1G:
                portType = PORT_1G;
                break;

            case OLT_10G:
                portType = PORT_10G;
                break;

            case OLT_25G:
                portType = PORT_25G;
                break;

            case OLT_50G:
                portType = PORT_50G;
                break;
        }

        PonPort ponPort = new PonPort(this.deviceId, portType, portName);
        ports.putIfAbsent(portName, ponPort);
    }

    public PonPort getPonPort(String portName) {
        if(ports.containsKey(portName)) {
            return ports.get(portName);
        }

        return null;
    }

    public String getDeviceId() {
        return deviceId.toString();
    }
}
