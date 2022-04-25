package com.yedam.java.ch02_03;

public class InstanceofExample {
	// 둘 다 강제타입변환이 일어남
	// 단, 첫번째 유형에서는 instanceof 
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method1 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		parentB.method2();
		
	
	}

}
