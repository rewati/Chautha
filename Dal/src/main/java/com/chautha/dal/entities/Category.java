package com.chautha.dal.entities;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author Rewati Raman
 */
@Entity
public class Category extends UuidEntity{
    private String name;
    private String description;
    private boolean home;
    private boolean displayInTopMenu;
    private boolean displayInMenu;
    private boolean published;
    private Date publishedDate;
    private Date createdDate;

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
}
