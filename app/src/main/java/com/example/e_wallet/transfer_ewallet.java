package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transfer_ewallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_ewallet);
        getSupportActionBar().hide();
    }

    public void toTransfer(View v){
        Intent intent = new Intent(this,transfer.class);
        startActivity(intent);
    }
}