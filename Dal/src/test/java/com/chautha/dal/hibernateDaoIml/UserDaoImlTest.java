package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.UserDao;
import com.chautha.dal.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

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
        userDao.save(createUser("test"));
//        userDao.save(createUser("test1"));
//        userDao.save(createUser("test2"));
//        userDao.save(createUser("test3"));
//        userDao.save(createUser("test4"));
//        userDao.save(createUser("test5"));
//        userDao.save(createUser("test6"));
    }

    @Test
    public void testGetByUuid(){
        User user = createUser("testUserUuid");
        userDao.save(user);
        User user1 = (User) userDao.getByUuid(user.getUuid());
        assertEquals(user,user1);
    }

    private User createUser(){
        User user = new User();
        user.setLastName("test");
        user.setFirstName("test");
        user.setUserName("test");
        user.setPassword("test");
        return user;
    }
    private User createUser(String s){
        User user = new User();
        user.setLastName(s);
        user.setFirstName(s);
        user.setUserName(s);
        user.setPassword(s);
        return user;
    }

    @Test
    public void testUpdateUser(){
        User user = createUser("TestUserUpdate");
        userDao.save(user);
        user.setFirstName("TestUserUpdated1");
        userDao.update(user);
    }

    @Test
    public void testGetList(){
        List<User> userList = userDao.getList();
        System.out.println();
    }


}
