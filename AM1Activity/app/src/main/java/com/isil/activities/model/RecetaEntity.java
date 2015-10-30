package com.isil.activities.model;

import java.io.Serializable;

/**
 * Created by Profesor on 29/10/2015.
 */
public class RecetaEntity implements Serializable {

    private int id;
    private String name;
    private String comp1;
    private String comp2;
    private String comp3;
    private double price;
    private int total;
    private int type;
    private String desc;

    public RecetaEntity(int id,String name, double price, int total, int type, String desc) {
        this.name = name;
        this.price = price;
        this.total = total;
        this.type = type;
        this.desc = desc;
        this.id = id;
    }

    public RecetaEntity() {
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

    public String getComp1() {
        return comp1;
    }

    public void setComp1(String comp1) {
        this.comp1 = comp1;
    }

    public String getComp2() {
        return comp2;
    }

    public void setComp2(String comp2) {
        this.comp2 = comp2;
    }

    public String getComp3() {
        return comp3;
    }

    public void setComp3(String comp3) {
        this.comp3 = comp3;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
