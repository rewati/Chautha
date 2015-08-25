package com.chautha.services;

import com.chautha.core.model.entities.admin.PageLayout;

import java.util.List;

/**
 * Created by rewati on 11/5/14.
 */
public interface PageLayoutServices {
    List<PageLayout> getPageLayoutList();
    void savePageLayout(PageLayout pageLayout);
    void updatePageLayout(PageLayout pageLayout);
}
