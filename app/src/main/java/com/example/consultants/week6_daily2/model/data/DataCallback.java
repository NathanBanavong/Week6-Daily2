package com.example.consultants.week6_daily2.model.data;

import com.example.consultants.week6_daily2.model.Book;

import java.util.List;

public interface DataCallback {

    void onSuccess(List<Book> bookList);

    void onFailure(String error);
}
