/*
 * Copyright 2021-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.etri.slice.impl;

import org.etri.onosslice.sliceservice.ONOSSliceService;
import org.etri.onosslice.sliceservice.ONOSSliceService.UniTags;
import org.etri.onosslice.sliceservice.ONOSSliceService.BandwidthInfos;
import org.etri.sis.*;
import org.onlab.packet.VlanId;
import org.onosproject.cfg.ComponentConfigService;
import org.onosproject.core.CoreService;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.onosproject.net.*;

import java.util.*;

import org.onosproject.utils.Comparators;
import org.opencord.aaa.AuthenticationService;
import org.opencord.aaa.AuthenticationRecord;
import org.opencord.olt.AccessDeviceService;
import org.opencord.olt.AccessDevicePort;
import org.opencord.olt.ServiceKey;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.etri.slice.api.SliceCtrlService;
import org.onosproject.net.device.DeviceService;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static org.etri.slice.impl.C.RESULTS.SUCCESS;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_BP_ID_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_MCAST_SERVICE_NAME_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.EAPOL_DELETE_RETRY_MAX_ATTEMPS_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.PROVISION_DELAY_DEFAULT;
import static org.onlab.util.Tools.get;

import static com.google.common.collect.Lists.newArrayList;
/**
 * Skeletal ONOS application component.
 */
@Component(immediate = true)
public class Slice implements SliceCtrlService {
    private static final String SADIS_NOT_RUNNING = "Sadis is not running";

    private static final String SLICE_APP = "org.etri.slice";

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected CoreService coreService;

    private final Logger log = LoggerFactory.getLogger(getClass());
    protected String defaultBpId = DEFAULT_BP_ID_DEFAULT;
    protected String multicastServiceName = DEFAULT_MCAST_SERVICE_NAME_DEFAULT;
    protected int eapolDeleteRetryMaxAttempts = EAPOL_DELETE_RETRY_MAX_ATTEMPS_DEFAULT;
    protected int provisionDelay = PROVISION_DELAY_DEFAULT;
    /** Some configurable property. */
    private String someProperty;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected ComponentConfigService cfgService;

    @Reference(cardinality = ReferenceCardinality.OPTIONAL,
            bind = "bindSadisService",
            unbind = "unbindSadisService",
            policy = ReferencePolicy.DYNAMIC)
    protected volatile SadisService sadisService;

    @Reference(cardinality = ReferenceCardinality.OPTIONAL,
            bind = "bindAccessDeviceService",
            unbind = "unbindAccessDeviceService",
            policy = ReferencePolicy.DYNAMIC)
    protected volatile AccessDeviceService accessDeviceService;

    @Reference(cardinality = ReferenceCardinality.OPTIONAL,
            bind = "bindAuthenticationService",
            unbind = "unbindAuthenticationService",
            policy = ReferencePolicy.DYNAMIC)
    protected volatile AuthenticationService authenticationService;

    @Reference(cardinality = ReferenceCardinality.OPTIONAL,
            bind = "bindDeviceService",
            unbind = "unbindDeviceService",
            policy = ReferencePolicy.DYNAMIC)
    protected volatile DeviceService deviceService;


    protected BaseInformationService<SliceProfileInformation> sliceService;
    protected BaseInformationService<SubscriberAndDeviceInformation> subsService;
    protected BaseInformationService<BandwidthProfileInformation> bpService;
    protected volthaMgmtGrpcClient client;

    /**   ETRI  **/
//    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected Manager manager;

    @Activate
    protected void activate() {
        this.coreService.registerApplication(SLICE_APP);
//        cfgService.registerProperties(getClass());

        manager = new Manager(7);
        client = new volthaMgmtGrpcClient(log);
        client.RequestDeviceStatus(manager);
        log.info("Started");
    }

    @Deactivate
    protected void deactivate() {
        cfgService.unregisterProperties(getClass(), false);
        client.shutdown();
        log.info("Stopped");
    }

    @Modified
    public void modified(ComponentContext context) {
        Dictionary<?, ?> properties = context != null ? context.getProperties() : new Properties();
        if (context != null) {
            someProperty = get(properties, "someProperty");
        }
        log.info("Reconfigured");
    }

