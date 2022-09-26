package org.etri.onosslice.slice.impl;

import static org.etri.slice.impl.C.*;

import org.etri.slice.impl.BandwidthUtil;
import org.etri.slice.impl.OLTDevice;
import org.etri.slice.impl.PonPort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import static org.etri.slice.impl.C.BW_UNIT.*;
import static org.etri.slice.impl.C.PORT_TYPE.*;
import static org.etri.slice.impl.C.RESULTS.*;
import static org.slf4j.LoggerFactory.getLogger;

@RunWith(MockitoJUnitRunner.class)
public class PonPortTest {
    private final Logger log = getLogger(getClass());

    @Test
    public void testPortCreationBandwidth() {
        DeviceId devId = DeviceId.deviceId("test-device");
        PonPort ponPort1 = new PonPort(devId, PORT_1G, "port-1");
        PonPort ponPort10 = new PonPort(devId, PORT_10G, "port-2");
        PonPort ponPort25 = new PonPort(devId, PORT_25G, "port-3");
        PonPort ponPort50 = new PonPort(devId, PORT_50G, "port-4");

        Assert.assertEquals(ponPort1.getRemainedBandwidth(), MAX_BW_1G);
        Assert.assertEquals(ponPort10.getRemainedBandwidth(), MAX_BW_10G);
        Assert.assertEquals(ponPort25.getRemainedBandwidth(), MAX_BW_25G);
        Assert.assertEquals(ponPort50.getRemainedBandwidth(), MAX_BW_50G);
    }


    @Test
    public void testAddBandwidthTo1G() {
        DeviceId devId = DeviceId.deviceId("test-device");
        PonPort ponPort1 = new PonPort(devId, PORT_1G, "port-1");

        RESULTS result = ponPort1.updateRemainedBandwidth(BW_UPDATE_OP.ADD,
                                                          BandwidthUtil.getKilobytesFrom(2, GB));
        Assert.assertEquals(INSUFFICIENT_BANDWIDTH, result);
        Assert.assertEquals(ponPort1.getRemainedBandwidth(), BandwidthUtil.getKilobytesFrom(1, GB));

        result = ponPort1.updateRemainedBandwidth(BW_UPDATE_OP.ADD,
                                                  BandwidthUtil.getKilobytesFrom(100, MB));
        Assert.assertEquals(SUCCESS, result);
        Assert.assertEquals(ponPort1.getRemainedBandwidth(), BandwidthUtil.getKilobytesFrom((1024-100), MB));

        result = ponPort1.updateRemainedBandwidth(BW_UPDATE_OP.ADD,
                                                  BandwidthUtil.getKilobytesFrom(100, MB));
        Assert.assertEquals(SUCCESS, result);
        Assert.assertEquals(ponPort1.getRemainedBandwidth(), BandwidthUtil.getKilobytesFrom((1024-200), MB));

        result = ponPort1.updateRemainedBandwidth(BW_UPDATE_OP.ADD,
                                                  BandwidthUtil.getKilobytesFrom((1024-200+1), MB));
        Assert.assertEquals(INSUFFICIENT_BANDWIDTH, result);
        Assert.assertEquals(ponPort1.getRemainedBandwidth(), BandwidthUtil.getKilobytesFrom((1024-200), MB));

        result = ponPort1.updateRemainedBandwidth(BW_UPDATE_OP.ADD,
                                                  BandwidthUtil.getKilobytesFrom((1024-200), MB));
        Assert.assertEquals(SUCCESS, result);
        Assert.assertEquals(ponPort1.getRemainedBandwidth(), 0);
    }
}
