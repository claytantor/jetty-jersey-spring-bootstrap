package com.dronz.resource;

import com.dronz.service.FirstService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import javax.ws.rs.core.Response.Status;

/**
 * Created by claytongraham on 10/25/15.
 */

@Component
@Path("/first")
public class FirstResource extends BaseResource {

    @Inject
    FirstService service;

    @GET
    @Path("/model")
    @Produces("application/json")
    public Response getModel() {
        try {
            return Response.status(Status.OK).entity(buildJson(service.getModel())).build();
        } catch (JsonProcessingException e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(getErrorJson()).build();
        }

    }
}