    protected void bindSadisService(SadisService service) {
        sadisService = service;
        sliceService = sadisService.getSliceProfileService();
        subsService = sadisService.getSubscriberInfoService();
        bpService = sadisService.getBandwidthProfileService();
        if( bpService == null ) {
            log.info("bp service is null");
        }
        log.info("Sadis-service binds to slice app.");
    }

    protected void unbindSadisService(SadisService service) {
        sadisService = null;
        sliceService = null;
        subsService = null;
        bpService = null;
        log.info("Sadis-service unbinds from slice app.");
    }

    protected void bindAccessDeviceService(AccessDeviceService service) {
        accessDeviceService = service;
        log.info("accessDeviceService binds to slice app.");
    }

    protected void unbindAccessDeviceService(AccessDeviceService service) {
        accessDeviceService = null;
        log.info("accessDeviceService unbinds from slice app.");
    }

    protected void bindAuthenticationService(AuthenticationService service) {
        authenticationService = service;
        log.info("authenticationService binds to slice app.");
    }

    protected void unbindAuthenticationService(AuthenticationService service) {
        authenticationService = null;
        log.info("authenticationService binds to slice app.");
    }

    protected void bindDeviceService(DeviceService service) {
        deviceService = service;
        log.info("deviceService binds to slice app.");
    }

    protected void unbindDeviceService(DeviceService service) {
        deviceService = null;
        log.info("deviceService binds to slice app.");
    }

    @Override
    public SliceProfileInformation provisionSlice(String sliceName) {
        if (sliceService == null) {
            log.warn(SADIS_NOT_RUNNING);
            return null;
        }

        SliceProfileInformation info = sliceService.get(sliceName);
	    return info;
    }
    @Override
    public AddSliceResponse addSlice(AddSliceRequest request) {

    	AddSliceResponse response = client.AddSlice(request);
    	return response;
    }

    public SliceInstance getSliceInstance(String sliceName) {
        return manager.getSliceInstance(sliceName);
    }

    public List<SliceInstance> getSliceInstances() {
        List<String> instanceNames = manager.getSliceInstances();
        List<SliceInstance> sliceInstances = new LinkedList<>();

        for( String instanceName : instanceNames ) {
            sliceInstances.add(manager.getSliceInstance(instanceName));
        }

        return sliceInstances;
    }

    public List<OLTDevice> getOLTDevices() {
        List<DeviceId> deviceIds = manager.getOLTDeviceIds();
        List<OLTDevice> oltDevices = new LinkedList<>();

        for( DeviceId deviceId : deviceIds ) {
            oltDevices.add(manager.getOLTDevice(deviceId));
        }

        return oltDevices;
    }

    @Override
    public C.RESULTS addOLTDevice(DeviceId deviceId, C.WB_TYPE wbType) {
        return manager.addOLTDevice(deviceId, wbType);
    }

    @Override
    public C.RESULTS addPonPort(DeviceId deviceId, String portName) {
        return manager.addPonPort(deviceId, portName);
    }

    @Override
    public C.RESULTS addSliceInstance(
            String sliceName, DeviceId deviceId,
            String ponPortName, String uniPortName,
            int fixedBandwidth, int assuredBandwidth, int surplusBandwidth, C.DBA_ALG dba) {
        C.RESULTS result =
                manager.addSliceInstance(
                        sliceName, deviceId,
                        ponPortName, uniPortName,
                        fixedBandwidth+assuredBandwidth, dba
                );

        if( result == SUCCESS ) {
            SliceProfileInformation spi = sliceService.get(sliceName);

            // send request to VOLTHA
            AddSliceRequest.Builder reqBuilder = AddSliceRequest.newBuilder()
                    .setSliceName(sliceName)
                    .setDeviceId(deviceId.toString())
                    .setSliceId(manager.getSliceInstance(sliceName).getSliceId())
                    .setPortName(ponPortName)
                    .setTags(UniTags.newBuilder()
                            .setUniPortName(uniPortName)
                            .setDbaType(dba.toString())
                            .build())
                    .setBwInfos(BandwidthInfos.newBuilder()
                            .setRf(fixedBandwidth)
                            .setRa(assuredBandwidth)
                            .setRs(surplusBandwidth)
                            .build());

            String tConts = spi.trafficContainers();
            if(tConts != null) {
                ListIterator<String> it = Arrays.asList(tConts.split(",", -1)).listIterator();
                while (it.hasNext()) {
                    reqBuilder.addTrafficContainers(Integer.parseInt(it.next()));
                }
            }

            AddSliceRequest request = reqBuilder.build();
//            AddSliceResponse response = client.AddSlice(request);
        }

        return result;
    }

