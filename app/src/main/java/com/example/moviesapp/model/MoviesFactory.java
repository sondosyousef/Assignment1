package com.example.moviesapp.model;

public class MoviesFactory {
    public IMovieData getModel(){
        return  new MoviesDa();
    }
}
