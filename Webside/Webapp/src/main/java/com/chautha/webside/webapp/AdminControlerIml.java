package com.chautha.webside.webapp;

import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Rewati Raman
 */
@Service
public class AdminControlerIml implements AdminControler {

    @Autowired
    private UserServices userServices;

    public String getDashBoard(){
        return "admin";
    }

    public String pageLayoutList(@PathVariable String adminUrl){
        return adminUrl;
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }
}
