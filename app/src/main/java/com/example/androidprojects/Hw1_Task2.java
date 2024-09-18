package com.example.androidprojects;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidprojects.adapter.ArtAdapter;
import com.example.androidprojects.model.Art;
import java.util.ArrayList;

public class Hw1_Task2 extends AppCompatActivity {

    private ArrayList<Art> arts;
    private ArtAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hw1_task2);

        ListView listView =findViewById(R.id.listView);

        arts = new ArrayList<>();
        arts.add(new Art("Nova" ,"Ziza" ,R.drawable.img_1));
        arts.add(new Art("Sio" ,"Asew" ,R.drawable.img_2));
        arts.add(new Art("Ciper" ,"Loas" ,R.drawable.img_3));

        adapter = new ArtAdapter(this,arts);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.removeItem(position);
                return true;
            }
        });


    }
}