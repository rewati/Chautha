package com.chautha.dal.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by rewati on 9/19/14.
 */
@Entity(name="tag")
public class Tag extends UuidEntity {
    private String name;
    @ManyToMany(mappedBy = "tags")
    private List<Album> albums;

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
}
