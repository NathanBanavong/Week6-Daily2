package com.example.consultants.week6_daily2.model.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.consultants.week6_daily2.model.Book;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface BookDao {

    @Update
    Flowable<List<Book>> updateBooks();

//    TODO does not like Query for Book
//    @Query("SELECT * FROM Book")
//    Flowable<List<Book>> getBooks();

}
