package org.etri.slice.impl;

import static org.etri.slice.impl.C.BW_UPDATE_OP;
import static org.etri.slice.impl.C.RESULTS.*;

public class BandwidthModifier {

    protected int allocBandwidth;
    protected int remainedBandwidth;

    public C.RESULTS updateRemainedBandwidth(BW_UPDATE_OP op, int reqBandwidth) {
        switch (op) {
            case ADD:
                if(reqBandwidth > remainedBandwidth) return INSUFFICIENT_BANDWIDTH;
                remainedBandwidth -= reqBandwidth;
                break;

            case DROP:
                if(remainedBandwidth == allocBandwidth && reqBandwidth > 0) return OVERFLOW_BANDWIDTH;
                remainedBandwidth += reqBandwidth;
                break;
        }

        return SUCCESS;
    }

    public C.RESULTS updateAllocatedBandwidth(int reqBandwidth) {
        if( reqBandwidth > allocBandwidth ) {
            allocBandwidth += reqBandwidth;
            remainedBandwidth += reqBandwidth;
        }
        else if ( reqBandwidth < allocBandwidth ) {
            allocBandwidth -= reqBandwidth;
            remainedBandwidth -= reqBandwidth;
        }

        return SUCCESS;
    }

    public int getRemainedBandwidth() {
        return this.remainedBandwidth;
    }
    public int getAllocatedBandwidth() { return this.allocBandwidth; }
}
