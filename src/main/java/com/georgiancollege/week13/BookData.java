package com.georgiancollege.week13;

import com.google.gson.annotations.SerializedName;

public class BookData {
    private int id;

    private String title;

    private String author;

    private String genre;

    private String description;

    @SerializedName("published")
    private String publishedDate;

    private String publisher;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }
}
