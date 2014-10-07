package com.chautha.dal.hibernateDaoIml;

import com.chautha.core.model.entities.User;
import com.chautha.dal.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.junit.Assert.*;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/hibernate.xml"})
@TransactionConfiguration(defaultRollback=true)
public class UserDaoImlTest {


    @PersistenceContext
    private EntityManager em;
    UserDaoIml userDaoIml;
    UserDao userDao;

    @Before
    public void setUp() throws Exception {
        userDaoIml = new UserDaoIml();
        userDaoIml.setEm(em);
        userDao = userDaoIml;
    }


    @Test
    public void testSaveNewUser() throws Exception {
        userDao.save(createUser());
    }

    @Test
    public void testGetByUuid(){
        User user = createUser();
        userDao.save(user);
        User user1 = (User) userDao.getByUuid(user.getUuid());
        assertEquals(user,user1);
    }

    private User createUser(){
        User user = new User();
        user.setLastName("t1");
        user.setFirstName("t1");
        user.setUserName("t1");
        user.setPassword("t1");
        return user;
    }

    @Test
    public void testUpdateUser(){
        User user = createUser();
        userDao.update(user);
    }
}
