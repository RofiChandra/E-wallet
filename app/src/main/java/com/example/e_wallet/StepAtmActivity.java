package com.example.e_wallet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class StepAtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_atm);
        getSupportActionBar().hide();
    }

    // public void toTopupATM(View v){
    //     Intent intent = new Intent(this,topup_atm.class);
    //     startActivity(intent);
    // }
}