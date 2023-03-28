package org.learning.java.bestoftheyear.model;

import javax.lang.model.element.NestingKind;

public class Song extends MediaContent {

    private float duration;
    private String text;

    public Song(String title, int id, float duration, String text) {
        super(title, id);
        this.duration = duration;
        this.text = text;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + getTitle() + '\'' +
                ", id=" + getId() +
                '}' +
                " Song{" +
                "duration=" + duration +
                ", text='" + text + '\'' +
                '}';
    }
}
