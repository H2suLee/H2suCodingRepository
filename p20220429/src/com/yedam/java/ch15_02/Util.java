package com.yedam.java.ch15_02;

public class Util {
	// 복수형으로도 얼마든지 선언 가능
	public static <T> Box<T> boxing(T t) { // Box앞의 <T> : 메소드 안에서 사용하는 매개 변수를 모두 선언, 뒤에 다 바꿔줘야 함
		Box<T> box = new Box<T>(); // 메소드 안이라서 꺾쇠 안에 String 안 쓰고 T 그대로 씀
		box.setT(t);
		return box;
	}

}
