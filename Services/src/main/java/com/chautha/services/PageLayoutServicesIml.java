package com.chautha.services;

import com.chautha.core.model.entities.admin.PageLayout;
import com.chautha.dal.dao.PageLayoutDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by rewati on 11/5/14.
 */
public class PageLayoutServicesIml implements PageLayoutServices {
    @Autowired
    private PageLayoutDao pageLayoutDao;

    @Override
    public List<PageLayout> getPageLayoutList() {
        return null;
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
