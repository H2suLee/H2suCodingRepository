package com.yedam.java.ch10_01;

public class TryCatchFinallyRunTimeExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
//		data1 = args[0];
//		data2 = args[1];
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		int result = value1 + value2;
//
//		System.out.println(value1 + "+" + value2 + "=" + result);
		
		// 다중 캐치 말고 
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
		}
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			// 여기서 nullpointer예외가 아니라 numberformat예외가 뜨는데
			// 오류는 값이 아니라 메소드를 판단함 data1을 판단한 게 아니라 integer 메소드를 판단한 것임

			System.out.println(value1 + "+" + value2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("항상 실행!"); // 매개변수 값을 넣든 안넣든 finally 블록에 있는 이 문구는 항상 출력
		}
		
		// 콘솔에 출력 결과 예상
		// "실행 매개 값의 수가 부족합니다." (O)
		// NullPointerException 오류 구문 (X) "실행 매개 값의 수가 부족합니다." (O)
		// "항상 실행!" (O)
		
		// debug configuration > arguments?
		// run configuration > arguments > 10 6
		// 매개 변수 값을 넣으면
		// 10+6=16
		// 항상 실행!
	}

}
