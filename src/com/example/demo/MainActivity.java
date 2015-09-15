package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
	
	private EditText accountEdit;
	private EditText passwordEdit;
	private Button loginin;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		accountEdit = (EditText) findViewById(R.id.account);
	    passwordEdit = (EditText) findViewById(R.id.password);
	    loginin = (Button) findViewById(R.id.login);
	}

	public void login_button(View view){
		String account = accountEdit.getText().toString();
		String password = passwordEdit.getText().toString();
		if(account.equals("admin")&&password.equals("123456")){
			Intent intent = new Intent(MainActivity.this, qq.class);
			startActivity(intent);
			finish();			
		}else{
			Toast.makeText(MainActivity.this, "account or psssword is error", Toast.LENGTH_LONG).show();
			
		}
	}
}






