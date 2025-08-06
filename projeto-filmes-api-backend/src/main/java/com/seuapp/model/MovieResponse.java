package com.seuapp.model;

public class MovieResponse {
    private String title;
    private int year;
    private String type; // Por exemplo: "movie", "series"
    private String imdbId;

    public MovieResponse(String title, int year, String type, String imdbId) {
        this.title = title;
        this.year = year;
        this.type = type;
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }
}