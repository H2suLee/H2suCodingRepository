package co.edu.oop;

public class Car {

	// 필드
	String color;
	String model;
	int tire;
	int price;
		
	// 생성자
	public Car() {
		
	}
	
	// 매개변수를 받는 생성자 추가(한 개 이상 만들 수 있음)
	public Car(String a, String b, int c) {
		color = a;
		model = b;
		price = c;
		
	}
	// 메소드
	void info() {
		System.out.println("model = " + model);
		System.out.println("color = " + color);
		System.out.println("price = " + price);
		
	}
	
}
