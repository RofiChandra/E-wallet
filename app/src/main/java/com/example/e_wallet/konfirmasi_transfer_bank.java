package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class konfirmasi_transfer_bank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_transfer_bank);
        getSupportActionBar().hide();
    }

        public void toInvoiceBank(View v){
        Intent intent = new Intent(this,invoice_bank.class);
        startActivity(intent);
    }

    public void toTransferBank(View v){
        Intent intent = new Intent(this,transfer_bank.class);
        startActivity(intent);
     }
}