package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StepMobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_mobile);
        getSupportActionBar().hide();
    }

        // public void toTopupATM(View v){
    //     Intent intent = new Intent(this,topup_atm.class);
    //     startActivity(intent);
    // }
}