package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon>pokemons = new ArrayList<>();
        pokemon a1 = new pokemon("B" ,R.drawable.bulbasaur , 45 ,49,302 );
        pokemon a2 = new pokemon("a" ,R.drawable.bulbasaur , 40 ,42,392 );
        pokemon a3 = new pokemon("c" ,R.drawable.bulbasaur , 48 ,45,332 );
        pokemon a4 = new pokemon("n" ,R.drawable.bulbasaur , 46 ,65,312 );
        pokemons.add(a1);
        pokemons.add(a2);
        pokemons.add(a3);
        pokemons.add(a4);

        RecyclerView pr = findViewById(R.id.rrr);
    }
}