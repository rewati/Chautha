package hibernateDaoIml;

import com.chautha.core.model.entities.User;
import com.chauthao.dal.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rewati on 9/13/14.
 */
@Service
public class UserDaoIml implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveNewUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
