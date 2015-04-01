package com.example.myandroidtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	
	private EditText edt_name;
	private EditText edt_pwd;
	private Button btn_login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		edt_name = (EditText) findViewById(R.id.edit_name);
		edt_pwd = (EditText) findViewById(R.id.edit_pwd);
		btn_login = (Button) findViewById(R.id.btn_login);
		
		btn_login.setOnClickListener(btnListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_listview) {
			Toast.makeText(this, "listview", Toast.LENGTH_SHORT).show();
			return true;
		}else if (id == R.id.action_gridview) {
			Toast.makeText(this, "gridview", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public OnClickListener btnListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			String name = edt_name.getText().toString();
			String pwd = edt_pwd.getText().toString();
			if("".equals(name)){
				
			}
		}
	};
}
