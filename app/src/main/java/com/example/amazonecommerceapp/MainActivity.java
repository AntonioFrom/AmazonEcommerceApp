package com.example.amazonecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button joinNowButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinNowButton = findViewById(R.id.main_join_now_btn);
        loginButton = findViewById(R.id.main_login_btn);

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        });

        joinNowButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}