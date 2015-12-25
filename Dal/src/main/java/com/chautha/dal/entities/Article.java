package com.chautha.dal.entities;

import com.chautha.dal.entities.admin.PageLayout;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Rewati Raman
 */
@Entity
@XmlRootElement
public class Article extends UuidEntity implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pageLayout_uuid")
    private PageLayout pageLayout;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Article_Tag",
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
    @Column(unique=true)
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
