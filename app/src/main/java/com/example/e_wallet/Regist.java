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

    public void validation(View v){
        String email = et_email.getText().toString();
        String username = et_uname.getText().toString();
        String pass = et_pass.getText().toString();
        String repass = et_repass.getText().toString();
        if(!isEmpty(email) && !isEmpty(username) && !isEmpty(pass) && !isEmpty(repass)){
            toLogin();
        }else{
            Snackbar.make(findViewById(R.id.regist_btn),"Registrasi gagal.",Snackbar.LENGTH_LONG).show();
        }

        }
    }

