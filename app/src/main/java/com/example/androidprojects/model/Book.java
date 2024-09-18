package com.example.androidprojects.model;

public class Book{
    private String bookTitle;
    private String bookAuthor;
    private int imageResource;

    public Book(String bookName, String bookAuthor, int imageResource) {
        this.bookTitle = bookName;
        this.bookAuthor = bookAuthor;
        this.imageResource = imageResource;
    }

    public String getBookName() {
        return bookTitle;
    }

    public void setBookName(String bookName) {
        this.bookTitle = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
