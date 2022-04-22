package chapter4;

import java.util.Scanner;

public class Exam_4_Escape {
	public static void main(String[] args) {
		// 1. 두 개의 주사위를 굴려 두 주사위에서 나온 랜덤값의 합이 6이면 루프 탈출
		Scanner sc = new Scanner(System.in);

		while (true) {
			int diceA = (int) (Math.random() * 6) + 1;
			System.out.println("첫번째 주사위 : " + diceA);

			int diceB = (int) (Math.random() * 6) + 1;
			System.out.println("두번째 주사위 : " + diceB);

			System.out.println("▶ 두 주사위의 합: " + (diceA + diceB));
			if (diceA + diceB == 6) {
				System.out.println("탈출!");
				break;
			}

		}

		// 2. 정수를 반복적으로 입력하다가 -1을 입력하면 이 때까지 입력한 정수의 합을 출력하고 탈출
		boolean flag = true;
		int sum = 0;
		while (flag) {
			System.out.println("정수를 입력하세요.");
			int num = Integer.parseInt(sc.nextLine());
			if (num == -1) {
				System.out.println("정수의 합: " + sum);
				flag = false;
			}
			sum += num;
		}
	}
}
