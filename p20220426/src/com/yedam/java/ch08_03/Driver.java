package com.yedam.java.ch08_03;


public class Driver {
	
	// vehicle과 관련이 있는 애들을 매개 변수로 받을 수 있다
	// 
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // 강제 타입 변환
			bus.checkFare();	
		}
		vehicle.run(); // 로컬 변수로 bus 객체를 선언해도, vehicle은 vehicle 대로 생성이 가능하다
		
	}
}
