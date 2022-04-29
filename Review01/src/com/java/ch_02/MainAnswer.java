package com.java.ch_02;

import java.util.Scanner;

public class MainAnswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int num1 = 0;
		int num2 = 0;

		boolean isExecuted = true;

		while (run) {
			System.out.println(
					"=========================================================================================================");
			System.out
					.println("input. 숫자입력(두개숫자) | +. 더하기(결과값 출력, 이하동일) | -. 빼기  | *. 곱하기 | /.나누기 | ?. 대소관계 | exit. 종료");
			System.out.println("메뉴 선택 > ");
			String select = sc.nextLine();

			if (select.equals("input")) {
				System.out.println("첫번째 숫자를 입력하세요.");
				num1 = Integer.parseInt(sc.nextLine());

				System.out.println("두번째 숫자를 입력하세요.");
				num2 = Integer.parseInt(sc.nextLine());
				isExecuted = true;
			} else if (select.equals("exit")) { // 메뉴뜨자마자 input을 입력 안해도 프로그램 종료할 수 있도록.
				System.out.println("프로그램을 종료합니다.");
				run = false;

			} else if (isExecuted) { // input이 정상적으로 되었을 때만 아래 블록 내용 실행
				switch (select) { // 사칙연산과 대소값을 switch문으로
				case "+":
					System.out.println("결과 값 : " + (num1 + num2));
					break;
				case "-":
					System.out.println("결과 값 : " + (num1 - num2));
					break;
				case "*":
					System.out.println("결과 값 : " + (num1 * num2));
					break;
				case "/":
					System.out.println("결과 값 : " + (num1 / num2));
					break;
				case "?":
					System.out.println("큰 값 : " + num2 + "\n작은 값 : " + num1);
				}
			} else {
				System.out.println("메뉴를 잘못 입력하였거나 input을 실행하지 않았습니다.");
			}

		}

	}
}
