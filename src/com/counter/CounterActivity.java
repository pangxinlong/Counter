package com.counter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends Activity implements OnClickListener {
	public TextView tv,show;
	public Button button1,button2,button3,button4,button5,
				  button6,button7,button8,button9,button0,
				  buttonadd,buttonminus,buttontimes,buttondivided,buttonresult,buttonclean;
	public String s="";//存放输入数字
	public String clu="";//存放运算符
	double sum1=0,sum2=0;
	boolean firstclu=true;//判断是否是第一次输入运算符
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
		show=(TextView) findViewById(R.id.show);
		
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
		show.setOnClickListener(this);
		
	}
		//按钮事件
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
			else if(v.equals(buttonadd)){//加法
				if(firstclu){
				clu="+";
				show.setText(clu);
				show.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
				firstclu=false;

				}
				else{
					operation();
					Log.e("!!!", "!!!");
					clu="+";
					show.setText(clu);
					show.getText().toString();
				}
			}
			else if(v.equals(buttonminus)){//减法
				if(firstclu){
					clu="-";
					show.setText(clu);
					show.getText().toString();
					sum1=Double.parseDouble(s);
					s="";
					firstclu=false;
				}
				else
				{
					operation();
					clu="-";
					show.setText(clu);
					show.getText().toString();
				}	
				
			}
			else if(v.equals(buttontimes)){//乘法
				if(firstclu){
				clu="*";
				show.setText(clu);
				show.getText().toString();
				sum1=Double.parseDouble(s);
				s="";
				firstclu=false;
				}
				else
				{					
					operation();
					clu="*";
					show.setText(clu);
					show.getText().toString();
				}
			}
			else if(v.equals(buttondivided)){//除法
				if(firstclu){
				clu="/";
				show.setText(clu);
				show.getText().toString();
				sum1+=Double.parseDouble(s);
				s="";
				firstclu=false;
				}
				else
				{
					operation();
					clu="/";
					show.setText(clu);
					show.getText().toString();
				}
			}
			else if(v.equals(buttonresult))
			{//按下等于号事件
				operation();
				s=String.valueOf(sum1);
				firstclu=true;
				clu="";//存放运算符
				sum2=0;
			
			
			}
			else
			{
				s="";//存放输入数字
				clu="";//存放运算符
				sum1=0;
				sum2=0;
				firstclu=true;
				tv.setText("0");
				tv.getText().toString();
			}
		}
		public void operation(){
			sum2=Double.parseDouble(s);//第二次的输入存到sum2
			if(clu=="+"){
				tv.setText((sum1+sum2)+"");
				tv.getText();
				sum1+=sum2;
			}
			else if(clu=="-"){
				tv.setText((sum1-sum2)+"");
				tv.getText();
				sum1-=sum2;
			}
			else if(clu=="*"){
				tv.setText((sum1*sum2)+"");
				tv.getText();
				sum1*=sum2;
			}
			else {
				if(sum2!=0){
				tv.setText((sum1/sum2)+"");
				tv.getText();
				sum1/=sum2;
				}
				else
				{
					tv.setText("error");
					tv.getText();
				}
			}
			s="";
		}
}

		
	


