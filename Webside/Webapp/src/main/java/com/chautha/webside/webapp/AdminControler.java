package com.chautha.webside.webapp;

import com.chautha.core.model.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rewati on 11/2/14.
 */

@Controller
@RequestMapping("admin")
public interface AdminControler {
    @RequestMapping("")
    public String testMethod();

    @RequestMapping("/pageLayoutList")
    public String pageLayoutList();

    @RequestMapping("/blogs")
    public String getBlogList();

    @RequestMapping("/users")
    public List<User> getUsersList();
}
