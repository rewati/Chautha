package com.chautha.dal.entities;

import com.chautha.dal.entities.admin.PageLayout;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by rewati on 11/20/14.
 */
@Entity
@XmlRootElement
public class Article extends UuidEntity implements Serializable {
    @NotNull
    private PageLayout pageLayout;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "article_tag",
            joinColumns = { @JoinColumn(name = "article_uuid")}
    )
    private List<Tag> tags;
    @NotEmpty
    private String content;
    @NotEmpty
    private String title;
    private String headTag;
    private boolean published;
    private Date publishedDate;
    private Date createdDate;

    public PageLayout getPageLayout() {
        return pageLayout;
    }

    public void setPageLayout(PageLayout pageLayout) {
        this.pageLayout = pageLayout;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadTag() {
        return headTag;
    }

    public void setHeadTag(String headTag) {
        this.headTag = headTag;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
