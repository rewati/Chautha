package com.chautha.dal.dao;

import com.chautha.dal.entities.admin.PageLayout;
import com.rrboss.methodProfiler.MethodPerformanceProfiler;

import java.util.List;

/**
 * Created by rewati.raman on 11/5/14.
 */
public interface PageLayoutDao extends BasicEntityDao<PageLayout> {
    @MethodPerformanceProfiler
    public List<PageLayout> getPageLayoutList();
}
