package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transfer_bank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_bank);
        getSupportActionBar().hide();
    }

    public void toTransfer(View v) {
        Intent intent = new Intent(this, transfer.class);
        startActivity(intent);
    }
    
    public void toInvoiceBank(View v) {
        Intent intent = new Intent(this, invoice_bank.class);
        startActivty(intent);
    }
}