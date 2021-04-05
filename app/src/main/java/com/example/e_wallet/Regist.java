package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    private void validation(View v){
        if(!isEmpty(tv_email && tv_uname && tv_pass & tv_repass)){
            toLogin();
        }else{
            Snackbar.make(findViewById(R.id.btn_submit),"Registrasi gagal.",Snackbar.LENGTH_LONG).show();
        }

        }
    }

