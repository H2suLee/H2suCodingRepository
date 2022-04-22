package co.edu.as;

public class B {
	public static void main(String[] args) {

		A a = new A();
		
		int temp;
		
		// 1) default
		temp = a.a;
		
		// 2) public
		temp = a.b;
		
		// 3) protected 
		temp = a.c;
		
		// 4) private
//		temp = a.d; // 컴파일 에러, A클래스에 정의된 int d는 private으로 접근 제한됨. int d는 A 내부에서만 사용 가능
		
	}
}
