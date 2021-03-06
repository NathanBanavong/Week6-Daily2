package com.example.consultants.week6_daily2.model.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.example.consultants.week6_daily2.model.Book;
import com.example.consultants.week6_daily2.model.data.local.LocalDataSource;
import com.example.consultants.week6_daily2.model.data.remote.RemoteDataSource;

import java.util.List;

public class BookRepository {
    public static final String TAG = BookRepository.class.getSimpleName() + "_TAG";

    private MutableLiveData<List<Book>> listLiveData;
    private RemoteDataSource remoteDataSource;
    private LocalDataSource localDataSource;

    public BookRepository(RemoteDataSource remoteDataSource, LocalDataSource localDataSource) {
        Log.d(TAG, "BookRepository: ");
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
        listLiveData = new MutableLiveData<>();
    }

    public LiveData<List<Book>> getBooks() {
        Log.d(TAG, "getBooks: ");
        remoteDataSource.getBooks(new DataCallback() {
            @Override
            public void onSuccess(List<Book> bookList) {
                Log.d(TAG, "onSuccess: ");
                listLiveData.setValue(bookList);
            }

            @Override
            public void onFailure(String error) {
                Log.d(TAG, "onFailure: ");
            }
        });
        return listLiveData;
    }
}
