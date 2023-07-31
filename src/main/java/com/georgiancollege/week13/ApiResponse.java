package com.georgiancollege.week13;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("data")
    private BookData[] bookData;

    public BookData[] getBookData() {
        return bookData;
    }
}
