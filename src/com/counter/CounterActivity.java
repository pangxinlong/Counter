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
	public String s="";//�����������
	public String clu="";//��������
	double sum1=0,sum2=0;
	boolean firstclu=true;//�ж��Ƿ��ǵ�һ�����������
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.counteractivity);
		//�󶨸�����ť
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
		
		//����������ť
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
		//��ť�¼�
		@Override
		public void onClick(View v) {
			// TODO �Զ����ɵķ������
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
			else if(v.equals(buttonadd)){//�ӷ�
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
			else if(v.equals(buttonminus)){//����
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
			else if(v.equals(buttontimes)){//�˷�
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
			else if(v.equals(buttondivided)){//����
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
			{//���µ��ں��¼�
				operation();
				s=String.valueOf(sum1);
				firstclu=true;
				clu="";//��������
				sum2=0;
			
			
			}
			else
			{
				s="";//�����������
				clu="";//��������
				sum1=0;
				sum2=0;
				firstclu=true;
				tv.setText("0");
				tv.getText().toString();
			}
		}
		public void operation(){
			sum2=Double.parseDouble(s);//�ڶ��ε�����浽sum2
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

		
	


