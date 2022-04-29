package com.yedam.java.homework;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer); //
		int input = 0;
		int count = 0;
		// do while문을 쓰는 이유는 조건이 성립이 안 되더라도 반드시 한 번은 실행하도록 만드려고
		// while문은 조건이 성립이 안 되면 아예 실행이 안 됨
		do {
			// 시도 횟수를 증가, 이걸 먼저 하든 입력 값을 먼저 받든 순서는 상관 없다
			count++;

			// 사용자가 숫자를 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("1과 100 사이의 값을 입력하세요 : ");
			input = Integer.parseInt(sc.nextLine());

//			catch (NumberFormatException e) {
//				System.out.println("유효값 입력");
//				continue;
//			}
			// 18 ~ 25라인이 아래로 표현될 수 있음 스캐너 선언과 동시에 input에 값 넣기
//			try {
//				input = new Scanner(System.in).nextInt();
//			} catch(NumberFormatException e) {
//				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해 주세요");
//			}

			// 세 가지 경우의 수 설정

			if (answer > input) {
				System.out.println("더 큰 값을 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 값을 입력하세요.");
			} else if (answer == input) {
				System.out.println("맞혔습니다.");
				break;
			}
//				continue;
		} while (true);
		System.out.println("시도 횟수 : " + count); // 마지막 else if문 블록에 시도 회수 출력 메소드 넣어도 됨

	}
}
