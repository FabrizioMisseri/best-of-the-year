package org.learning.java.bestoftheyear.model;

public class MediaContent {
    private String title;
    private int id;

    public MediaContent(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
