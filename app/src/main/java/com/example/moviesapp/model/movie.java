package com.example.moviesapp.model;

import android.media.Image;
import android.widget.ImageView;

public class movie {
    private String title;
    private int year;
    private String genre;


    public movie(String title, int year, String genre ) {
        this.title = title;
        this.year = year;
        this.genre = genre;



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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

