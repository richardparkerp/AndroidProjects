package com.example.androidprojects.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidprojects.R;
import com.example.androidprojects.model.Book;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    private Context mContext;
    private int mResource;

    public BookAdapter(Context context, int resource, List<Book> books){
        super(context,resource,books);
        this.mContext=context;
        this.mResource=resource;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        return createViewFromResource(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position,  View convertView, ViewGroup parent) {
        return createViewFromResource(position,convertView,parent);
    }

    public View createViewFromResource(int position, View convertView, ViewGroup parent){
        Book book = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(mResource,parent,false);
        }

        ImageView bookImage = convertView.findViewById(R.id.book_image);
        TextView bookTitle = convertView.findViewById(R.id.book_title);
        TextView bookAuthor = convertView.findViewById(R.id.book_author);

        bookImage.setImageResource(book.getImageResource());
        bookTitle.setText(book.getBookName());
        bookAuthor.setText(book.getBookAuthor());

        return convertView;

    }
}
