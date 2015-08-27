package com.cahutha.restapi.admin;

import com.chautha.dal.entities.User;
import com.chautha.dal.entities.admin.PageLayout;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Rewati Raman
 */
@Produces("application/json")
@WebService
@Path("admin")
public interface AdminController {

    //USERS
    @Produces("application/json")
    @GET
    @Path("/users")
    public List<User> getUsers();

    @GET
    @Path("/user")
    public User getUser();

    @POST
    @Path("/createuser")
    public void createUSer();

    @PUT
    @Path("/updateuser")
    public void updateUser();

    @DELETE
    @Path("/deleteuser")
    public void deleteUser();


    //ARTICLES

    @Produces("application/json,text/html")
    @POST
    @Path("/savearticle")
    public User saveArticle(String name);


    //CATEGORY

    //TAG

    //PAGELAYOUT

    @Produces("application/json,text/html")
    @POST
    @Path("/savepagelayout")
    public void savePageLayout();

    @Produces("application/json")
    @GET
    @Path("/pagelayouts")
    public List<PageLayout> getPageLayouts();

    //SITE CONFIGURATIONS
}
