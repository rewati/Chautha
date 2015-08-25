package com.chautha.dal.dao;

import com.chautha.dal.entities.admin.PageLayout;
import com.rrboss.methodProfiler.MethodPerformanceProfiler;

import java.util.List;

/**
 * Created by Rewati Raman
 */
public interface PageLayoutDao extends BasicEntityDao<PageLayout> {
    @MethodPerformanceProfiler
    public List<PageLayout> getPageLayoutList();
}
