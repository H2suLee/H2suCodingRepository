package com.yedam.java.ch10_01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
//		Class clazz = Class.forName("java.lang.String2");
		// 문자열로 받은 값이 클래스의 이름임, 그 이름을 가진 클래스의 정보를 불러온다.
		// ClassNotFoundException 예외 발생
		
		// 6라인의 오류 위치에 커서를 올리면 try-catch 자동으로 생성할 수 있도록 해 줌
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace(); // 빨간 색으로 java.lang.ClassNotFoundException: java.lang.String2 띄우는 메소드
//			System.out.println(e.getMessage()); // 15라인에서 출력하는 메시지를 받아오는 메소드, 문자열로 java.lang.String2가 나옴
			System.out.println("존재하지 않는 클래스입니다.");
		} 
			
	}

}
