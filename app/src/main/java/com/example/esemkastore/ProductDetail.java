package com.example.esemkastore;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetail extends AppCompatActivity {

    ImageView imageView;
    TextView nameTextView, priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.productDetailImage);
        nameTextView = findViewById(R.id.productDetailNameTextView);
        priceTextView = findViewById(R.id.productDetailPriceTextView);

        int image = getIntent().getIntExtra("DetailImage", -1);
        String name = getIntent().getStringExtra("DetailName");
        String price = getIntent().getStringExtra("DetailPrice");

        imageView.setImageResource(image);
        nameTextView.setText(name);
        priceTextView.setText(price);

    }
}