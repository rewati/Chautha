package com.cahutha.restapi.admin;

import com.chautha.dal.entities.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Rewati Raman
 */
@Service("rsAdminController")
public class AdminControllerIml implements AdminController {
    @Override
    public User getUser() {
        User user = new User();
        user.setFirstName("souji");
        user.setLastName("chi");
        user.setPassword("jnvwej");
        user.setUserName("wjiedn@kncwin.ciwnc");
        user.setUuid(UUID.randomUUID().toString());
        return user;
    }

    @Override
    public User saveArticle(String name) {
        return null;
    }
}
