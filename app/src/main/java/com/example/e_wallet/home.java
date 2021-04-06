package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

	private View pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

		pay = findViewById(R.id.pay);

		// pay.setOnClickListener(new View.OnclickListener(){
		// 	@Override
		// 	public void onClick(View v){
		// 		Intent openCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		// 		startActivityForResult(openCamera, requestCode: 100);
		// 	}
		// });
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
	
	// public void toTopup(View v){
	// 	Intent intent = new Intent(this,topup.class);
	// 	startActivity(intent);
	// }
}