package com.chautha.services;

import com.chautha.core.model.entities.User;
import com.chautha.dal.dao.UserDao;

/**
 * Created by rewati on 9/13/14.
 */
public interface UserServices {
    public void saveUser(User user);
}
