package co.edu.oop;

public class Car {
	// 필드(속성)
	String company;
//	String company; = "현대" //라고 지정하면 아래 세 개 데이터만 지정하면 됨. 즉 현대 자동차만 만들수 있는 클래스가 됨
	
	String model;
	String color;
	int maxSpeed;
	
	// 생성자(객체 초기화)
	// -1. 데이터 아무것도 안넣고 만들기
	public Car() {
		
	}
	// -2. 데이터 넣고 객체 만들기 (?)
	// this: 
	public Car(String a, String b){
		// this: 클래스 내에 선언된 필드를 콕 집어서 사용하겠다
		this.model = a; // 앞에 파란색 model은 클래스 내부에 존재하는 데이터, 뒤에 갈색 a는 생성자에 넣어진 데이터
		this.color = b; 
	}
	
	public Car(String a){
		this.model = a;
	}
	
	// 메소드(기능)
	void info() {
		System.out.println("회사: " + company);
		System.out.println("차종: " + model);
		System.out.println("색상: " + color);
		System.out.println("최대 속도: " + maxSpeed);
		
	}

}
