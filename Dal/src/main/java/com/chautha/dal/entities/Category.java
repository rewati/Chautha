package com.chautha.dal.entities;

import com.chautha.dal.entities.admin.PageLayout;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Rewati Raman
 */
@Entity
public class Category extends UuidEntity implements Serializable {
    private String name;
    private String description;
    private boolean home;
    private boolean displayInTopMenu;
    private boolean displayInMenu;
    private boolean published;
    private Date publishedDate;
    private Date createdDate;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Category_Article",
            joinColumns = { @JoinColumn(name = "category_uuid")}
    )
    private List<Article> articles;
    @NotNull
    private PageLayout pageLayout;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isDisplayInTopMenu() {
        return displayInTopMenu;
    }

    public void setDisplayInTopMenu(boolean displayInTopMenu) {
        this.displayInTopMenu = displayInTopMenu;
    }

    public boolean isDisplayInMenu() {
        return displayInMenu;
    }

    public void setDisplayInMenu(boolean displayInMenu) {
        this.displayInMenu = displayInMenu;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public PageLayout getPageLayout() {
        return pageLayout;
    }

    public void setPageLayout(PageLayout pageLayout) {
        this.pageLayout = pageLayout;
    }
}
