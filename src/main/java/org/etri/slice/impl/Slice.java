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

import org.onosproject.cfg.ComponentConfigService;
import org.onosproject.event.AbstractListenerManager;
import org.onosproject.net.ConnectPoint;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.etri.sis.BaseInformationService;
import org.etri.sis.SliceProfileInformation;
import org.etri.sis.SadisService;
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
import org.etri.slice.api.SliceCtrlEvent;
import org.etri.slice.api.SliceCtrlListener;
import org.etri.slice.api.SliceCtrlService;

import java.util.Dictionary;
import java.util.Properties;

import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_BP_ID_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_MCAST_SERVICE_NAME_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.EAPOL_DELETE_RETRY_MAX_ATTEMPS_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.PROVISION_DELAY_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_BP_ID;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_BP_ID_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_MCAST_SERVICE_NAME;
import static org.etri.slice.impl.OsgiPropertyConstants.DEFAULT_MCAST_SERVICE_NAME_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.EAPOL_DELETE_RETRY_MAX_ATTEMPS;
import static org.etri.slice.impl.OsgiPropertyConstants.EAPOL_DELETE_RETRY_MAX_ATTEMPS_DEFAULT;
import static org.etri.slice.impl.OsgiPropertyConstants.PROVISION_DELAY;
import static org.etri.slice.impl.OsgiPropertyConstants.PROVISION_DELAY_DEFAULT;
import static org.onlab.util.Tools.get;

/**
 * Skeletal ONOS application component.
 */
/*
 * @Component(immediate = true, service = {SliceCtrlService.class}, property = {
 * "someProperty=Some Default String Value", })
 */
@Component(immediate = true,
service = {SliceCtrlService.class},
property = {
        DEFAULT_BP_ID + ":String=" + DEFAULT_BP_ID_DEFAULT,
        DEFAULT_MCAST_SERVICE_NAME + ":String=" + DEFAULT_MCAST_SERVICE_NAME_DEFAULT,
        EAPOL_DELETE_RETRY_MAX_ATTEMPS + ":Integer=" +
                EAPOL_DELETE_RETRY_MAX_ATTEMPS_DEFAULT,
        PROVISION_DELAY + ":Integer=" + PROVISION_DELAY_DEFAULT,
})
public class Slice extends AbstractListenerManager<SliceCtrlEvent, SliceCtrlListener> implements SliceCtrlService {
    private static final String SADIS_NOT_RUNNING = "Sadis is not running.";

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

    protected BaseInformationService<SliceProfileInformation> sliceService;
    protected volthaMgmtGrpcClient client;
    @Activate
    protected void activate() {
        cfgService.registerProperties(getClass());

        if (sadisService != null) {
            sliceService = sadisService.getSliceProfileService();
        } else {
            log.warn(SADIS_NOT_RUNNING);
        }
        client = new volthaMgmtGrpcClient(log);
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
        log.info("Sadis-service binds to onos.");
    }

    protected void unbindSadisService(SadisService service) {
        sadisService = null;
        sliceService = null;
        log.info("Sadis-service unbinds from onos.");
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
    public AddSliceResponse AddSlice(AddSliceRequest request) {
    	
    	AddSliceResponse response = client.AddSlice(request);
    	return response;
    }
}
