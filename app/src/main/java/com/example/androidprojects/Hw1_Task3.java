package com.example.androidprojects;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidprojects.adapter.ArtAdapter;
import com.example.androidprojects.adapter.BookAdapter;
import com.example.androidprojects.model.Art;
import com.example.androidprojects.model.Book;

import java.util.ArrayList;

public class Hw1_Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hw1_task3);


        ArrayList<Book> books= new ArrayList<>();
        books.add(new Book("Martin Iden","Jacl London",R.drawable.img_4));
        books.add(new Book("Lord of the Flies","William Golding",R.drawable.img_5));
        books.add(new Book("Animal Farm","George Orwell",R.drawable.img_6));

        Spinner bookSpinner = findViewById(R.id.book_spinner);
        TextView selectedBook = findViewById(R.id.selected_book);
        ImageView selectedBookImage = findViewById(R.id.selected_book_image);

        BookAdapter adapter = new BookAdapter(this,R.layout.spinner_item,books);
        bookSpinner.setAdapter(adapter);

        bookSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Book selected = (Book) parent.getItemAtPosition(position);
                selectedBook.setText("You choce : " + selected.getBookName());
                selectedBookImage.setImageResource(selected.getImageResource());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedBook.setText("");
            }
        });



    }
}