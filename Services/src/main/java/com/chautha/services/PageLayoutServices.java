package com.chautha.services;

import com.chautha.core.model.entities.admin.PageLayout;

import java.util.List;

/**
 * Created by Rewati Raman
 */
public interface PageLayoutServices {
    List<PageLayout> getPageLayoutList();
    void savePageLayout(PageLayout pageLayout);
    void updatePageLayout(PageLayout pageLayout);
}
