package org.etri.slice.impl;

public class BandwidthModifier {

    protected int allocBandwidth;
    protected int remainedBandwidth;

    protected C.RESULTS updateRemainedBandwidth(C.BW_UPDATE_OP op, int reqBandwidth) {
        switch (op) {
            case ADD:
                if(reqBandwidth > remainedBandwidth) return C.RESULTS.INSUFFICIENT_BANDWIDTH;
                remainedBandwidth -= reqBandwidth;
                break;

            case DROP:
                if(remainedBandwidth == allocBandwidth && reqBandwidth > 0) return C.RESULTS.OVERFLOW_BANDWIDTH;
                remainedBandwidth += reqBandwidth;
                break;
        }

        return C.RESULTS.SUCCESS;
    }

    public int getRemainedBandwidth() {
        return this.remainedBandwidth;
    }
}
