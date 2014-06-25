package com.tutorial.multiactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		 int age = getIntent().getIntExtra("user-age", -1);
		String name = getIntent().getStringExtra("user-name");
		
		TextView txtLabel =(TextView)findViewById(R.id.textViewActTwo);
		
		txtLabel.setText("Your name is " + name +" you are " +age+ " years old.");
		
		
		Button btnTwo = (Button)findViewById(R.id.buttonActTwo);
		
		btnTwo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("dog-years", 210);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}



}
