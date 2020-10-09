package com.example.moviesapp.model;

import java.util.List;

public interface IMovieData {
     List<movie> getMovies(String t);
     List <String> getGenre();

}
