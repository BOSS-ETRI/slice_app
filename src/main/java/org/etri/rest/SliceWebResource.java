package org.etri.rest;

import com.google.gson.Gson;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.gui.PhysicalInfo;
import org.etri.slice.impl.gui.SliceInstanceInfo;
import org.etri.slice.impl.gui.SubscriberInfo;
import org.etri.slice.impl.gui.TopologyInfo;
import org.onosproject.rest.AbstractWebResource;
import org.slf4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * OLT REST APIs.
 */

@Path("slice")
public class SliceWebResource extends AbstractWebResource {
    private final Logger log = getLogger(getClass());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("status")
    public Response status() {
        log.info("Request through RestAPI from GUI application");

        SliceCtrlService service = get(SliceCtrlService.class);

        return Response.ok("hello world!").
                header("Access-Control-Allow-Origin", "*").
                build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("topology")
    public Response getTopology() {
        log.info("getTopology() called from GUI application");

        TopologyInfo topologyInfo = new TopologyInfo();

        SliceCtrlService service = get(SliceCtrlService.class);
        List<PhysicalInfo> physicalInfos = service.getPhysicalInfo();
        topologyInfo.physicalInfo = service.removeDuplatePhysicalInfo(physicalInfos);

        List<SliceInstanceInfo> sliceInstanceInfos = service.getSliceInstanceInfo(physicalInfos);
        topologyInfo.sliceInstanceInfo = sliceInstanceInfos;

        List<SubscriberInfo> subscriberInfos = service.getSubscriberInfo(sliceInstanceInfos);
        topologyInfo.subscriberInfo = subscriberInfos;

        log.info(new Gson().toJson(topologyInfo));

        return Response.ok(new Gson().toJson(topologyInfo))
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }
}