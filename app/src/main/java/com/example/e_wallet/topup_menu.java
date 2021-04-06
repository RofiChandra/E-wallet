package com.example.e_wallet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class topup_menu extends AppCompatActivity {

    private View btn_bca;
    private View btn_mbank;
    private View btn_metode;

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_atm:
                    f = new FragmentAtm();
                    break;
                case R.id.menu_lain:
                    f = new FragmentLainnya();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,  f).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup_menu);
        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

        btn_bca = findViewById(R.id.bca);
        btn_mbank = findViewById(R.id.m_bca);
        btn_metode = findViewById(R.id.menu_lain);
    }

    public void toTopupBank(View v){
        Intent intent = new Intent(this,StepAtmActivity.class);
        startActivity(intent);
    }

    public void toTopupWallet(View v){
        Intent intent = new Intent(this,StepMobileActivity.class);
        startActivity(intent);
    }

    public void toTopupMetode(View v){
        Intent intent = new Intent(this,StepOtherMethodActivity.class);
        startActivity(intent);
    } 

    }
