package com.yedam.java.ch08_02;

public class MyClassExample {
	
	public static void main(String[] args) {
		System.out.println("1)----------------------------------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------------------------------");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)----------------------------------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------------------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
		
		// 실행 결과 예상해 보기
		
		
		// 매개변수가 없으므로 첫번째 생성자 실행
		// 1)------------------------------------
		// TV를 켭니다
		// 현재 TV 볼륨: 5
		
		
		// 매개변수를 받으므로 생성자 중 두 번째 생성자를 실행
		// 2)------------------------------------
		// Audio를 켭니다.
		// 현재 Audio 볼륨: 5
		
		
		// methodA를 불러왔으므로 methodA 실행,
		// 메소드 내에 로컬변수
		// 3)------------------------------------
		// Audio를 켭니다.
		// 현재 Audio 볼륨: 5
		
		
		// methodA를 불러왔으므로 methodB 실행, 
		// 매개 변수를 받아 실행하는 매소드
		// 4)------------------------------------
		
		// TV를 켭니다
		// 현재 TV 볼륨: 5
		
		// MyClass 내에 
		// 필드 선언할 때 구현 클래스를 선언하든가, 생성자에서 초기값을 받든가
		// 어떡하냐에 따라 결과
		
	}

}
