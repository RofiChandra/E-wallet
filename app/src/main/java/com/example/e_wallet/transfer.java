package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        getSupportActionBar().hide();
    }

    public void toHome(View v){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }

        public void toWallet(View v){
        Intent intent = new Intent(this,transfer_ewallet.class);
        startActivity(intent);
    }

    public void toBank(View v){
        Intent intent = new Intent(this,transfer_bank.class);
        startActivity(intent);
    }
}