package com.chautha.services;

import com.chautha.core.model.entities.User;
import com.chautha.dal.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Rewati Raman
 */
@Service
public class UserServicesIml implements UserServices {

    private static final Logger logger = LoggerFactory.getLogger(UserServicesIml.class);

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User user) {

        User user1 = new User();
        user1.setUserName("rewati.raman@gmail.com");
        user1.setPassword("eonkwvoenv");
        user1.setFirstName("ejnvvein");
        user1.setLastName("fnvwoin");
        logger.info("rewati.test");
        userDao.save(user1);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
