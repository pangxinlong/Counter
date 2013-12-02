package com.counter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends Activity{
	public TextView tv;
	public Button button1,button2,button3,button4,button5,
				  button6,button7,button8,button9,button0,
				  buttonadd,buttonminus,buttontimes,buttondivided;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);
		button1=(Button) findViewById(R.id.button1);
		button2=(Button) findViewById(R.id.button2);
		button3=(Button) findViewById(R.id.button3);
		button4=(Button) findViewById(R.id.button4);
		button5=(Button) findViewById(R.id.button5);
		button6=(Button) findViewById(R.id.button6);
		button7=(Button) findViewById(R.id.button7);
		button8=(Button) findViewById(R.id.button8);
		button9=(Button) findViewById(R.id.button9);
		button0=(Button) findViewById(R.id.button0);
		buttonadd=(Button) findViewById(R.id.add);
		buttonminus=(Button) findViewById(R.id.minus);
		buttontimes=(Button) findViewById(R.id.times);
		buttondivided=(Button) findViewById(R.id.divided);
	}
		
}
