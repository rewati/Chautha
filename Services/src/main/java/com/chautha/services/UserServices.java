package com.chautha.services;

import com.chautha.core.model.entities.User;
import com.chautha.dal.dao.UserDao;

/**
 * Created by Rewati Raman
 */
public interface UserServices {
    void saveUser(User user);
}
