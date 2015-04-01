package com.example.myandroidtest;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FinalActivity {
	
	
	private EditText edt_name;
	private EditText edt_pwd;
	@ViewInject(id=R.id.btn_login,click="loginBtnListener")Button btn_login;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		edt_name = (EditText) findViewById(R.id.edit_name);
		edt_pwd = (EditText) findViewById(R.id.edit_pwd);
		
	}

	
	public OnClickListener loginBtnListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
			String name = edt_name.getText().toString();
			String pwd = edt_pwd.getText().toString();
			if("".equals(name)){
				Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
			}
		}
	};
}