    @Override
    public C.RESULTS updateBWOfSliceInstance(
            String sliceName, DeviceId deviceId,
            String ponPortName, int reqBandwidth) {
        C.RESULTS result = manager.updateAllocatedBandwidth(
                sliceName, deviceId, ponPortName, reqBandwidth
        );

        return result;
    }


    @Override
    public C.RESULTS provisionSubscriber(ConnectPoint cp) {
        final Comparator<AuthenticationRecord> authenticationRecordComparator =
                (a1, a2) -> Comparators.CONNECT_POINT_COMPARATOR.
                        compare(a1.supplicantConnectPoint(), a2.supplicantConnectPoint());

        List<AuthenticationRecord> authentications =
                newArrayList(authenticationService.getAuthenticationRecords());
        authentications.sort(authenticationRecordComparator);

        authentications = authentications.stream()
                .filter(a -> a.supplicantConnectPoint().deviceId().equals(cp.deviceId()))
                .filter(a -> a.supplicantConnectPoint().port().equals(cp.port()))
                .collect(Collectors.toList());

        AuthenticationRecord targetAuth = authentications.get(0);

        if (targetAuth == null) {
            log.info("There is no (%s) Connect Point found", cp);
            return C.RESULTS.ENTRY_NOT_FOUND;
        }

        String portName = deviceService.getPort(targetAuth.supplicantConnectPoint()).
                annotations().value(AnnotationKeys.PORT_NAME);
        SubscriberAndDeviceInformation subscriber = subsService.get(portName);

        if (subscriber == null) {
            log.error("Subscriber information not found in sis for port {%s}", portName);
            return C.RESULTS.ENTRY_NOT_FOUND;
        }

        log.info(portName);

        String upSliceProfile = null;
        String upBandwidthProfile = null;

        log.info("UNI Tag List Size: " + subscriber.uniTagList().size());
        UniTagInformation uti = subscriber.uniTagList().get(0);
        log.info("UNI Tag List:");
        log.info(uti.toString());
        upSliceProfile = uti.getUpstreamSliceProfile();
        upBandwidthProfile = uti.getUpstreamBandwidthProfile();

        if( upSliceProfile == null || upBandwidthProfile == null) {
            return C.RESULTS.ENTRY_NOT_FOUND;
        }

        log.info(upSliceProfile);
        log.info(upBandwidthProfile);

        BandwidthProfileInformation bpi = bpService.get(upBandwidthProfile);
        SliceProfileInformation spi = sliceService.get(upSliceProfile);

        if( bpi == null || spi == null ) {
            return C.RESULTS.ENTRY_NOT_FOUND;
        }

        log.info(bpi.toString());
        log.info(spi.toString());

        long reqCir = bpi.committedInformationRate();
        SliceInstance sliceInstance = manager.getSliceInstance(upSliceProfile);

        if (sliceInstance == null) {
            log.info("Slice instance(" + upSliceProfile + ") has not been created yet");
            return C.RESULTS.ENTRY_NOT_FOUND;
        }

        C.RESULTS result = sliceInstance.updateRemainedBandwidth(C.BW_UPDATE_OP.ADD, (int)reqCir);
        if (result == C.RESULTS.INSUFFICIENT_BANDWIDTH) {
            log.info("Bandwidth is insufficient in the slice instance (" + upSliceProfile + ")");
            return C.RESULTS.INSUFFICIENT_BANDWIDTH;
        }

        sliceInstance.addSubscriber(portName, (int)reqCir);

        accessDeviceService.provisionSubscriber(cp);
        return null;
    }

    @Override
    public C.RESULTS provisionSubscriber(ConnectPoint cp, VlanId cTag, VlanId sTag, Integer tpId) {
        return null;
    }
}
