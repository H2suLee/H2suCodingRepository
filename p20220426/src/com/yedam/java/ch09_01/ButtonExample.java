package com.yedam.java.ch09_01;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnclickListener(new CallListener());
		button.touch(); // 컴파일 에러
		
		button.setOnclickListener(new MessageListener());
		button.touch(); // 컴파일 에러 // 가 떴었는데 왜냐면 Button 에서 listener를 null값인 필드로 가리키고 있었음 매개변수가 아니라
		
	}

}
