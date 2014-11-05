package com.chautha.webside.webapp;

import com.chautha.core.model.entities.User;
import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rewati on 9/13/14.
 */
@Service
public class AdminControlerIml implements AdminControler {

    @Autowired
    private UserServices userServices;

    public String testMethod(){
        return "admin";
    }

    public String pageLayoutList(){
        return "pageLayoutList";
    }

    @Override
    public String getBlogList() {
        return "blogs";
    }

    @Override
    public List<User> getUsersList() {
        return null;
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }
}
