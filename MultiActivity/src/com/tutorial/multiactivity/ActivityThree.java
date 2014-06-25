package com.tutorial.multiactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
		
		TextView txtLabel =(TextView)findViewById(R.id.textViewActThree);
		
		txtLabel.setText("GREETINGS!");
		
		
		Button btnThree = (Button)findViewById(R.id.buttonActThree);
		
		btnThree.setOnClickListener(new OnClickListener() {
			
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
