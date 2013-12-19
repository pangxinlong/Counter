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
	public TextView showView;
	ArrayList myarraylist = new ArrayList<String>();
	private static final int TYPE_OPERATOR = -1;// 符号
	private static final int TYPE_EMPTY = 0;// 空
	private static final int TYPE_NUMBER = 1;// 数字

	// 初始化idList
	int idList[] = { R.id.button0, R.id.button1, R.id.button2, R.id.button3,
			R.id.button4, R.id.button5, R.id.button6, R.id.button7,
			R.id.button8, R.id.button9, R.id.add, R.id.minus, R.id.times,
			R.id.divided, R.id.point, R.id.result, R.id.clean, R.id.textview };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.counteractivity);

		// 监听各各按钮
		for (int i = 0; i < idList.length; i++) {
			findViewById(idList[i]).setOnClickListener(this);
		}
	}

	// 按钮事件
	@Override
	public void onClick(View v) {
		if ((((Button) v).getText()).equals("=")) {
			// voluation(myarraylist);
			show();
		} else {
			char buttonChar;// 存放监听到的按键字符串
			buttonChar = ((Button) v).getText().charAt(0);
			if (judgeCharOrNumber(((Button) v).getText().charAt(0))) {
				switch (judgeCharList(myarraylist)) {
				case TYPE_EMPTY:
					;
					break;
				case TYPE_OPERATOR:
					myarraylist.set(myarraylist.size() - 1,
							((Button) v).getText());
					break;
				case TYPE_NUMBER:
					myarraylist.add(((Button) v).getText());
					break;
				}
			} else {
				myarraylist.add((String) ((Button) v).getText());
			}
			show();
		}
	}

	public void show() {// 用来显示输入的内容
		String resultStr = " ";
		for (int i = 0; i < myarraylist.size(); i++) {
			Log.e("!!!!!", (String) myarraylist.get(0));
			resultStr += (String) myarraylist.get(i);
		}
		((TextView) findViewById(idList[17])).setText(resultStr);
	}

	public boolean judgeCharOrNumber(char input) {// 用来判断输入的字符是不是符号
		if ((42 <= input) && (input <= 47)) {// 是符号
			return true;
		} else {// 不是符号
			return false;
		}
	}

	public int judgeCharList(ArrayList<String> cacheList) {// 输入是符号，判断list的最后一位输入是什么
		if (cacheList.size() == 0) {// list为空
			return TYPE_EMPTY;
		} else {
			char lastItem = cacheList.get(cacheList.size() - 1).charAt(0);
			if (judgeCharOrNumber(lastItem)) {
				return TYPE_OPERATOR;// list最后一位是符号
			} else
				return TYPE_NUMBER;// list最后一位是数字
		}
	}

	/*
	 * public void voluation(ArrayList<String> cacheList) {
	 * 
	 * }
	 * 
	 * public double count(double num1, double num2, String opreate) { switch
	 * (opreate.charAt(0)) { case '+': num1 += num2; break; case '-': num1 -=
	 * num2; break; case '*': num1 *= num2; break; case '/': num1 /= num2;
	 * break; } return num1; }
	 */
}
