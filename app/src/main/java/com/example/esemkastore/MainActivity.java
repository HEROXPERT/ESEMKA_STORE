package com.example.esemkastore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText emailET, passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginBtn = findViewById(R.id.loginBtn);
        emailET = findViewById(R.id.emailEditText);
        passwordET = findViewById(R.id.passwordEditText);

        loginBtn.setOnClickListener((v) -> {
            String email = emailET.getText().toString().trim();
            String password = passwordET.getText().toString().trim();
            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Email and Password Must Be Filled!", Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(MainActivity.this, ProductRecyclerView.class);
                startActivity(intent);
            }
        });
    }
}