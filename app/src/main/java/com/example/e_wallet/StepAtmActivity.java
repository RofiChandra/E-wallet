package com.example.e_wallet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class StepAtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_atm);
    }

    public void toTopupMenu(View v){
        Intent intent = new Intent(this,topup_menu.class);
        startActivity(intent);
    }
}