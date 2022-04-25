package com.yedam.java.ch02_02;

import com.yedam.java.ch02_02.Vehicle;

public class Driver {
	
	public void drive(Vehicle vehicle) { // 매개변수를 입력받아 그에 해당하는 메소드를 호출하는 메소드
		vehicle.run();
	}

}
