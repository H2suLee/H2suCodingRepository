package com.yedam.java.ch03_01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(); // 컴파일 에러; Phone이 추상클래스이기 때문에 일반 클래스처럼 객체 선언이 안됨. 인스턴스로 사용할 수 없음
//		Phone phone = new SmartPhone("홍길동"); // 타입으로 쓰는 거는 가능함
		
		SmartPhone phone = new SmartPhone("홍길동");
		
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();
	}

}
