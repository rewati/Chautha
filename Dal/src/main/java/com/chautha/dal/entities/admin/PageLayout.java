package com.chautha.dal.entities.admin;


import com.chautha.dal.entities.UuidEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rewati Raman
 */
@Entity
@XmlRootElement
public class PageLayout extends UuidEntity implements Serializable {
    @Column(unique = true)
    @NotNull
    @NotEmpty
    private String name;
    private boolean active;
    private Date createdDate;
    private boolean defaultLayout;
    private String topBar;
    private String leftBar;
    private String rightBar;
    private String header;
    private String footer;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isDefaultLayout() {
        return defaultLayout;
    }

    public void setDefaultLayout(boolean defaultLayout) {
        this.defaultLayout = defaultLayout;
    }

    public String getTopBar() {
        return topBar;
    }

    public void setTopBar(String topBar) {
        this.topBar = topBar;
    }

    public String getLeftBar() {
        return leftBar;
    }

    public void setLeftBar(String leftBar) {
        this.leftBar = leftBar;
    }

    public String getRightBar() {
        return rightBar;
    }

    public void setRightBar(String rightBar) {
        this.rightBar = rightBar;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
