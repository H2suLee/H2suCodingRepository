package com.yedam.java.ch10_01;

public class CatchbyExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.println(value1 + "+" + value2 + "=" + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("항상 실행!");
		}
		
//		"실행 매개 값의 수가 부족합니다." // (O)
//		"숫자로 변환할 수 없습니다." // (X) 두번째 catch가 판단할 try가 없음. 첫번째 catch가 이미 판단해 버렸음
//		"항상 실행!" // (O)
		
		// debug configuration > arguments?
		// run configuration > arguments > 10 6
		// 을 통해 매개 변수 값 두 개를 넣으면
		// 10+6=16
		// 항상 실행!
	}

}
