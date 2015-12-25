package com.chautha.services;

import com.chautha.dal.entities.User;
import com.chautha.dal.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Rewati Raman
 */
@Service
public class UserServicesIml implements UserServices {

    private static final Logger logger = LoggerFactory.getLogger(UserServicesIml.class);

    @Autowired
    private UserDao userDao;

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

    public List<User> getUsers() {
        return userDao.getList();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
