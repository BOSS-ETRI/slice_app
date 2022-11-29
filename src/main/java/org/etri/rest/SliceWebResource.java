package org.etri.rest;

import org.etri.slice.api.SliceCtrlService;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.rest.AbstractWebResource;
import org.slf4j.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static org.slf4j.LoggerFactory.getLogger;
import org.etri.slice.impl.*;

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
    @Path("")
    public Response getTopology() {
        log.info("getLogicalDevices() called from GUI application");

        SliceCtrlService service = get(SliceCtrlService.class);
        String topologyJson = service.getTopology();

        return Response.ok(topologyJson)
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }
}