package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class qq extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cgdl);	
		Button send_Button = (Button) findViewById(R.id.send_broad);
		
	}
	public void send(View view){
		Intent intent = new Intent("com.example.demo.FORCE_OFFLINE");
		sendBroadcast(intent);
	}
}
