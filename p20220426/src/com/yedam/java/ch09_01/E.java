package com.yedam.java.ch09_01;

public class E {
	// 필드
	// 인스턴스 필드
	F f = new F();
	G g = new G();
	// 정적 필드
//	static F f1 = new F(); 정적 필드에 인스턴트 클래스 사용 못함
	static G g1 = new G();
	// 생성자
	
	
	
	// 메소드
	// 인스턴스 메소드 // f, g 둘다 사용 가능
	void method1() {
		F f = new F();
		G g = new G();
	}
	
	// 정적 메소드
	static void method2() {
//		F f = new F(); // 컴파일 에러, 정적 메소드 안에 인스턴트 멤버 클래스 사용 못함
		G g = new G();
	}
	
	// 인스턴스 멤버 클래스, 인스턴스 안에서만 사용 가능
	class F{}
	
	
	// 정적 멤버 클래스, 인스턴트 안팎에서, 인스턴스 없이도 다 사용 가능
	static class G{}

}
