package co.edu.member;

public class StaticMember {
	int a ;
	 
	// 정적 멤버, 객체를 생성하지 않고 클래스를 통해 사용할 수 있다.
	// 정적 필드
	static double PI = 3.14159;
	
	// 정적 메소드
	static int plus(int x, int y) {
		StaticMember sm = new StaticMember(); // 이렇게 선언안하고 메소드에 위에 선언한 int a를 사용하게 되면 밑에서 컴파일 에러남
		
//		return x + y; // return x+y+a; << 컴파일 에러
		return x + y + sm.a; // 한 메소드에 return 값을 두번 쓰면 에러나는 듯 
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
