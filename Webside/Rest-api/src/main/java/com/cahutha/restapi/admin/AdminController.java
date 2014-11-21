package com.cahutha.restapi.admin;

import com.chautha.core.model.entities.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by rewati on 11/9/14.
 */
@WebService
@Path("admin")
public interface AdminController {

    @Produces("application/json,text/html")
    @GET
    @Path("/user")
    public User getUser();
}