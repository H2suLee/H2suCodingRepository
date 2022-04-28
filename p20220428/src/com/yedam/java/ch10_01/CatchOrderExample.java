package com.yedam.java.ch10_01;

public class CatchOrderExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
//
//		data1 = args[0];
//		data2 = args[1];ㅌ 
//		//ArrayIndexOutOfBoundsException
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		int result = value1 + value2;
//		//NumberFormatException
//
//		System.out.println(value1 + "+" + value2 + "=" + result);

		try {

			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.println(value1 + "+" + value2 + "=" + result);

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("다시 실행하세요");
		} finally {
			System.out.println("항상 실행!");
		}

	}
}
