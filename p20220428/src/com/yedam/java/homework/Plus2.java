package com.yedam.java.homework;

//1
//3
//5
//1
//2
//5
//6

// true 1 3 5 false 1 2 5 6

// 풀이

public class Plus2 {

	public static void main(String[] args) {
		method(true);
		method(false);
	}

	public static void method(boolean value) {
		try {
			System.out.println(1);

			if (value) {
				throw new RuntimeException();
			}

			System.out.println(2);
		} catch (RuntimeException e) {
			System.out.println(3);
			return; // 리턴 타입이 void인 메소드의 강종 방식. 리턴 없으면 6까지 출력됨 
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5); // finally true, false 두 가지 경우의 수에 모두 나오므로 finally // 위에서 리턴해도 실행됨
		}
		System.out.println(6);
	}

}
