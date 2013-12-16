package com.counter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Contacts.Intents.Insert;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends Activity implements OnClickListener {
	public TextView tv;
	public Button button1,button2,button3,button4,button5,
				  button6,button7,button8,button9,button0,
				  buttonadd,buttonminus,buttontimes,buttondivided,buttonresult,buttonclean;
	public static List<String> array= new ArrayList<String>();
	String data1,data2,operator=null;
	ArrayList myarraylist=new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.counteractivity);
		//绑定个个按钮
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
		buttonclean=(Button) findViewById(R.id.clean);
		buttonadd=(Button) findViewById(R.id.add);
		buttonminus=(Button) findViewById(R.id.minus);
		buttontimes=(Button) findViewById(R.id.times);
		buttondivided=(Button) findViewById(R.id.divided);
		buttonresult=(Button) findViewById(R.id.result);
		tv=(TextView) findViewById(R.id.textview);
		
		//监听各各按钮
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
		buttonclean.setOnClickListener(this);
		buttonadd.setOnClickListener(this);
		buttonminus.setOnClickListener(this);
		buttontimes.setOnClickListener(this);
		buttondivided.setOnClickListener(this);
		buttonresult.setOnClickListener(this);
		tv.setOnClickListener(this);
		
	}
		//按钮事件
		@Override
		public void onClick(View v) {
			String data="";
			switch(v.getId()){
				case R.id.button0:{
					myarraylist.add("0");
					show();
				}break;
				
				case R.id.button1:{
					myarraylist.add("1");
					show();
					}
				break;
				
				case R.id.button2:{
					myarraylist.add("2");
					show();
				}break;
				
				case R.id.button3:{
					myarraylist.add("3");
					show();
				}break;
				
				case R.id.button4:{
					myarraylist.add("4");
					show();
				}break;
				
				case R.id.button5:{
					myarraylist.add("5");
					show();
				}break;
				
				case R.id.button6:{
					myarraylist.add("6");
					show();
				}break;
				
				case R.id.button7:{
					myarraylist.add("7");
					show();
				}break;
				
				case R.id.button8:{
					myarraylist.add("8");
					show();
				}break;
				
				case R.id.button9:{
					myarraylist.add("9");
					show();
				}break;
				
				case R.id.add:{
					myarraylist.add("+");
					show();
				}break;
				
				case R.id.minus:{
					myarraylist.add("-");
					show();
				}break;
				
				case R.id.times:{
					myarraylist.add("*");
					show();
				}break;
				
				case R.id.divided:{
					myarraylist.add("/");
					show();
				}break;
				
				case R.id.result:{
					myarraylist.add("=");
					show();
				}break;

			}
		
		}
		
		public void show(){
			String resultStr="";
			for(int i=0;i<myarraylist.size();i++){
				resultStr+=(String) myarraylist.get(i);
				}	
			tv.setText(resultStr);
			tv.getText().toString();
		}
}

		
	


