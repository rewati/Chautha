package com.cahutha.restapi.admin;

import com.chautha.dal.entities.Category;
import com.chautha.dal.entities.User;
import com.chautha.dal.entities.admin.PageLayout;

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
    @GET
    @Path("/users")
    public List<User> getUsers();

    @GET
    @Path("/edit/user")
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
    @POST
    @Path("/newarticle")
    public User saveArticle(String name);


    //CATEGORY
    @GET
    @Path("/categories")
    public List<Category> getCategories();

    @GET
    @Path("/edit/category")
    public Category getCategory();

    @POST
    @Path("/newcategory")
    public void createCategory();

    @PUT
    @Path("/newcategory")
    public void updateCategory();

    @DELETE
    @Path("/deletecategory")
    public void deleteCategory();

    //TAG

    //PAGELAYOUT

    @POST
    @Path("/savepagelayout")
    public void savePageLayout();

    @GET
    @Path("/pagelayouts")
    public List<PageLayout> getPageLayouts();

    //SITE CONFIGURATIONS
}
