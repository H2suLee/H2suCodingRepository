package com.yedam.java.ch09_01;

public class W {
	
	// 바깥 클래스의 필드와 메소드 선언
	// 필드
	int field1;
	static int field2;
	
	// 메소드
	void method1() {}
	static void method2() {}
	
	// 인스턴스 멤버 클래스 
	class Y{ 
		void method() {
			field1 = 10;
			field2 = 20;
			
			method1();
			method2();
			
		}
	}
	
	// 정적 멤버 클래스 (정적 멤버 필드와 정적 멤버 메소드만 사용됨)
	static class Z{
		void method() {
//			field1 = 10; // 컴파일 에러, 바깥 클래스의 인스턴스 멤버 클래스 사용 불가능
			field2 = 20;
			
//			method1(); // 컴파일 에러, 바깥 클래스의 인스턴스 멤버 클래스 사용 불가능
			method2();
			
		}
	}

}
