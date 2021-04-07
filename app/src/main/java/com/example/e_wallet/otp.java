package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        getSupportActionBar().hide();
    }

    public void toLogin(View v) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void toRegist2(View v) {
        Intent intent = new Intent(this, register2.class);
        startActivity(intent);
    }
}