package com.example.androidprojects.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidprojects.R;
import com.example.androidprojects.model.Art;
import java.util.ArrayList;
import java.util.List;


public class ArtAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Art> arts;
    private LayoutInflater inflater;


    public ArtAdapter(Context context, ArrayList<Art> arts) {
        this.context = context;
        this.arts = arts;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return arts.size();
    }

    @Override
    public Object getItem(int position) {
        return arts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_product, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewAuthor = convertView.findViewById(R.id.textViewAuthorName);

        Art art = arts.get(position);

        imageView.setImageResource(art.getImageResource());
        textViewName.setText(art.getArtName());
        textViewAuthor.setText(art.getAuthorName());

        return convertView;
    }

    public void removeItem(int position) {
        arts.remove(position);
        notifyDataSetChanged();
    }


}
