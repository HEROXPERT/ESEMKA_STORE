package com.example.esemkastore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esemkastore.adapter.ProductAdapter;
import com.example.esemkastore.model.Product;

import java.util.ArrayList;
import java.util.List;

//Off-White Nike Air Jordan 1 "UNC"
//Rp 12.000.000,00
//
//
//Air Jordan 4RM
//Rp 2,199,000
//
//Air Jordan 13 Retro 'White and Midnight Navy'
//Rp 3,269,000
//
//Air Jordan 5 Retro 'Lucky Green'
//Rp 3,169,000
//
//
//Air Jordan 9 G NRG
//Rp 3,369,000

public class ProductRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> products = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_recycler_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        products.add(new Product(R.drawable.airjordan9gnrgm24, "Air Jordan 9 G NRG", "Rp 3,369,000"));
        products.add(new Product(R.drawable.airjordan13retro, "Air Jordan 13 Retro 'White and Midnight Navy'", "Rp 3,269,000"));
        products.add(new Product(R.drawable.airjordanoffwhitechicago, "Off-White Nike Air Jordan 1 'UNC'", "Rp 12.000.000,00"));
        products.add(new Product(R.drawable.wmnsairjordan5retro, "Air Jordan 5 Retro 'Lucky Green'", "Rp 3,169,000"));
        products.add(new Product(R.drawable.wnsairjordan4rm, "Air Jordan 4RM", "Rp 2,199,000"));

        recyclerView.setAdapter(new ProductAdapter(this, products));
    }
}