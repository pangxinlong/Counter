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
		if (v.getId() == R.id.result) {//判断等号
			voluation(myarraylist);
		} else {
			if (v.getId() == R.id.clean) {//判断清除键
				clean();
			} else {
				String buttonString = (String) ((Button) v).getText();// 存放监听到的按键字符串
				judgeInput(buttonString);
			}
		}
		show();
	}

	public void show() {// 用来在界面显示输入的内容
		String resultStr = " ";
		for (int i = 0; i < myarraylist.size(); i++) {
			resultStr += (String) myarraylist.get(i);
		}
		((TextView) findViewById(idList[17])).setText(resultStr);
		resultStr = " ";
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

	public void judgeInput(String StringOperator) {// 通过judgeCharOrNumber，judgeCharList判断后确定输入形式
		if (judgeCharOrNumber(StringOperator.charAt(0))) {
			switch (judgeCharList(myarraylist)) {
			case TYPE_EMPTY:
				;
				break;
			case TYPE_OPERATOR:
				myarraylist.set(myarraylist.size() - 1, StringOperator);
				break;
			case TYPE_NUMBER:
				myarraylist.add(StringOperator);
				break;
			}
		} else {
			myarraylist.add((String) (StringOperator));

		}
	}

	public void clean() {// 清空list（刷新）
		myarraylist.clear();
	}

	public void voluation(ArrayList<String> stringList) {// 将list中的字符，存为一组数字或符号
		String strNum1 = "";// 存放第一组数据string
		String strNum2 = "";// 存放第二组数据string
		char operate = ' ';// 存放符号
		boolean times = true;// 存放第几次输入的符号
		while (stringList.size() > 0) {
			if (judgeCharOrNumber((stringList.get(0)).charAt(0))) {//判断是否是字符
				if (times) {//判断是第几次输入的字符
					if (stringList.get(0).equals(".")){//判断是否是“.”
						strNum1 += stringList.get(0);
					}
					else{
					operate = stringList.get(0).charAt(0);
					times = false;
					}
				} else {
					if (stringList.get(0).equals(".")){
						strNum2 += stringList.get(0);
					}else{
					operate = stringList.get(0).charAt(0);
					strNum1 = (countNum(strNum1, strNum2, operate));
					strNum2 = "";
					}
				}
				myarraylist.remove(0);
			} else {
				if (times) {
					strNum1 += stringList.get(0);
				} else {
					strNum2 += stringList.get(0);
				}
				myarraylist.remove(0);
			}
		}
		myarraylist.add(0, (countNum(strNum1, strNum2, operate)));
	}

	public String countNum(String num1, String num2, char opreate) {
		double doubleNum1 = 0;// 将第一组数据转为double型
		double doubleNum2 = 0;// 将第二组数据转为double型
		doubleNum1 = Double.valueOf(num1);
		doubleNum2 = Double.valueOf(num2);
		switch (opreate) {
		case '+':
			doubleNum1 += doubleNum2;
			break;
		case '-':
			doubleNum1 -= doubleNum2;
			break;
		case '*':
			doubleNum1 *= doubleNum2;
			break;
		case '/':
			doubleNum1 /= doubleNum2;
			break;
		}
		return String.valueOf(doubleNum1);
	}

}
