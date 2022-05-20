package org.etri.onosslice.slice.impl;

import org.apache.commons.lang3.Range;
import org.etri.slice.impl.C;
import org.etri.slice.impl.OLTDevice;
import org.etri.slice.impl.PonPort;
import org.etri.slice.impl.TCont;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.slf4j.LoggerFactory.getLogger;

@RunWith(MockitoJUnitRunner.class)
public class OLTDeviceTest {

    private final Logger log = getLogger(getClass());

    @Test
    public void test10DevicePortAdd() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, C.WB_TYPE.OLT_10G);

        devManager.addPort("port-1", null, C.MAX_TCONT.NUM_1, 1 , 100);
        devManager.addPort("port-2", null, C.MAX_TCONT.NUM_1, 1 , 100);
        Assert.assertNotNull(devManager.getPonPort("port-1"));
        Assert.assertNotNull(devManager.getPonPort("port-2"));
        Assert.assertNull(devManager.getPonPort("port-3"));

        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), C.MAX_BW_10G);
        PonPort port2 = devManager.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), C.MAX_BW_10G);
    }

    @Test
    public void test25DevicePortAdd() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, C.WB_TYPE.OLT_25G);

        devManager.addPort("port-1", null, C.MAX_TCONT.NUM_1, 1 , 100);
        devManager.addPort("port-2", null, C.MAX_TCONT.NUM_1, 1 , 100);
        Assert.assertNotNull(devManager.getPonPort("port-1"));
        Assert.assertNotNull(devManager.getPonPort("port-2"));
        Assert.assertNull(devManager.getPonPort("port-3"));

        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), C.MAX_BW_25G);
        PonPort port2 = devManager.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), C.MAX_BW_25G);
    }

    @Test
    public void test10_25GDevicePortAdd() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, C.WB_TYPE.OLT_25G);

        devManager.addPort("port-1", C.PORT_TYPE.PORT_10G, C.MAX_TCONT.NUM_1, 1 , 100);
        devManager.addPort("port-2", null, C.MAX_TCONT.NUM_1, 1 , 100);
        Assert.assertNotNull(devManager.getPonPort("port-1"));
        Assert.assertNotNull(devManager.getPonPort("port-2"));
        Assert.assertNull(devManager.getPonPort("port-3"));

        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.getRemainedBandwidth(), C.MAX_BW_10G);
        PonPort port2 = devManager.getPonPort("port-2");
        Assert.assertEquals(port2.getRemainedBandwidth(), C.MAX_BW_25G);
    }

    @Test
    public void testPortTcontAdd1() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, C.WB_TYPE.OLT_25G);

        devManager.addPort("port-1", null, C.MAX_TCONT.NUM_1, 1, 100);
        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.SUCCESS);
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.INSUFFICIENT_TCONT);

        Range<Integer> range = Range.between(1, 100);

        for(TCont tcont: port1.getTconts().values()) {
            Assert.assertTrue(range.contains(tcont.getAllocId()));
        }
    }

    @Test
    public void testPortTcontAdd2() {
        DeviceId devId = DeviceId.deviceId("test-device");
        OLTDevice devManager = new OLTDevice(devId, C.WB_TYPE.OLT_25G);

        devManager.addPort("port-1", null, C.MAX_TCONT.NUM_4, 1, 100);
        PonPort port1 = devManager.getPonPort("port-1");
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.SUCCESS);
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.SUCCESS);
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.SUCCESS);
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.SUCCESS);
        Assert.assertEquals(port1.addTCont(100), C.RESULTS.INSUFFICIENT_TCONT);

        Range<Integer> range = Range.between(1, 100);
        Set<Integer> allocIds = new HashSet<>();

        for(TCont tcont: port1.getTconts().values()) {
            allocIds.add(tcont.getAllocId());
            Assert.assertTrue(range.contains(tcont.getAllocId()));
        }

        Assert.assertTrue(allocIds.size() == 4);
    }
}