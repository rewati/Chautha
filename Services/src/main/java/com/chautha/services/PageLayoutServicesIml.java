package com.chautha.services;

import com.chautha.dal.entities.admin.PageLayout;
import com.chautha.dal.dao.PageLayoutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rewati Raman
 */
@Repository
public class PageLayoutServicesIml implements PageLayoutServices {
    @Autowired
    private PageLayoutDao pageLayoutDao;

    @Override
    public List<PageLayout> getPageLayoutList() {
        return pageLayoutDao.getList();
    }

    @Override
    public void savePageLayout(PageLayout pageLayout) {
        pageLayoutDao.save(pageLayout);
    }

    @Override
    public void updatePageLayout(PageLayout pageLayout) {
        pageLayoutDao.update(pageLayout);
    }
}
