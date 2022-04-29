package com.yedam.java.ch11_01;

public class Main {
	
	public static void main(String[] args) {
//		String str1 = new String("홍길동"); 
//		String str2 = new String("홍길동"); 
//		// str1과 str2는 다른 주소를 가짐. new 연산자는 무조건 새로운 객체를 생성하는 연산자
//		// 해시코드가 다르게 형성되어있다고 할 수 있음
//		// 해시코드 = 생성되는 모든 객체가 가지고 있는 유일한 값
		
		
		for(int i = 0; i<10 ; i++) {
			System.out.println(i);
			if(i==5) {
//				return; // 메소드 강종
//				break; // for문을 벗어난다. 마무리 코드까지 출력
				System.exit(0); // 메소드 강종, return이랑 똑같, exit안의 숫자 0은 큰 의미 없음
				}
		}
		System.out.println("마무리 코드");
	}

}
