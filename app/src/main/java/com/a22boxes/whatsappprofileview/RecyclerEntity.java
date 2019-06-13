package com.a22boxes.whatsappprofileview;

public class RecyclerEntity {
    private int image;
    private  String title;
    private String time;

    public RecyclerEntity() {
    }

    public RecyclerEntity(int image, String title, String time) {
        this.image = image;
        this.title = title;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
