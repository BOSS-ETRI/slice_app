package org.etri.onosslice.slice.impl;

import org.etri.slice.impl.C;
import org.etri.slice.impl.OLTDevice;
import org.etri.slice.impl.PonPort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import static org.etri.slice.impl.C.*;
import static org.etri.slice.impl.C.WB_TYPE.*;
import static org.slf4j.LoggerFactory.getLogger;

@RunWith(MockitoJUnitRunner.class)
public class OLTDeviceTest {

    private final Logger log = getLogger(getClass());

    @Test
    public void test10DevicePortAdd() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, OLT_10G);

        devManager.addPonPort("port-1");
        devManager.addPonPort("port-2");
        Assert.assertNotNull(devManager.getPonPort("port-1"));
        Assert.assertNotNull(devManager.getPonPort("port-2"));
        Assert.assertNull(devManager.getPonPort("port-3"));

        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), MAX_BW_10G);
        PonPort port2 = devManager.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), MAX_BW_10G);
    }

    @Test
    public void test25DevicePortAdd() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, OLT_25G);

        devManager.addPonPort("port-1");
        devManager.addPonPort("port-2");
        Assert.assertNotNull(devManager.getPonPort("port-1"));
        Assert.assertNotNull(devManager.getPonPort("port-2"));
        Assert.assertNull(devManager.getPonPort("port-3"));

        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), MAX_BW_25G);
        PonPort port2 = devManager.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), MAX_BW_25G);
    }

    @Test
    public void testTwoDevicesPortAdd() {
        DeviceId devId1 = DeviceId.deviceId("test-device1");
        DeviceId devId2 = DeviceId.deviceId("test-device2");
        OLTDevice devManager1 = new OLTDevice(devId1, OLT_10G);
        OLTDevice devManager2 = new OLTDevice(devId2, OLT_25G);

        devManager1.addPonPort("port-1");
        devManager2.addPonPort("port-2");
        Assert.assertNotNull(devManager1.getPonPort("port-1"));
        Assert.assertNotNull(devManager2.getPonPort("port-2"));
        Assert.assertNull(devManager1.getPonPort("port-2"));
        Assert.assertNull(devManager2.getPonPort("port-1"));

        PonPort port1 = devManager1.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), MAX_BW_10G);
        PonPort port2 = devManager2.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), MAX_BW_25G);
    }

}