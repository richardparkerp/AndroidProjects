package com.example.androidprojects;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FirstTask extends AppCompatActivity {
    ArrayList<String> users = new ArrayList<>();
    ArrayAdapter<String> adapter;
    ListView usersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first_task);

        Collections.addAll(users,"Richard Parker","Pi Patel","Ravi Patel", "Mamadgi");
        usersList = findViewById(R.id.userList);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,users);
        usersList.setAdapter(adapter);


    }

    public void add(View view){
        EditText userName = findViewById(R.id.userName);
        String user = userName.getText().toString();
        if(!user.isEmpty()){
            adapter.add(user);
            userName.setText("");
            adapter.notifyDataSetChanged();
        }
    }

}