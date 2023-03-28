package org.learning.java.bestoftheyear.model;

public class Movie extends MediaContent {

    private float duration;
    private String trama;

    public Movie(String title, int id, float duration, String trama) {
        super(title, id);
        this.duration = duration;
        this.trama = trama;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + getTitle() + '\'' +
                ", id=" + getId() +
                '}' +
                " Movie{" +
                "duration=" + duration +
                ", trama='" + trama + '\'' +
                '}';
    }
}
