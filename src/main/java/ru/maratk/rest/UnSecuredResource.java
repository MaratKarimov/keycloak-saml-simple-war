package ru.maratk.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/")
public class UnSecuredResource {
    @GET
    @Produces("text/plain")
    public Response doGet(@Context HttpServletRequest request) {
        return Response.ok("Hello!").build();
    }
}