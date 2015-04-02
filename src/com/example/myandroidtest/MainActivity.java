package com.example.myandroidtest;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FinalActivity {
	
	
	private EditText edt_name;
	private EditText edt_pwd;
	private Button btn_login;
	
	
	SharedPreferences sp = null;
	Editor editor = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sp = getSharedPreferences("LoginSP", Context.MODE_PRIVATE);
		editor = sp.edit();
		edt_name = (EditText) findViewById(R.id.edit_name);
		edt_pwd = (EditText) findViewById(R.id.edit_pwd);
		btn_login = (Button) findViewById(R.id.btn_login);
		
		edt_name.setText(sp.getString("loginName", ""));
		edt_pwd.setText(sp.getString("loginPwd", ""));

		
		
		btn_login.setOnClickListener(loginBtnListener);
		
	}

	
	public OnClickListener loginBtnListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			String name = edt_name.getText().toString();
			String pwd = edt_pwd.getText().toString();
			
			if(!strValueCheck(name)){
				Toast.makeText(getApplicationContext(), " name is not allowed null", Toast.LENGTH_SHORT).show();
				return;
			}
			if(!strValueCheck(pwd)){
				Toast.makeText(getApplicationContext(), " password is not allowed null", Toast.LENGTH_SHORT).show();
				return;
			}
			editor.putString("loginName", name);
			editor.putString("loginPwd", pwd);
			
			
		}
	};
	/**
	 * check the string is or not null
	 * @param str
	 * @return
	 */
	public boolean strValueCheck(String str){
		if(str == null || "".equals(str)){
			return false;
		}else{
			return true;
		}
	}
}
