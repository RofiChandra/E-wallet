<<<<<<< HEAD
package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class profile extends AppCompatActivity {

    private View pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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

    // public void toPromoCode (View v){
    //     Intent intent = new Intent(this,promo_code.class);
    //     startActivity(intent);
    // }

    public void exit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Apakah anda yakin untuk logout?");
        builder.setPositiveButton("Ya, Saya yakin.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak, saya tidak yakin.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    

    public void toHistory(View v) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void toPromo(View v) {
        Intent intent = new Intent(this, promo.class);
        startActivity(intent);
    }

    public void toHome(View v) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void toTransfer(View v) {
        Intent intent = new Intent(this, transfer.class);
        startActivity(intent);
    }

    // public void toRequest(View v){
    // 	Intent intent = new Intent(this,request.class);
    // 	startActivity(intent);
    // }

    public void toTopup(View v) {
        Intent intent = new Intent(this, topup_menu.class);
        startActivity(intent);
    }
}


=======
package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class profile extends AppCompatActivity {

    private View pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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

    // public void toPromoCode (View v){
    //     Intent intent = new Intent(this,promo_code.class);
    //     startActivity(intent);
    // }



    public void toTransfer(View v){
        Intent intent = new Intent(this,transfer.class);
    public void exit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Apakah anda yakin untuk logout?");
        builder.setPositiveButton("Ya, Saya yakin.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak, saya tidak yakin.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    

    public void toHistory(View v) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void toPromo(View v) {
        Intent intent = new Intent(this, promo.class);
        startActivity(intent);
    }

    public void toHome(View v) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void toTransfer(View v) {
        Intent intent = new Intent(this, transfer.class);
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
>>>>>>> 64ae962ebf756e7784f3b6ae589fbc3e8e57a0b6
