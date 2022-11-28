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
        Manager manager = new Manager(7);

        DeviceId devId = DeviceId.deviceId("test-device");
        C.RESULTS result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(SUCCESS, result);

        result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(DUPLICATE, result);
    }

    @Test
    public void testPonPortAdd() {
        Manager manager = new Manager(7);

        DeviceId devId = DeviceId.deviceId("test-device");
        C.RESULTS result = manager.addOLTDevice(devId, OLT_10G);
        Assert.assertEquals(SUCCESS, result);

        DeviceId devId2 = DeviceId.deviceId("test-device2");
        result = manager.addPonPort(devId, "pon-pont1");
        Assert.assertEquals(SUCCESS, result);

        result = manager.addPonPort(devId, "pon-pont1");
        Assert.assertEquals(DUPLICATE, result);

        result = manager.addPonPort(devId2, "pon-port1");
        Assert.assertEquals(ENTRY_NOT_FOUND, result);
    }

    @Test
    public void testSliceGroupAdd() {
        Manager manager = new Manager(7);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(ENTRY_NOT_FOUND, result);

        manager.addOLTDevice(devId, OLT_10G);
        result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(ENTRY_NOT_FOUND, result);

        manager.addPonPort(devId, ponPortName);
        result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(DUPLICATE, result);
    }

    @Test
    public void testSliceGroupAddMaxIds() {
        Manager manager = new Manager(2);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";
        manager.addOLTDevice(devId, OLT_10G);
        manager.addPonPort(devId, ponPortName);

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G2", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G3", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(FULL_ENTRY, result);
    }

    @Test
    public void testSliceGroupAddMax() {
        Manager manager = new Manager(2);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";
        manager.addOLTDevice(devId, OLT_10G);
        manager.addPonPort(devId, ponPortName);

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G2", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G3", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(FULL_ENTRY, result);
    }

    @Test
    public void testSliceGroupAddMaxBw() {
        Manager manager = new Manager(2);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";
        manager.addOLTDevice(devId, OLT_10G);
        manager.addPonPort(devId, ponPortName);

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(10, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceGroup("G2", devId, ponPortName, getKilobytesFrom(1, GB));
        Assert.assertEquals(WRONG_INPUT, result);
    }

    @Test
    public void testSliceInstanceAdd() {
        Manager manager = new Manager(1);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";
        manager.addOLTDevice(devId, OLT_10G);
        manager.addPonPort(devId, ponPortName);

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(3, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceInstance("G1", "M1", "uni-port1", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceInstance("G1", "M2", "uni-port2", getKilobytesFrom(2, GB), CO_DBA);
        Assert.assertEquals(SUCCESS, result);
    }

    @Test
    public void testSliceInstanceAddMaxBw() {
        Manager manager = new Manager(1);

        DeviceId devId = DeviceId.deviceId("test-device");
        String ponPortName = "pon-port1";
        manager.addOLTDevice(devId, OLT_10G);
        manager.addPonPort(devId, ponPortName);

        C.RESULTS result = manager.addSliceGroup("G1", devId, ponPortName, getKilobytesFrom(3, GB));
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceInstance("G1", "M1", "uni-port1", getKilobytesFrom(3, GB), CO_DBA);
        Assert.assertEquals(SUCCESS, result);

        result = manager.addSliceInstance("G1", "M2", "uni-port2", getKilobytesFrom(1, GB), CO_DBA);
        Assert.assertEquals(WRONG_INPUT, result);
    }
}
