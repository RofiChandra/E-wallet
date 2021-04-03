package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Regist extends AppCompatActivity {

	private TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
    }
	
	public void toLogin(View v){
		Intent intent = new Intent(this,activity_login.class);
		startActivity(intent);
}