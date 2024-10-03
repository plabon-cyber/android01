package com.atozmediaapk.textilefocus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageViewAdapter extends RecyclerView.Adapter<ImageViewAdapter.MyViewHolder> {

    private ArrayList<ModelRetrive> dataList;
    private Context context;

    public ImageViewAdapter(Context context, ArrayList<ModelRetrive> dataList) {

        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemimageview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Glide.with(context).load(dataList.get(position).getImage()).into(holder.recyclerImage);
        holder.recyclerCaption.setText(dataList.get(position).getSurname());
        holder.recyclerCaption1.setText(dataList.get(position).getEmail());
        Picasso.get().load(String.valueOf(dataList)).into(holder.recyclerImage);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView recyclerImage;
        TextView recyclerCaption,recyclerCaption1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerImage = itemView.findViewById(R.id.book_img);
            recyclerCaption = itemView.findViewById(R.id.book_author);
            recyclerCaption1 = itemView.findViewById(R.id.book_name_tv);
        }
    }
}