package com.chautha.webside.webapp;

import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String blogList() {
        return "blogs";
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }
}
