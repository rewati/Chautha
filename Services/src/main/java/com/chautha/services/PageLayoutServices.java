package com.chautha.services;

import com.chautha.core.model.entities.admin.PageLayout;

import java.util.List;

/**
 * Created by rewati on 11/5/14.
 */
public interface PageLayoutServices {
    public List<PageLayout> getPageLayoutList();
    public void savePageLayout(PageLayout pageLayout);
    public void updatePageLayout(PageLayout pageLayout);
}
