package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class forgot_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();
    }

    public void toLogin(View v) {
        Intent intent = Intent(this, login.class);
        startActivity(intent);
    }
}