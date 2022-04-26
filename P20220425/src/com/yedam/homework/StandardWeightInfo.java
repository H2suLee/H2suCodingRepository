package com.yedam.homework;

public class StandardWeightInfo extends Human {
	public double SWeight;

	// 생성자

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	// 메소드
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )

	public double getSWeight() { // 접근 제한자가 private이라도 상관 없음
		return (height - 100) * 0.9;
	}

	@Override
	public void getInformation() {
		super.getInformation(); // 이렇게 부모클래스의 메소드 호출하고,
//		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 표준체중" + getSWeight() + "입니다."); //
		System.out.printf(", 표준체중 %.1f 입니다\n", getSWeight()); // 여기는 printf로 하고 소수점 자리 지정하기
	}
}
//홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//박둘이님의 신장 168, 몸무게 90, 비만입니다.