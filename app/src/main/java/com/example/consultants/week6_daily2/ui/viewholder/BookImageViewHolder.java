package com.example.consultants.week6_daily2.ui.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.consultants.week6_daily2.R;

public class BookImageViewHolder extends RecyclerView.ViewHolder {

    public ImageView ivBook;
    public TextView tvTitle;

    public BookImageViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        ivBook = itemView.findViewById(R.id.ivBook);
    }
}
