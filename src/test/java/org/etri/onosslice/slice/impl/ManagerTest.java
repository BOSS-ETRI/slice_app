package org.etri.onosslice.slice.impl;

import org.etri.slice.impl.C;
import org.etri.slice.impl.Manager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import static org.etri.slice.impl.BandwidthUtil.getKilobytesFrom;
import static org.etri.slice.impl.C.BW_UNIT.GB;
import static org.etri.slice.impl.C.DBA_ALG.CO_DBA;
import static org.etri.slice.impl.C.RESULTS.*;
import static org.etri.slice.impl.C.WB_TYPE.OLT_10G;
import static org.slf4j.LoggerFactory.getLogger;

@RunWith(MockitoJUnitRunner.class)
public class ManagerTest {
    private final Logger log = getLogger(getClass());

    @Test
    public void testDeviceAdd() {
        Manager manager = new Manager();

        DeviceId devId = DeviceId.deviceId("test-device");
        C.RESULTS result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(result, SUCCESS);

        result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(result, DUPLICATE);
    }

    @Test
    public void testPonPortAdd() {
        Manager manager = new Manager();

        DeviceId devId = DeviceId.deviceId("test-device");
        C.RESULTS result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(result, SUCCESS);

        DeviceId devId2 = DeviceId.deviceId("test-device2");
        result = manager.addPonPort(devId, "pon-pont1");
        Assert.assertEquals(result, SUCCESS);

        result = manager.addPonPort(devId, "pon-pont1");
        Assert.assertEquals(result, DUPLICATE);

        result = manager.addPonPort(devId2, "pon-port1");
        Assert.assertEquals(result, ENTRY_NOT_FOUND);
    }

    @Test
    public void testSliceInstanceAdd() {
        Manager manager = new Manager();

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";

        C.RESULTS result = manager.addSliceInstance("R1", devId, ponPortName, "uni-port1", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(result, ENTRY_NOT_FOUND);

        manager.addOLTDevice(devId, OLT_10G);
        result = manager.addSliceInstance("R1", devId, ponPortName, "uni-port1", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(result, ENTRY_NOT_FOUND);

        manager.addPonPort(devId, ponPortName);
        result = manager.addSliceInstance("R1", devId, ponPortName, "uni-port1", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(result, SUCCESS);

        result = manager.addSliceInstance("R1", devId, ponPortName, "uni-port1", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(result, DUPLICATE);
    }
}
