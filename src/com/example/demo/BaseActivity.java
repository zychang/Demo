package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class BaseActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);			
	}
	
	public void onDestroy(){
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
