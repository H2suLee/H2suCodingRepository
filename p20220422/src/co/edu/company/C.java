package co.edu.company;

import co.edu.as.A;

public class C {
	public static void main(String[] args) {
		// A와 클래스도 패키지도 다름
		// 아래와 같이 선언하려면 import 필요

		A a = new A();

		int temp;

		temp = a.b; // public인 b 밖에 호출이 안 됨.

	}
// 상속클래스에서 부모클래스 A의 protected된 int c 호출하기
public class Z extends A {
		Z z = new Z();
		int i = z.c;
	}

}
