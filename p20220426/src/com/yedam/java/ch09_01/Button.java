package com.yedam.java.ch09_01;

// 중첩 인터페이스.
// 클래스 안에 인터페이스 선언하는 거
public class Button {
	
	//인터페이스 타입 필드
	OnclickListener listener;
	
	// 매개 변수의 다형성
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}

	// 구현 객체의 onClick 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	
	// 중첩 인터페이스 선언
	static interface OnclickListener{
		void onClick(); // 추상메소드
	}

}
