package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.PageLayoutDao;
import com.chautha.dal.entities.admin.PageLayout;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rewati.raman on 11/5/14.
 */
@Repository
public class PageLayoutDaoIml extends BasicEntityDaoIml<PageLayout> implements PageLayoutDao {


    @Override
    public List<PageLayout> getPageLayoutList() {
        return null;
    }
}
