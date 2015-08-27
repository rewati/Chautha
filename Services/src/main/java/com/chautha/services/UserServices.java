package com.chautha.services;

import com.chautha.dal.entities.User;

import java.util.List;

/**
 * Created by Rewati Raman
 */
public interface UserServices {
    void saveUser(User user);
    List<User> getUsers();
}
