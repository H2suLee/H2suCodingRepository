package com.yedam.java.homework;

import java.util.Scanner;

//1과 100사이의 값을 입력하세요 : 50
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : asdf
//유효하지 않은 값입니다. 다시 값을 입력해주세요.
//1과 100사이의 값을 입력하세요 : 25
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 38
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 : 44
//맞췄습니다.
//시도횟수는 5번입니다.

public class Question2 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer); //
		int input = 0;
		int count = 0;
		do {
			count++;
			Scanner sc = new Scanner(System.in);
			System.out.println("1과 100 사이의 값을 입력하세요 : ");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("유효값 입력");
				continue;
			}

			if (answer > input) {
				System.out.println("더 큰 값을 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 값을 입력하세요.");
			} else if (answer == input) {
				System.out.println("맞혔습니다.");
				break;
			}

		} while (true);
		System.out.println("시도 횟수 : " + count);
	}

}
