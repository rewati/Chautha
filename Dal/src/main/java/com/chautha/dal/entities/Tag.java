package com.chautha.dal.entities;

import com.sun.javafx.beans.annotations.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rewati Raman
 */
@Entity
public class Tag extends UuidEntity implements Serializable {

    @Column(unique=true)
    @NonNull
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Album> albums;

    @ManyToMany(mappedBy = "tags")
    private List<Article> articles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
