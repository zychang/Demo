package com.example.demo;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.WindowManager;

public class ForceOfflineRecevier extends BroadcastReceiver{

	@Override
	public void onReceive(final Context context, Intent intent) {
		// TODO Auto-generated method stub
		AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(context);
		dialogbuilder.setTitle("Warning");
		dialogbuilder.setMessage("You are forced to be offline, Please try to login again.");
		dialogbuilder.setCancelable(false);
		dialogbuilder.setPositiveButton("OK", new OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				ActivityCollector.finishAll();
				Intent intent =new Intent(context, MainActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(intent);
			}
		});
		AlertDialog alertDialog = dialogbuilder.create();
		
		alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		alertDialog.show();
	}

}
