package com.example.consultants.week6_daily2.ui.booklist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.consultants.week6_daily2.model.Book;
import com.example.consultants.week6_daily2.ui.viewholder.BookImageViewHolder;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookImageViewHolder> {

    List<Book> bookList;

    public BookListAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BookImageViewHolder bookImageViewHolder, int i) {



    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
