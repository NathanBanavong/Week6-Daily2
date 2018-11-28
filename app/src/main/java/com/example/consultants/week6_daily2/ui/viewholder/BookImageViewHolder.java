package com.example.consultants.week6_daily2.ui.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.consultants.week6_daily2.R;

public class BookImageViewHolder extends RecyclerView.ViewHolder {

    ImageView ivBook;
    public BookImageViewHolder(@NonNull View itemView) {
        super(itemView);

        ivBook = itemView.findViewById(R.id.ivBook);
    }
}
