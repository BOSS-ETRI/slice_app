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
import org.onosproject.net.ConnectPoint;
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

import org.etri.slice.api.SliceCtrlService;

import java.util.Dictionary;
import java.util.Properties;

import static org.onlab.util.Tools.get;

/**
 * Skeletal ONOS application component.
 */
@Component(immediate = true,
           service = {SliceCtrlService.class},
           property = {
               "someProperty=Some Default String Value",
           })
public class Slice implements SliceCtrlService {
    private static final String SADIS_NOT_RUNNING = "Sadis is not running.";

    private final Logger log = LoggerFactory.getLogger(getClass());

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

    @Activate
    protected void activate() {
        cfgService.registerProperties(getClass());

        if (sadisService != null) {
            sliceService = sadisService.getSliceProfileService();
        } else {
            log.warn(SADIS_NOT_RUNNING);
        }

        log.info("Started");
    }

    @Deactivate
    protected void deactivate() {
        cfgService.unregisterProperties(getClass(), false);
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
}
