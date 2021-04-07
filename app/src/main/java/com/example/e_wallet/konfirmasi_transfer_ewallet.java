package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class konfirmasi_transfer_ewallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_transfer_ewallet);
        getSupportActionBar().hide();
    }

            public void toInvoiceWallet(View v){
        Intent intent = new Intent(this,invoice_ewallet.class);
        startActivity(intent);
    }

    public void toTransferWallet(View v){
        Intent intent = new Intent(this,transfer_ewallet.class);
        startActivity(intent);
     }
}