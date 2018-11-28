package com.example.consultants.week6_daily2.ui.booklist;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.consultants.week6_daily2.R;
import com.example.consultants.week6_daily2.model.Book;

import java.util.List;


public class BookListActivity extends AppCompatActivity {

    private static final String TAG = BookListActivity.class.getSimpleName()+ "_TAG";

    RecyclerView rvBookList;
//    private BookListAdapter bookListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
//        TODO need to pass the list of books to local array
//        onBindView();

        BookListViewModel viewModel = ViewModelProviders.of(this).get(BookListViewModel.class);

        rvBookList = findViewById(R.id.rvBookList);

        viewModel.getBooks().observe(this, new Observer<List<Book>>() {
            @Override
            public void onChanged(@Nullable List<Book> books) {
                for (Book book : books) {
                    //TODO See if this adds the books to the local array-list
//                    leBooks.add(book);
                    Log.d(TAG, "onChanged: " + book.toString());
                }
                BookListAdapter bookListAdapter = new BookListAdapter(books, getApplicationContext());
                rvBookList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                rvBookList.setAdapter(bookListAdapter);
            }
        });
    }

//    public void onBindView(){
//        rvBookList = findViewById(R.id.rvBookList);
////        leBooks = bookListAdapter.bookList;
////        rvBookList.setLayoutManager(new LinearLayoutManager(this));
////        rvBookList.setAdapter(bookListAdapter);
//    }

}
