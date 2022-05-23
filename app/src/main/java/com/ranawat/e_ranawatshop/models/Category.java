package com.ranawat.e_ranawatshop.models;

public class Category {

    private String name , icon , color, brif;
    private int id;

    public Category(String name, String icon, String color, String brif, int id) {
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.brif = brif;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrif() {
        return brif;
    }

    public void setBrif(String brif) {
        this.brif = brif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
