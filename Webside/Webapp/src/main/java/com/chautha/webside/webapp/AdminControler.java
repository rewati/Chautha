package com.chautha.webside.webapp;

import com.chautha.core.model.entities.User;
import com.chautha.core.model.entities.admin.PageLayout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Rewati Raman
 */

@Controller
@RequestMapping("admin")
public interface AdminControler {
    @RequestMapping("")
    public String testMethod();

    @RequestMapping("/pageLayoutList")
    public String pageLayoutList();

    @RequestMapping("/savePageLayout")
    public String savePageLayout(Model model);

    @RequestMapping("/blogs")
    public String getBlogList();

    @RequestMapping("/users")
    public List<User> getUsersList();

    @RequestMapping("/newBlog")
    public String newBlog(@RequestParam Model model);
}
