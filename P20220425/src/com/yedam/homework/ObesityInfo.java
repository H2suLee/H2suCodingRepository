package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo {
	

	// 생성자
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	// 메소드
	public double getObesity() {
		return weight / getSWeight() * 100;
	}
	
	@Override
	public void getInformation() {
		if(getObesity() >= 120) {
			System.out.println(name + "님의 신장 " +height+", 몸무게 " + weight + ", 비만입니다."); 
		} else {
		}
	}

//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

//	박둘이님의 신장 168, 몸무게 90, 비만입니다.

//	실제체중이 표준체중보다 얼마나 초과되어 있는지 비만도를 구합니다.
//	비만도가 120%를 넘으면 비만으로 판정합니다.
//	표준체중(kg) = (현재신장cm - 100) X 0.9
//	비만도(%) = (현재체중 ÷표준체중) X 100
}
