package org.learning.java.bestoftheyear.model;

import javax.lang.model.element.NestingKind;

public class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
