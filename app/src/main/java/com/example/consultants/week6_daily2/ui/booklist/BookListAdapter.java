package com.example.consultants.week6_daily2.ui.booklist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.consultants.week6_daily2.R;
import com.example.consultants.week6_daily2.model.Book;
import com.example.consultants.week6_daily2.ui.viewholder.BookImageViewHolder;
import com.example.consultants.week6_daily2.ui.viewholder.BookViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class BookListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final String TAG = BookListAdapter.class.getSimpleName() + "_TAG";
    private Context mContext;
    List<Book> bookList;

    public BookListAdapter(List<Book> bookList, Context context) {
        this.bookList = bookList;
        this.mContext = context;
    }

    //    will determine how to get the row
    @Override
    public int getItemViewType(int position) {

        Book book = bookList.get(position);
        if (book.getTitle().contains("Harry"))
            position = 0;
        else
            position = 1;

        return position;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_book_list, null);
        if(i==1)
            return new BookImageViewHolder(view);
        else
            return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: ");
        Book book = bookList.get(i);

        switch (viewHolder.getItemViewType()) {
//            Book item contains 'Harry'
            case 0:
                BookViewHolder bookViewHolder = (BookViewHolder) viewHolder;
                Glide
                        .with(mContext)
                        .load(book.getImageURL())
                        .into(bookViewHolder.ivBook);
                break;
//            Book item not 'Harry'
            case 1:
                BookImageViewHolder leBookViewHolder = (BookImageViewHolder) viewHolder;
//              set the text of the view to have title
                leBookViewHolder.tvTitle.setText(book.getTitle());
//              set the image of the book
                Glide
                        .with(mContext)
                        .load(book.getImageURL())
                        .into(leBookViewHolder.ivBook);
                break;

        }
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: ");
        return bookList.size();
    }
}
