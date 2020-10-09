package com.example.moviesapp.model;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MoviesDa implements IMovieData {
    private ArrayList <movie> mov = new ArrayList<>();
    ImageView img;

    public MoviesDa (){
        mov.add(new movie ("Jumanji",2019,"Adventure"));
        mov.add(new movie ("Fast and Furious",2017,"Action"));
        mov.add(new movie ("The Three Stooges",2012,"Comedy"));
        mov.add(new movie ("I can only Imagine",2018,"Drama"));
        mov.add(new movie ("47 meters Down",2019,"Horror"));
        mov.add(new movie ("The Maze Runner",2014,"Adventure"));
        mov.add(new movie ("My Sister Keeper",2009,"Drama"));
        mov.add(new movie ("The Boy",2019,"Horror"));

    }
    public List<movie> getMovies(String g){
        ArrayList<movie> data = new ArrayList<>();
        for(movie gn : mov){
            if(gn.getGenre().equals(g)){
                data.add(gn);
            }
        }
        return data;

    }

    @Override
    public List<String> getGenre() {
 ArrayList <String> genre = new ArrayList<>();

 genre.add("Action");
 genre.add("Horror");
 genre.add("Comedy");
 genre.add("Adventure");
 genre.add("Drama");
 return genre;
    }



}
