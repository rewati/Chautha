package com.chautha.dal.hibernateDaoIml;

import com.chautha.dal.dao.PageLayoutDao;
import com.chautha.dal.entities.admin.PageLayout;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rewati Raman
 */
@Repository
public class PageLayoutDaoIml extends BasicEntityDaoIml<PageLayout> implements PageLayoutDao {


    @Override
    public List<PageLayout> getPageLayoutList() {
        return null;
    }
}
