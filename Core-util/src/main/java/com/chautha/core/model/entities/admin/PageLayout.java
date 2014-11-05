package com.chautha.core.model.entities.admin;

import com.chautha.core.model.entities.UuidEntity;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by rewati on 11/1/14.
 */
@Entity
public class PageLayout extends UuidEntity implements Serializable {
    private String leftBar;
    private String rightBar;
    private String header;
    private String footer;
    private String content;

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
