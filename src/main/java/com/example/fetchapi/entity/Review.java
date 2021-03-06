package com.example.fetchapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    private int reviewid;

    private String title;

    private String labels;

    private String genres;

    private String artists;

    private String url;

    private String score;

    private String pub_year;

    public Review() {
    }

    public int getReviewid() {
        return reviewid;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getScore() {
        return score;
    }

    public String getPub_year() {
        return pub_year;
    }

    public String getLabels() {
        return labels;
    }

    public String getGenres() {
        return genres;
    }

    public String getArtists() {
        return artists;
    }
}

