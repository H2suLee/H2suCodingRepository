package com.yedam.java.ch15_01;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		
		
		
//		box.setObject("홍길동");
//		String name1 = box.getObject(); // 컴파일 오류
		String name2 = (String) box.getObject(); // 강제 타입 변환해야 오류 x 
		// 7라인(setObj)이 같은 메인안에 있지 않으면 getObj의 값을 String으로 강제 타입 변환 해야할 지 불명확
		// 7라인을 주석처리 했을 때 오류 안 남
		
		System.out.println(name2); // 7라인을 주석처리하면 null을, 안하면 홍길동을 출력함
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
		
	}

}
