package co.edu.as;

public class A {
	// default 접근 제한자
	// 같은 패키지 내에 있는 클래스에서만 호출 가능
	int a;
	
	// public 접근 제한자
	// 모든 패키지 및 클래스에서 호출 가능
	public int b;
	
	// protected 접근 제한자
	// 같은 패키지 내에 있는 클래스 및 자식 클래스에서 호출 가능
	protected int c;
	
	// private 접근 제한자
	// 속해 있는 클래스에서만 사용 가능
	private int d;
	
}
