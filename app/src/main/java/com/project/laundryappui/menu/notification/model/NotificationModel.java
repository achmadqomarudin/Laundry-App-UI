package com.project.laundryappui.menu.notification.model;

public class NotificationModel {
    private int image;
    private String name;
    private String status_order;

    public NotificationModel(int image, String name, String status_order) {
        this.image = image;
        this.name = name;
        this.status_order = status_order;
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

    public String getStatus_order() {
        return status_order;
    }

    public void setStatus_order(String status_order) {
        this.status_order = status_order;
    }
}
