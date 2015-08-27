package com.cahutha.restapi.admin;

import com.chautha.dal.entities.User;
import com.chautha.dal.entities.admin.PageLayout;
import com.chautha.services.PageLayoutServices;
import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rewati Raman
 */
@Service("rsAdminController")
public class AdminControllerIml implements AdminController {

    @Autowired
    private PageLayoutServices pageLayoutServices;

    @Autowired
    private UserServices userServices;

    @Override
    public List<User> getUsers() {
        return userServices.getUsers();
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void createUSer() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public User saveArticle(String name) {
        return null;
    }

    @Override
    public void savePageLayout() {
        pageLayoutServices.savePageLayout(createPageLayout());
    }

    @Override
    public List<PageLayout> getPageLayouts() {
        return pageLayoutServices.getPageLayoutList();
    }

    private PageLayout createPageLayout(){
        PageLayout pageLayout = new PageLayout();
        pageLayout.setContent("test");
        pageLayout.setFooter("footer");
        pageLayout.setHeader("header");
        pageLayout.setLeftBar("LeftBar");
        pageLayout.setRightBar("rightBar");
        pageLayout.setTopBar("topbar");
        return pageLayout;
    }

    public void setPageLayoutServices(PageLayoutServices pageLayoutServices) {
        this.pageLayoutServices = pageLayoutServices;
    }
}
