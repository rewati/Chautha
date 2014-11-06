package com.chautha.dal.dao;

import com.chautha.core.model.entities.admin.PageLayout;

import java.util.List;

/**
 * Created by rewati.raman on 11/5/14.
 */
public interface PageLayoutDao extends BasicEntityDao<PageLayout> {
    public List<PageLayout> getPageLayoutList();

}
