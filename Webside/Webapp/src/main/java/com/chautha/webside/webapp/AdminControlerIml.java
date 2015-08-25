package com.chautha.webside.webapp;

import com.chautha.core.model.entities.Article;
import com.chautha.core.model.entities.User;
import com.chautha.core.model.entities.admin.PageLayout;
import com.chautha.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Rewati Raman
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
    public String savePageLayout(Model model) {
        PageLayout pageLayout = new PageLayout();
        pageLayout.setTopBar("fkndkldfnb");
        model.addAttribute("pageLayout", pageLayout);
        return "pageLayoutForm";
    }

    @Override
    public String getBlogList() {
        return "blogs";
    }

    @Override
    public List<User> getUsersList() {
        return null;
    }

    @Override
    public String newBlog(Model model) {
        Article article = new Article();
        article.setTitle("kfndbdfbn");
        model.addAttribute("blog", article);
        return "newBlog";
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }
}
