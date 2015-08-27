package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.UserDao;
import com.chautha.dal.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rewati Raman
 */
@Repository
public class UserDaoIml extends BasicEntityDaoIml<User> implements UserDao {


}
