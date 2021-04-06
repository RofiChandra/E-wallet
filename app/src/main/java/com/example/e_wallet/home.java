package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class home extends AppCompatActivity {

	private View pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
		getSupportActionBar().hide();

		pay = findViewById(R.id.pay);

		pay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent open_camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(open_camera, 100);
			}
		});



    }

	// @Override
	// public void onActivityResult(int requestCode, int resultCode,)
	// Bitmap photo = (Bitmap)data.getExtras().get("data");
	// ImageView.SetImageBitmap(photo);

	
	public void toHistory(View v){
		Intent intent = new Intent(this,HistoryActivity.class);
		startActivity(intent);
	}
	
	public void toPromo(View v){
		Intent intent = new Intent(this,promo.class);
		startActivity(intent);
	}
	
	public void toProfile(View v){
		Intent intent = new Intent(this,profile.class);
		startActivity(intent);
	}
	
	public void toTransfer(View v){
		Intent intent = new Intent(this,transfer.class);
		startActivity(intent);
	}
	
	// public void toRequest(View v){
	// 	Intent intent = new Intent(this,request.class);
	// 	startActivity(intent);
	// }
	
	 public void toTopup(View v){
	 	Intent intent = new Intent(this,topup_menu.class);
	 	startActivity(intent);
	 }
}