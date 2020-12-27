package com.project.laundryappui.menu.home.model;

public class HomeModel {
    private int image;
    private String name;
    private String price;
    private String location;

    public HomeModel() {}

    public HomeModel(int image, String name, String price, String location) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
