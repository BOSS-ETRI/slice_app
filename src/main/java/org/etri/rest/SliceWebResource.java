package org.etri.rest;

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
        return Response.ok("hello world!").
                header("Access-Control-Allow-Origin", "*").
                build();
    }
}