package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import static android.text.TextUtils.isEmpty;

public class Regist extends AppCompatActivity {
    private EditText et_email;
	private EditText et_uname;
    private EditText et_pass;
    private EditText et_repass;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        getSupportActionBar().hide();

        et_email = findViewById(R.id.email_input);
        et_uname = findViewById(R.id.username_input);
        et_pass = findViewById(R.id.pass_input);
        et_repass = findViewById(R.id.repass_input);
        btn_submit = findViewById(R.id.regist_btn);
    }

	public void toLogin(){
		Intent intent = new Intent(this,login.class);
		startActivity(intent);
    }

<<<<<<< HEAD
    public void validation(View v) {
=======
    public void validation(View v){
>>>>>>> 0ab2ab79961f264e2f62ab7f532e5a04d6c00658
        String email = et_email.getText().toString();
        String username = et_uname.getText().toString();
        String pass = et_pass.getText().toString();
        String repass = et_repass.getText().toString();
        if (!isEmpty(email) && !isEmpty(username) && !isEmpty(pass) && !isEmpty(repass)) {
            toLogin();
<<<<<<< HEAD
        } else {
            Snackbar.make(findViewById(R.id.regist_btn), "Registrasi gagal.", Snackbar.LENGTH_LONG).show();
=======
        }else{
            Snackbar.make(findViewById(R.id.regist_btn),"Pastikan Seluruh Form Terisi!",Snackbar.LENGTH_LONG).show();
>>>>>>> 0ab2ab79961f264e2f62ab7f532e5a04d6c00658
        }

    }

    public void toLoginEt(View v) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
    }

