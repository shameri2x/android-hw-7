package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokeman> myPokeman = new ArrayList<>();

        pokeman p1 = new pokeman("Bulbasaur ", R.drawable.bulbasaur, 49,49,318);
        pokeman p2 = new pokeman("ivysaur ", R.drawable.ivysaur, 62,63,405);
        pokeman p3 = new pokeman("Venusaur ", R.drawable.venusaur, 82,83,625);
        pokeman p4 = new pokeman("Charmander ", R.drawable.charmander, 52,43,309);

        myPokeman.add(p1);
        myPokeman.add(p2);
        myPokeman.add(p3);
        myPokeman.add(p4);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager rvv = new LinearLayoutManager(this);
        rv.setLayoutManager(rvv);







    }
}
