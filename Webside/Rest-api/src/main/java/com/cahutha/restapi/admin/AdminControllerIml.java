package com.cahutha.restapi.admin;

import com.chautha.dal.entities.Category;
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

    public List<User> getUsers() {
        return userServices.getUsers();
    }

    public User getUser() {
        return null;
    }

    public void createUSer() {

    }

    public void updateUser() {

    }

    public void deleteUser() {

    }

    public User saveArticle(String name) {
        return null;
    }

	public List<Category> getCategories() {
		return null;
	}

	public Category getCategory() {
		return null;
	}

	public void createCategory() {

	}

	public void updateCategory() {

	}

	public void deleteCategory() {

	}

    public void savePageLayout() {
        pageLayoutServices.savePageLayout(createPageLayout());
    }

    public List<PageLayout> getPageLayouts() {
        return pageLayoutServices.getPageLayoutList();
    }

    private PageLayout createPageLayout(){
        PageLayout pageLayout = new PageLayout();
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
