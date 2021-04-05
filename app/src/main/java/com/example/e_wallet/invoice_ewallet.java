package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class invoice_ewallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_ewallet);
    }

        public void toHome(View v){
        Intent intent = new Intent(this,activity_home.class);
        startActivity(intent);
    }
}

