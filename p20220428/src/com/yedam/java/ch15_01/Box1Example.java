package com.yedam.java.ch15_01;

public class Box1Example {

	public static void main(String[] args) {

		Box1<String> stringBox = new Box1<String>(); // <T> 자리가 <String>으로 대체됨; String만 받을 수 있음
		
		stringBox.set("홍길동");
		String name = stringBox.get();
		
//		stringBox.set(new Apple()); // 컴파일 에러, String타입만 받을 수 있음
//		Apple apple = stringBox.get(); // 컴파일 에러
		
		//Apple을 매개 변수로 받고 싶다면 generic 다시
		
		Box1<Apple> appleBox = new Box1<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
	}

}
