package com.chautha.dal.entities;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Rewati Raman
 */
@Entity
public class Album extends UuidEntity{
    @NotEmpty
    private String name;
    @NotEmpty
    private String fileLocation;
    private String description;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Album_Tag",
            joinColumns = { @JoinColumn(name = "album_uuid")},
            inverseJoinColumns = {@JoinColumn(name = "tag_uuid")}
    )
    private List<Tag> tags;
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Picture> pictures;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
}
