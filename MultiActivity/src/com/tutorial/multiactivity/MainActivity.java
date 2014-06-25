package com.tutorial.multiactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final int REQUEST_CODE_FUNCTONE = 100;

	TextView txtLabel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtLabel =(TextView)findViewById(R.id.textViewActOne);
		
		Button btnOne =(Button)findViewById(R.id.buttonActOne);
		
		btnOne.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
				intent.putExtra("user-age", 30);
				intent.putExtra("user-name", "Roman");

				//startActivity(intent);
				startActivityForResult(intent, REQUEST_CODE_FUNCTONE);
				
			}
		});
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if(requestCode==REQUEST_CODE_FUNCTONE){
			if(resultCode==RESULT_OK){
				int years = data.getIntExtra("dog-years", -1);
				if(-1!=years){
					txtLabel.setText("You are " +years+ " dog years old!!" );
				}
			}
			
		}
				
		
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	



}
