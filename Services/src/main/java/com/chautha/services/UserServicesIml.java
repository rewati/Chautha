package com.chautha.services;

import com.chautha.core.model.entities.User;
import com.chauthao.dal.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by rewati on 9/13/14.
 */
@Service
public class UserServicesIml implements UserServices {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {

        User user1 = new User();
        user.setUuid(UUID.randomUUID());
        user.setUserName("rewati.raman@gmail.com");
        userDao.saveNewUser(user);
    }
}
