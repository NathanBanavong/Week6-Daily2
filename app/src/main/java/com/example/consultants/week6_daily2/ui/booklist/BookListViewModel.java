package com.example.consultants.week6_daily2.ui.booklist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.consultants.week6_daily2.model.Book;
import com.example.consultants.week6_daily2.model.data.BookRepository;
import com.example.consultants.week6_daily2.model.data.local.LocalDataSource;
import com.example.consultants.week6_daily2.model.data.remote.RemoteDataSource;

import java.util.List;

public class BookListViewModel extends ViewModel {

    private BookRepository bookRepository;

    public BookListViewModel() {
        bookRepository = new BookRepository(new RemoteDataSource(), new LocalDataSource());

    }

    public LiveData<List<Book>> getBooks(){
        return bookRepository.getBooks();
    }
}
