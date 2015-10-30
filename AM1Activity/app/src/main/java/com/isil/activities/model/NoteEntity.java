package com.isil.activities.model;

import java.io.Serializable;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteEntity  implements Serializable{

    public static  final String TIMESTAMP_FIELD="addedDate";

    private int id;
    private String name;
    private String description;
    private String path;
    private String addedDate;
    private String color;

    public NoteEntity(int id,String name, String description, String addedDate) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.addedDate = addedDate;
    }

    public NoteEntity(int id,String name, String description) {
        this.id=id;
        this.name = name;
        this.description = description;
    }

    public NoteEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
