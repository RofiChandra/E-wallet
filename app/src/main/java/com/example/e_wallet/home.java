package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
	
	public void toHistory(View v){
		Intent intent = new Intent(this,history.class);
		startActivity(intent);
	}
	
	public void toPromo(View v){
		Intent intent = new Intent(this,promo.class);
		startActivity(intent);
	}
	
	public void toProfile(View v){
		Intent intent = new Intent(this,promo.class);
		startActivity(intent);
	}
	
	public void toTransfer(View v){
		Intent intent = new Intent(this,transfer.class);
		startActivity(intent);
	}
	
	public void toRequest(View v){
		Intent intent = new Intent(this,request.class);
		startActivity(intent);
	}
	
	public void toTopup(View v){
		Intent intent = new Intent(this,topup.class);
		startActivity(intent);
	}
}