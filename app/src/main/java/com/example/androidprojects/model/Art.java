package com.example.androidprojects.model;

public class Art {
    private String artName;
    private String authorName;
    private int imageResource;

    public Art(String name,String author, int image){
        this.artName = name;
        this.authorName = author;
        this.imageResource = image;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
