package com.cahutha.restapi.admin;

import com.chautha.dal.entities.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Rewati Raman
 */
@WebService
@Path("admin")
public interface AdminController {

    @Produces("application/json,text/html")
    @GET
    @Path("/user")
    public User getUser();

    @Produces("application/json,text/html")
    @POST
    @Path("/saveArticle")
    public User saveArticle(String name);
}
