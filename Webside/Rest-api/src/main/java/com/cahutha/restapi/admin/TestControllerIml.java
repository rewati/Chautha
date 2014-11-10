package com.cahutha.restapi.admin;

import com.chautha.core.model.entities.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by rewati on 11/9/14.
 */
@Service("testController")
public class TestControllerIml implements TestController {
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
}
