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

import com.google.gson.Gson;
import org.etri.onosslice.sliceservice.ONOSSliceService.UniTags;
import org.etri.onosslice.sliceservice.ONOSSliceService.BandwidthInfos;
import org.etri.sis.*;
import org.etri.slice.impl.gui.PhysicalInfo;
import org.etri.slice.impl.gui.SliceInstanceInfo;
import org.etri.slice.impl.gui.SubscriberInfo;
import org.onlab.packet.VlanId;
import org.onosproject.cfg.ComponentConfigService;
import org.onosproject.core.CoreService;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceGroupRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceGroupResponse;
import org.etri.onosslice.sliceservice.ONOSSliceService.GetETCDRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.ResultType;
import org.onosproject.net.*;

import java.util.*;

import org.onosproject.utils.Comparators;
import org.opencord.aaa.AuthenticationService;
import org.opencord.aaa.AuthenticationRecord;
import org.opencord.olt.AccessDeviceService;
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

import java.util.stream.Collectors;

import static org.etri.slice.impl.C.RESULTS.*;
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

    public SliceGroup getSliceGroup(String groupName) {
        return manager.getSliceGroup(groupName);
    }
    public SliceInstance getSliceInstance(String groupName, String sliceName) {
        return manager.getSliceInstance(groupName, sliceName);
    }

    public List<SliceInstance> getSliceInstances() {
        List<String> instanceNames = manager.getSliceInstances();
        List<SliceInstance> sliceInstances = new LinkedList<>();

        for( String instanceName : instanceNames ) {
            sliceInstances.add(manager.getSliceInstance(instanceName));
        }

        return sliceInstances;
    }

    public String getTrafficContainers(String sliceName) {
        SliceProfileInformation spi = sliceService.get(sliceName);
        return spi.trafficContainers();
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
    public C.RESULTS addSliceGroup(String groupName, DeviceId deviceId, String ponPortName, int totalBandwidth) {
        C.RESULTS result = manager.addSliceGroup(
                groupName, deviceId, ponPortName, totalBandwidth
        );

        if( result == SUCCESS ) {
            SliceGroup sliceGroup = manager.getSliceGroup(groupName);

            AddSliceGroupRequest.Builder reqBuilder = AddSliceGroupRequest.newBuilder()
                    .setSliceId(sliceGroup.getSliceId())
                    .setDeviceId(sliceGroup.getDeviceId())
                    .setPortName(sliceGroup.getPonPort().getPortName())
                    .setTotalBandwidth(sliceGroup.getAllocatedBandwidth());

            AddSliceGroupResponse response = client.AddSliceGroup(reqBuilder.build());

            if( response.getType() == ResultType.FAIL ) {
                return FAIL;
            }

            return SUCCESS;
        }

        return result;
    }

    @Override
    public C.RESULTS addSliceInstance(
            String groupName,
            String sliceName, String uniPortName,
            int fixedBandwidth, int assuredBandwidth, int surplusBandwidth, C.DBA_ALG dba) {
        C.RESULTS result =
                manager.addSliceInstance(
                        groupName, sliceName, uniPortName,
                        fixedBandwidth+assuredBandwidth, dba
                );

        if( result == SUCCESS ) {
            SliceProfileInformation spi = sliceService.get(sliceName);

            // send request to VOLTHA
            AddSliceRequest.Builder reqBuilder = AddSliceRequest.newBuilder()
                    .setSliceName(sliceName)
                    .setDeviceId(manager.getSliceGroup(groupName).getDeviceId().toString())
                    .setSliceId(manager.getSliceGroup(groupName).getSliceId())
                    .setPortName(manager.getSliceGroup(groupName).getPonPort().getPortName())
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
            AddSliceResponse response = client.AddSlice(request);

            if( response.getType() == ResultType.FAIL ) {
                return FAIL;
            }

            return SUCCESS;
        }

        return result;
    }

    @Override
    public C.RESULTS updateBWOfSliceInstance(
            String groupName, String sliceName, int reqBandwidth) {
        C.RESULTS result = manager.updateAllocatedBandwidth(
                groupName, sliceName, reqBandwidth
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

        if (authentications.size() == 0) {
            log.info("There is no " + cp + " Connect Point found");
            return ENTRY_NOT_FOUND;
        }

        AuthenticationRecord targetAuth = authentications.get(0);

        String portName = deviceService.getPort(targetAuth.supplicantConnectPoint()).
                annotations().value(AnnotationKeys.PORT_NAME);
        SubscriberAndDeviceInformation subscriber = subsService.get(portName);

        if (subscriber == null) {
            log.error("Subscriber information not found in sis for port " + portName);
            return ENTRY_NOT_FOUND;
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
            return ENTRY_NOT_FOUND;
        }

        log.info(upSliceProfile);
        log.info(upBandwidthProfile);

        BandwidthProfileInformation bpi = bpService.get(upBandwidthProfile);
        SliceProfileInformation spi = sliceService.get(upSliceProfile);

        if( bpi == null || spi == null ) {
            return ENTRY_NOT_FOUND;
        }

        log.info(bpi.toString());
        log.info(spi.toString());

        long reqCir = bpi.committedInformationRate();
        SliceInstance sliceInstance = manager.getSliceInstance(upSliceProfile);

        if (sliceInstance == null) {
            log.info("Slice instance(" + upSliceProfile + ") has not been created yet");
            return ENTRY_NOT_FOUND;
        }

        C.RESULTS result = sliceInstance.addSubscriber(portName, (int)reqCir);
        if( result != SUCCESS ) {
            return result;
        }

//        result = sliceInstance.updateRemainedBandwidth(C.BW_UPDATE_OP.ADD, (int)reqCir);
//        if (result != SUCCESS ) {
//            return result;
//        }

        accessDeviceService.provisionSubscriber(cp);

        return SUCCESS;
    }

    @Override
    public C.RESULTS provisionSubscriber(ConnectPoint cp, VlanId cTag, VlanId sTag, Integer tpId) {
        return null;
    }


    // for GUI
    public List<OLTDevice> getOLTDevices() {
        List<DeviceId> deviceIds = manager.getOLTDeviceIds();
        List<OLTDevice> oltDevices = new LinkedList<>();

        for( DeviceId deviceId : deviceIds ) {
            oltDevices.add(manager.getOLTDevice(deviceId));
        }

        return oltDevices;
    }

    public List<PhysicalInfo> getPhysicalInfo() {
        GetETCDRequest reqBuilder = GetETCDRequest.newBuilder().build();
        String physicalInfoJson = client.GetETCD(reqBuilder).getResults();

        if( physicalInfoJson == "null" ) {
            return null;
        }

        System.out.println("hello");
        System.out.println(physicalInfoJson);

        Gson gson = new Gson();
        PhysicalInfo[] physicalInfoArray = gson.fromJson(physicalInfoJson, PhysicalInfo[].class);
        for(int i=0; i<physicalInfoArray.length; i++) {
            System.out.println(physicalInfoArray[i]);
        }
        return Arrays.asList(physicalInfoArray);
    }
    public List<PhysicalInfo> removeDuplatePhysicalInfo(List<PhysicalInfo> physicalInfos) {
        List<PhysicalInfo> result = new ArrayList<>();

        for(PhysicalInfo info : physicalInfos) {
            String OfMacAddress = info.getOLTId();
            info.ParentId = manager.getOLTDeviceName(OfMacAddress);
            if (manager.getOLTDevice(OfMacAddress) == null) {
                continue;
            }
            info.DeviceType = manager.getOLTDevice(OfMacAddress).getDeviceType();
            info.DeviceId = manager.getEmptyONUName(info.DeviceId, true);
            info.DeviceIds.add(info.DeviceId);

            if(result.isEmpty()) {
                result.add(info);
            }
            else {
		List<PhysicalInfo> subResult = new ArrayList<>();

                for(PhysicalInfo topology : result) {
                    if(!topology.equals(info)) {
			subResult.add(info);
                    }
                }

		result.addAll(subResult);
            }

            for(PhysicalInfo topology : result) {
                if(topology.equalOLTDifferentONU(info)) {
                    topology.DeviceIds.add(info.DeviceId);
                }
            }

        }

        return result;
    }

    public List<SliceInstanceInfo> getSliceInstanceInfo(List<PhysicalInfo> physicalInfos) {
        List<SliceInstanceInfo> result = new ArrayList<>();

        for(PhysicalInfo physicalInfo : physicalInfos) {
            for( String sliceName : manager.getSliceInstances()) {
                SliceInstance sliceInstance = manager.getSliceInstance(sliceName);

                if(sliceInstance != null ) {
                    String uniPortNameInSlice = sliceInstance.getUniPortName();
                    String uniPortNameInPhyInfo = Integer.toString(physicalInfo.PortNum);

                    if( uniPortNameInSlice.equals(uniPortNameInPhyInfo) ) {
                        SliceProfileInformation spi = sliceService.get(sliceName);
                        SliceInstanceInfo sliceInstanceInfo = new SliceInstanceInfo();

                        sliceInstanceInfo.SliceName = sliceInstance.getName();
                        sliceInstanceInfo.DBAType = sliceInstance.getDBAType();
                        sliceInstanceInfo.OLTId = manager.getOLTDeviceName(sliceInstance.getOLTId());
                        sliceInstanceInfo.PonPort = sliceInstance.getPonPortName();
                        sliceInstanceInfo.ONUId = physicalInfo.DeviceId;
                        sliceInstanceInfo.UniPort = sliceInstance.getUniPortName();
                        sliceInstanceInfo.tConts = spi.trafficContainers();
                        sliceInstanceInfo.AllocBandwidth = sliceInstance.getAllocatedBandwidth();
                        sliceInstanceInfo.RemainedBandwidth = sliceInstance.getRemainedBandwidth();
                        result.add(sliceInstanceInfo);
                    }
                }
            }
        }

        return result;
    }

    public List<SubscriberInfo> getSubscriberInfo(List<SliceInstanceInfo> sliceInstanceInfos) {
        List<SubscriberInfo> result = new ArrayList<>();

        sliceInstanceInfos.forEach(sliceInstanceInfo -> {
            String sliceName = sliceInstanceInfo.SliceName;
            List<String> subscribers = manager.getSliceInstance(sliceName).getSubscribers();

            subscribers.forEach(subscriber -> {
                SubscriberInfo subscriberInfo = new SubscriberInfo();
                subscriberInfo.SubscriberId = subscriber;
                subscriberInfo.SliceName = sliceInstanceInfo.SliceName;
                subscriberInfo.DBAType = sliceInstanceInfo.DBAType;
                subscriberInfo.OLTId = sliceInstanceInfo.OLTId;
                subscriberInfo.PonPort = sliceInstanceInfo.PonPort;
                subscriberInfo.ONUId = sliceInstanceInfo.ONUId;
                subscriberInfo.UniPort = sliceInstanceInfo.UniPort;

                SubscriberAndDeviceInformation subscriberProfile = subsService.get(subscriber);
                if( subscriberProfile != null ) {
                    String upBandwidthProfile = null;

                    if( subscriberProfile.uniTagList() != null && subscriberProfile.uniTagList().size() > 0) {
                        UniTagInformation uti = subscriberProfile.uniTagList().get(0);
                        subscriberInfo.PonCTag = uti.getPonCTag().toString();
                        subscriberInfo.PonSTag = uti.getPonSTag().toString();

                        upBandwidthProfile = uti.getUpstreamBandwidthProfile();
                    }

                    if( upBandwidthProfile != null ) {
                        BandwidthProfileInformation bpi = bpService.get(upBandwidthProfile);

                        if( bpi != null ) {
                            subscriberInfo.CIR = bpi.committedInformationRate();
                            subscriberInfo.CBS = bpi.committedBurstSize();
                            subscriberInfo.PIR = bpi.peakInformationRate();
                            subscriberInfo.PBS = bpi.peakBurstSize();
                        }
                    }
                }

                result.add(subscriberInfo);
            });
        });

        return result;
    }
}
