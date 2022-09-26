package org.etri.slice.impl;

import static org.etri.slice.impl.C.BW_UNIT;

public class BandwidthUtil {
    public static int getKilobytesFrom(int bandwidth, BW_UNIT unit) {
        if(unit == BW_UNIT.MB) {
            return bandwidth * 1024;
        }
        else if(unit == BW_UNIT.GB) {
            return bandwidth * 1024 * 1024;
        }

        return -1;
    }
}
