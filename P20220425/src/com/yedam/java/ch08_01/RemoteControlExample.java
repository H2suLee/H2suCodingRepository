package com.yedam.java.ch08_01;

// 실행용 클래스, 인터페이스 변수에 구현 객체 대입

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl1 rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}

}
