package com.chautha.webside.webapp;

import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rewati on 9/13/14.
 */
@Controller
@RequestMapping("/admin")
public class AdminControler {

    @Autowired
    private UserServices userServices;

    @RequestMapping("")
    public String testMethod(){
        userServices.saveUser(null);
        return null;
    }
}
