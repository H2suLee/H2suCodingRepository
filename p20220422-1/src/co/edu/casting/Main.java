package co.edu.casting;

public class Main {
	// D - B - A
	// E - C - A
	// p335
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

		// 아래 두 라인은 컴파일 에러. B와 E, C와 D가 상속 관계에 있지 않음
		// B b3 = e;
		// C c2 = d;

		// Parent, Child 클래스 자동 타입 변환
		Parent p1 = new Child();

		// Parent 메소드 호출
		p1.method1();
		// ↓ 근데 여기선 자식 클래스에서 Override한 대로 출력됨. 자동 타입변환이 되면 자식 클래스에서 Override된 내용을 부모
		// 클래스가 읽을 수 있음
		p1.method2();
		p1.method3();
//		p1.method4(); // 처음에 컴파일 에러 남. Parent타입에 method4가 없기 때문. 

		// 클래스 타입 배열
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent();

		Parent[] parent = { p2, p3, p4 };

	}
}
