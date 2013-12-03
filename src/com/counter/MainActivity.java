package com.counter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button buttonin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonin=(Button) findViewById(R.id.buttonin);
		buttonin.setOnClickListener(l);
		Log.e("dd","1！！！！");

	}
	
		public OnClickListener l=new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				if(arg0.equals(buttonin)){
					Intent intent=new Intent(MainActivity.this,CounterActivity.class);
					MainActivity.this.startActivity(intent);
					Log.e("dd","2!!!!!!!!!");

				}
			}
		};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

/*	public void in(View v){
		Intent intent=new Intent(this,CounterActivity.class);
		this.startActivity(intent);
		System.out.println("执行了");
		Log.e("dd","!!!!!!!!!!");
	}*/

	

}
