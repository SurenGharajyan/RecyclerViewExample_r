package com.example.user.recyclerview_patrastum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_obyekt;
    List<String> names;
    List<Float> rateing;
    RecyclerView.LayoutManager rv_layoutmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names=new ArrayList<>();
        rateing=new ArrayList<>();
        rateing.add(0.5f);
        rateing.add(5f);
        rateing.add(5f);
        names.add("Suren");
        names.add("Hayko");
        names.add("Davo");
        rv_obyekt=(RecyclerView) findViewById(R.id.recycler_id);
        rv_layoutmanager=new LinearLayoutManager(this);
        rv_obyekt.setLayoutManager(rv_layoutmanager);
        rv_obyekt.setAdapter(new Adap(names,rateing,this));

    }

}
