package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import static android.text.TextUtils.isEmpty;

public class login extends AppCompatActivity {

    private EditText et_uname;
    private EditText et_pass;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_uname = findViewById(R.id.input_uname);
        et_pass = findViewById(R.id.input_pass);
        btn_submit = findViewById(R.id.login_btn);
    }

    public void validate(View v){
        String username = et_uname.getText().toString();
        String pass = et_pass.getText().toString();
        if(!isEmpty(username) && !isEmpty(pass) ){
            toHome();
        }else{
            Snackbar.make(findViewById(R.id.login_btn),"Login Gagal.",Snackbar.LENGTH_LONG).show();
        }
    }

    public void toHome(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
}