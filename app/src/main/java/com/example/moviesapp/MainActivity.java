package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ListMenuItemView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moviesapp.model.IMovieData;
import com.example.moviesapp.model.MoviesFactory;
import com.example.moviesapp.model.movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText s ;
TextView t ;
private Spinner spinner ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.sMov);
        t = findViewById(R.id.result);
        spinner = findViewById(R.id.spinner);

        populateSpinner();


    }

    private void populateSpinner() {
        MoviesFactory factory = new MoviesFactory();
        IMovieData objMovies = factory.getModel();

        List <String> genre = objMovies.getGenre();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,genre);
        spinner.setAdapter(adapter);
    }

    public void btnGetMoviesOnClick(View view) {
        MoviesFactory factory = new MoviesFactory();
        IMovieData objMovies = factory.getModel();


        String item = "";
        item = spinner.getSelectedItem().toString();
        s.setText(item);



        String text = s.getText().toString();
        List <movie> mv = objMovies.getMovies(text);
        String str = "";
        for( movie m : mv){
            str+= m.getTitle() + "(" + m.getYear() + ")" +m.getGenre() +"\n";

        }
        t.setText(str);


        }

    }
