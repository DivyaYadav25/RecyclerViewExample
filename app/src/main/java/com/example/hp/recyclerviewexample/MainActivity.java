package com.example.hp.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter productAdapter;
    List<Product> productList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data();
        recyclerView= (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productAdapter= new ProductAdapter(this,productList);
        recyclerView.setAdapter(productAdapter);

    }

    private void data()
    {
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
        productList.add(new Product(R.drawable.im,"news","date","detail"));
    }



}
