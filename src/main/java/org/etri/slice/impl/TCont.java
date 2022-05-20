package org.etri.slice.impl;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class TCont {

    private int allocId;
    private int allocBandwidth;
    private int remainedBandwidth;

    private final Logger log = getLogger(getClass());

    public TCont(int allocId, int allocBandwidth) {
        this.allocId = allocId;
        this.allocBandwidth = allocBandwidth;
        this.remainedBandwidth = allocBandwidth;
    }

    public int getAllocId() {
        return this.allocId;
    }
}
