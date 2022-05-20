package org.etri.slice.impl;

public class C {
    public static int MINIMUM_BANDWIDTH = 0;
    public static int MAX_BW_1G = (1 * 1024 * 1024); // kBps for 1G WB-OLT
    public static int MAX_BW_10G = (10 * 1024 * 1024); // kBps for 10G WB-OLT
    public static int MAX_BW_25G = (25 * 1024 * 1024); // kBps for 25G WB-OLT
    public static int MAX_BW_50G = (50 * 1024 * 1024); // kBps for 50G WB-OLT
    public static String DEFAULT_SLICE_NAME = "default";

    public enum DBA_ALG {
        S_DBA,
        SR_DBA,
        CO_DBA
    }
    public enum BW_UPDATE_OP {
        ADD,
        DROP
    }

    public enum WB_TYPE {
        OLT_1G,
        OLT_10G,
        OLT_25G,
        OLT_50G
    }
    public enum PORT_TYPE {
        PORT_1G,
        PORT_10G,
        PORT_25G,
        PORT_50G
    }
    public enum MAX_TCONT {
        NUM_1(1), NUM_4(4), NUM_8(8), NUM_16(16);
        MAX_TCONT(int value) { this.value = value; }
        private final int value;
        public int value() { return value; }
    }

    public enum RESULTS {
        SUCCESS,
        SUBSCRIBER_EXIST,
        SUBSCRIBER_NOT_EXIST,
        INSUFFICIENT_BANDWIDTH,
        OVERFLOW_BANDWIDTH,
        INSUFFICIENT_TCONT,
        WRONG_INPUT
    }
}
