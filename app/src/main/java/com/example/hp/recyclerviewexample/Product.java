package com.example.hp.recyclerviewexample;

import android.graphics.Bitmap;

public class Product {
    private int image;
    private String news;
    private String date;
    private String detail;


    public Product(int image, String news, String date, String detail) {
        this.image = image;
        this.news = news;
        this.date = date;
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
