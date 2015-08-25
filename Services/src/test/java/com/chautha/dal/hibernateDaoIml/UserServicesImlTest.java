package com.chautha.dal.hibernateDaoIml;

import com.chautha.core.model.entities.User;
import com.chautha.dal.dao.UserDao;
import com.chautha.services.UserServicesIml;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

/**
 * Created by Rewati Raman
 */
public class UserServicesImlTest  {


    UserServicesIml userServices;
    UserDao mockDao;

    @Before
    public void setup(){
        userServices = new UserServicesIml();
        mockDao = createStrictMock(UserDao.class);
        userServices.setUserDao(mockDao);
    }

    @Test
    public void testSaveUser() {
        User user = createUser();
        mockDao.save(user);
        expectLastCall().once();
        replay();
        userServices.saveUser(user);

    }

    private User createUser(){
        User user = new User();
        user.setLastName("t1");
        user.setFirstName("t1");
        user.setUserName("t1");
        user.setPassword("t1");
        return user;
    }
}
