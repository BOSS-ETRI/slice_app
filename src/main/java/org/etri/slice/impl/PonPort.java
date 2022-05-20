package org.etri.slice.impl;

import org.onosproject.net.DeviceId;
import org.slf4j.Logger;
import org.apache.commons.lang3.Range;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

import static org.etri.slice.impl.C.MAX_BW_10G;
import static org.etri.slice.impl.C.MAX_BW_25G;
import static org.slf4j.LoggerFactory.getLogger;

public class PonPort extends BandwidthModifier{
    private DeviceId deviceId;
    private String portName;

    private C.MAX_TCONT maxTCont;

    private ConcurrentHashMap<Integer, TCont> tconts;
    private Range<Integer> tcontAllocIdRange;

    private final Logger log = getLogger(getClass());

    public PonPort(DeviceId oltDeviceId, C.PORT_TYPE portType, String portName,
                   C.MAX_TCONT maxTCont, int tcontIdStart, int tcontIdEnd) {
        this.deviceId = oltDeviceId;
        this.portName = portName;
        this.maxTCont = maxTCont;
        this.tconts = new ConcurrentHashMap<>();
        this.tcontAllocIdRange = Range.between(tcontIdStart, tcontIdEnd);

        switch (portType) {
            case PORT_1G:
                this.allocBandwidth = C.MAX_BW_1G;
                break;

            case PORT_10G:
                this.allocBandwidth = C.MAX_BW_10G;
                break;

            case PORT_25G:
                this.allocBandwidth = C.MAX_BW_25G;
                break;

            case PORT_50G:
                this.allocBandwidth = C.MAX_BW_50G;
                break;
        }

        this.remainedBandwidth = this.allocBandwidth;
    }

    private boolean isTcontAllocIdDuplicate(int allocId) {
        if(tconts.containsKey(allocId)) return true;
        return false;
    }

    public C.RESULTS addTCont(int allocBandwidth) {
        if(tconts.size() == maxTCont.value()) return C.RESULTS.INSUFFICIENT_TCONT;

        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int allocId = tlr.nextInt(this.tcontAllocIdRange.getMinimum(),
                            this.tcontAllocIdRange.getMaximum()+1);

        while(isTcontAllocIdDuplicate(allocId)) {
            allocId = tlr.nextInt(this.tcontAllocIdRange.getMinimum(),
                            this.tcontAllocIdRange.getMaximum()+1);
        }

        TCont tcont = new TCont(allocId, allocBandwidth);
        tconts.putIfAbsent(allocId, tcont);

        return C.RESULTS.SUCCESS;
    }

    public ConcurrentHashMap<Integer, TCont> getTconts() {
        return this.tconts;
    }
}
