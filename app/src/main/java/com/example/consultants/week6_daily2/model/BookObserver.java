package com.example.consultants.week6_daily2.model;

import android.util.Log;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BookObserver implements Observer<List<Book>> {
    
    public static final String TAG = BookObserver.class.getSimpleName() + "_TAG";
    Callback callback;

    public static BookObserver addCallback(Callback callback) {
        Log.d(TAG, "addCallback: ");
        BookObserver bookObserver = new BookObserver();
        bookObserver.setCallback(callback);
        return bookObserver;
    }

    private void setCallback(Callback callback) {
        this.callback = callback;
    }


    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(List<Book> books) {
        Log.d(TAG, "onNext: ");
        callback.onNext(books);

    }

    @Override
    public void onError(Throwable e) {
        Log.d(TAG, "onError: ");
        callback.onError(e.getMessage());
    }

    @Override
    public void onComplete() {

    }

    public interface Callback {
        void onNext(List<Book> books);

        void onError(String error);
    }
}
