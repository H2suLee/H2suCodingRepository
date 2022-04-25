package com.yedam.java.ch02_01;

import com.yedam.java.ch02_02.Vehicle;

public class CarExample {

	public static void main(String[] args) {
		// 가장 먼저 실행하는 것은 run -> 그 다음 roll -> roll이 트루면 return값 true -> run에서는 true값이 1 -> swith문에서 case 0이 됨, case 0은 없어서 for 반복문 그 다음 턴
		// roll이 false면 펑크 위치에 따라 return 값 1~4 중 하나 반환, case에 맞게 내용 출력 -> 펑크 타이어 교체 메시지 출력 & 펑크난 타이어에 새로운 데이터 저장 -> for 반복문 그 다음 턴
		
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // run이 먼저 실행이 되고 run의 결과에 따라 switch문 실행
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTrie로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;

			case 2:
				System.out.println("앞오른쪽 KumhoTrie로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTrie로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTrie로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}

			System.out.println("===================================");
		}
		

	}

}
