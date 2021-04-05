package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Regist extends AppCompatActivity {
    private TextView tv_email;
	private TextView tv_uname;
    private TextView tv_pass;
    private TextView tv_repass;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        tv_email = findViewById(R.id.email_input);
        tv_uname = findViewById(R.id.username_input);
        tv_pass = findViewById(R.id.pass_input);
        tv_repass = findViewById(R.id.repass_input);
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
