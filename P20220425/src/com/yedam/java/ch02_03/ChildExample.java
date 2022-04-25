package com.yedam.java.ch02_03;

//강제 타입변환과 intanceof

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2"; // 컴파일 에러; parent 에서 갖고 있지 않은 필드임
//		parent.method3(); // 컴파일 에러;
		
		Child child = (Child) parent; // 강제 타입 변환을 하면 됨
		child.field2 = "data2";
		child.method3();
		
		
	}

}
