package com.yedam.java.ch09_01;

public class AExample {
	public static void main(String[] args) {
		A a = new A();// A 클래스 외부에서 B 객체를 생성하려면 먼저 A 객체를 생성해야함
		A tempA = new A();
		
		// 그 다음 아래와 같이 B 객체 생성 가능. // b는 a의 변수로만 생성 가능
		A.B b = a.new B(); 
		A.B tempB = tempA.new B();
		b.field1 = 3; // (인스턴트 필드 초기화)
		
		
		// 정적 멤버 클래스 객체 생성, A 객체 생성 없이 C 객체 생성 가능 (5라인 없어도 됨)
		A.C c = new A.C(); // 이런 방식으로만 가능함
		c.field1 = 3; // 15라인 선언해야지만 가능(?)
		c.method1(); // 15라인 선언해야지만 가능 (?)
		A.C.field2 = 0; 
		A.C.method2();
		
		// 로컬 클래스 객체 생성
		a.method();
		

	}

}
