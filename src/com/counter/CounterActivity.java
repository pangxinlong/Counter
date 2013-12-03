package com.counter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends Activity implements OnClickListener {
	public TextView tv;
	public Button button1,button2,button3,button4,button5,
				  button6,button7,button8,button9,button0,
				  buttonadd,buttonminus,buttontimes,buttondivided,buttonresult;
	public String s="";
	public String cul="";
	double sum1=0,sum2=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.counteractivity);
		
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
		buttonresult=(Button) findViewById(R.id.result);
		tv=(TextView) findViewById(R.id.textview);
		
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		buttonadd.setOnClickListener(this);
		buttonminus.setOnClickListener(this);
		buttontimes.setOnClickListener(this);
		buttondivided.setOnClickListener(this);
		buttonresult.setOnClickListener(this);
		tv.setOnClickListener(this);
		
	}
		
		@Override
		public void onClick(View v) {
			// TODO 自动生成的方法存根
			if(v.equals(button0)){
				s=s+"0";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button1)){
				s=s+"1";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button2)){
				s=s+"2";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button3)){
				s=s+"3";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button4)){
				s=s+"4";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button5)){
				s=s+"5";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button6)){
				s=s+"6";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button7)){
				s=s+"7";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button8)){
				s=s+"8";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(button9)){
				s=s+"9";
				tv.setText(s);
				tv.getText().toString();
			}
			else if(v.equals(buttonadd)){
				cul="+";
				tv.setText(cul);
				tv.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
			}
			else if(v.equals(buttonminus)){
				cul="-";
				tv.setText(cul);
				tv.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
			}
			else if(v.equals(buttontimes)){
				cul="*";
				tv.setText(cul);
				tv.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
			}
			else if(v.equals(buttondivided)){
				cul="/";
				tv.setText(cul);
				tv.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
			}
			else 
			{
				sum2=Double.parseDouble(s);
				if(cul=="+"){
					tv.setText((sum1+sum2)+"");
					tv.getText();
				}
				else if(cul=="-"){
					tv.setText((sum1-sum2)+"");
					tv.getText();
				}
				else if(cul=="*"){
					tv.setText((sum1*sum2)+"");
					tv.getText();
				}
				else {
					tv.setText((sum1/sum2)+"");
					tv.getText();
				}
				//sum1=sum2=0;
				s=cul="";
			}
			
			
		}
		
}

		
	


