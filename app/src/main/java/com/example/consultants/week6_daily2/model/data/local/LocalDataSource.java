package com.example.consultants.week6_daily2.model.data.local;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.consultants.week6_daily2.model.Book;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LocalDataSource {

//    BookDao bookDao;
//    BookDatabase bookDatabase;
//
//
//    public LocalDataSource(Context context) {
//        bookDao = bookDatabase.bookDao();
//        bookDatabase = Room.databaseBuilder(context, BookDatabase.class, "BookDatabase.db").build();
//    }

//    TODO need to retrieve books and put into local
//    public void getBook(final Callback callback){
//        bookDao.getBooks().observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<List<Book>>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(List<Book> bookList) {
//                        callback.onBookData(bookList);
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//
//    }

//    public interface Callback {
//        void onBookData(List<Book> bookList);
//    }

}
