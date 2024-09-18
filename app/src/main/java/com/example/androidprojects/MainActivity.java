package com.example.androidprojects;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//ProgressBar progressBar = findViewById(R.id.progressBar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }

    public void startFirstTask(View view){
            Intent intent = new Intent(MainActivity.this,FirstTask.class);
            startActivity(intent);
    }

    public void hw1_task2(View view){
        Intent intent = new Intent(MainActivity.this,Hw1_Task2.class);
        startActivity(intent);
    }

    public void hw1_task3(View view){
        Intent intent = new Intent(MainActivity.this,Hw1_Task3.class);
        startActivity(intent);
    }
}