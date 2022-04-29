package com.java.ch_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제2) 두 수를 입력받아 두 수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		// 메뉴는 아래와 같이 구성합니다.
		// input. 숫자입력(두개숫자) | +. 더하기(결과값 출력, 이하동일) | -. 빼기 | *. 곱하기 | /.나누기 | ?. 대소관계 |
		// exit. 종료

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		int num1 = 0;
		int num2 = 0; // 변수의 위치를 while문 바깥으로 빼니까 됨
		
		// input이 실행되었는 지 여부를 변수를 선언해서 확인
		// ★

		while (run) {
			System.out.println("=========================================================================================================");
			System.out.println("input. 숫자입력(두개숫자) | +. 더하기(결과값 출력, 이하동일) | -. 빼기  | *. 곱하기 | /.나누기 | ?. 대소관계 | exit. 종료");
			System.out.println("메뉴 선택 > ");
			String select = sc.nextLine();

			switch (select) {
			case "input":
				
				System.out.println("첫번째 숫자를 입력하세요.");
				num1 = Integer.parseInt(sc.nextLine());

				System.out.println("두번째 숫자를 입력하세요.");
				num2 = Integer.parseInt(sc.nextLine());
//				if(num1 == 0 && num2 == 0) {
//					System.out.println("숫자 넣으세요");
//				}
				break;
			case "+":
				if(num1 == 0 && num2 == 0) {
					System.out.println("숫자 넣으세요");
				} else {System.out.println("결과 값 : " + (num1 + num2));}
				  
				break;
			case "-":
				if(num1 == 0 && num2 == 0) {
					System.out.println("숫자 넣으세요");
				}
				System.out.println("결과 값 : " + (num1 - num2));
				break;
			case "*":
				if(num1 == 0 && num2 == 0) {
					System.out.println("숫자 넣으세요");
				}
				System.out.println("결과 값 : " + (num1 * num2));
				break;
			case "/":
				if(num1 == 0 && num2 == 0) {
					System.out.println("숫자 넣으세요");
				}
				System.out.println("결과 값 : " + (num1 / num2));
				break;

			case "?":
				if(num1 == 0 && num2 == 0) {
					System.out.println("숫자 넣으세요");
				}
				if (num1 > num2) {
					System.out.println("큰 값 : " + num1 + "\n작은 값 : " + num2);
				} else {

					System.out.println("큰 값 : " + num2 + "\n작은 값 : " + num1);
				}
			case "exit":
				
				System.out.println("프로그램을 종료합니다.");
				run = false;

			default:
				System.out.println("다시");
			}
			}

		}
	}


