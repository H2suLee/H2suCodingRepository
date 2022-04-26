package com.yedam.java.ch08_03;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		InterfaceA ia = imp1; // interA만 접근 가능
		ia.methodA();
		InterfaceB ib = imp1; // interB만 접근 가능
		ib.methodB();
		InterfaceC ic = imp1; // 직접 구현하는 것은 interC밖에 없지만 interA, interB, 그리고 본인의 메소드 모두 실행 가능함
//		ic. << 도트 연산자로 확인 가능
	}
}
