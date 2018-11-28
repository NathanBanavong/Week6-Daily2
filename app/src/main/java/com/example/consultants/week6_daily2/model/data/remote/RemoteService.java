package com.example.consultants.week6_daily2.model.data.remote;

import com.example.consultants.week6_daily2.model.Book;
import com.example.consultants.week6_daily2.utils.NetworkAPI;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RemoteService {
    @GET(NetworkAPI.PATH)
    Observable<List<Book>> getBooks();
}
