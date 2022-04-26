package com.yedam.java.ch08_03;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi()); // Bus에서 checkfare 메소드를 추가하면 이 라인이 컴파일 에러, 그래서 메소드 안에 로컬변수 bus를 넣을 때 instanceof를 써야함 (p397_
	}

}
