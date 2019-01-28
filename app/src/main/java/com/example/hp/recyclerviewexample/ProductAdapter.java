package com.example.hp.recyclerviewexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter
{
    private Context mContext;
    private List<Product> products;

    public ProductAdapter(Context mContext, List<Product> products) {
        this.mContext = mContext;
        this.products = products;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view= LayoutInflater.from(mContext).inflate(R.layout.product,viewGroup,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder holder = (ViewHolder) viewHolder;
        Product product= products.get(i);
        holder.imageView.setImageResource(product.getImage());
        holder.newsText.setText(product.getNews());
        holder.dateText.setText(product.getDate());
        holder.detailText.setText(product.getDetail());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView newsText,dateText,detailText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            newsText=(TextView)itemView.findViewById(R.id.news);
            dateText=(TextView)itemView.findViewById(R.id.date);
            detailText=(TextView)itemView.findViewById(R.id.detail);

        }

    }
}
