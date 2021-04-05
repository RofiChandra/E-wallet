package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class konfirmasi_transfer_bank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_transfer_bank);
    }

        public void toInvoiceBank(View v){
        Intent intent = new Intent(this,activity_invoice_bank.class);
        startActivity(intent);
    }

    public void toTransferBank(View v){
        Intent intent = new Intent(this,activity_transfer_bank.class);
        startActivity(intent);
     }
}