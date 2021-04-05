package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class login extends AppCompatActivity {

    private EditText et_uname;
    private EditText et_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_name = findViewById(R.id.input_uname);
        et_pass = findViewById(R.id.input_pass);
    }

    public void validate(View v){
        if(!isEmpty(et_name || et_pass)){
            toHome();
        }else{
            Snackbar.make(findViewById(R.id.logbutton),"Login Failed Admin.",Snackbar.LENGTH_LONG).show();
        }
    }

    public void toHome(View v){
        Intent intent = new Intent(this,activity_home.class);
        startActivity(intent);
    }
}