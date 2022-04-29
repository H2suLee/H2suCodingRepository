package com.java.ch_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 세 수를 입력받아 차례대로 두 수의 사칙연산을 이용하여 세번째 수를 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 > ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 > ");
		int num2 = sc.nextInt();
		System.out.println("세번째 수 > " );
		int num3 = sc.nextInt();
	
		
		if(num1 + num2 == num3) {
			System.out.println(num1 + "+" + num2 + "=" + num3);
			System.out.printf("%d + %d = %d", num1, num2, num3); // printf 메소드 사용
		}
		if(num1 - num2 == num3) {
			System.out.println(num1 + "-" + num2 + "=" + num3);
		}
		if(num1 * num2 == num3) {
			System.out.println(num1 + "*" + num2 + "=" + num3);
		}
		if(num1 / num2 == num3) {
			System.out.println(num1 + "/" + num2 + "=" + num3);
		}
		
		
//		System.out.println("결과: " + num1 + "," + num2 + "," + num3);
		
	}

}
