package co.edu.oop;

public class Calculator {
	// 필드

	// 생성자
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) { // 메소드가 실행될 때 필요한 데이터(=매개변수)를 받기 위해 매개 변수 선언
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
		// 평균 계산 기능도 넣기
	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = (double) sum/2;
		return result;
	}
	
	// 메소드 호출 p258
	void execute() { // 내부 호출
		powerOn();		
	}
}
