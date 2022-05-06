package co.micol.prj0506.bullscows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyBullsandCows {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
//		List<String> game = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		int[] random = new int[3];
		int[] input = new int[3];
//		String[] result = new String[3];

		for (int i = 0; i < 3; i++) {
			random[i] = (int) (Math.random() * 9) + 1; // 0 <= x < 11
			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}
		}

		System.out.print(random[0] + " " + random[1] + " " + random[2] + "\n");

		int strike = 0;
		int ball = 0;
		boolean run = true;
		while (run) {
			System.out.println("입력 >>");
			int inputNum = sc.nextInt();
			input[0] = inputNum;
			inputNum = sc.nextInt();
			input[1] = inputNum;
			inputNum = sc.nextInt();
			input[2] = inputNum;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (input[i] == random[i] && i == j) {
						strike++;
					} else if (input[i] == random[i] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(ball + "ball " + strike + "strike");
			strike = 0;
			ball = 0;
		}

//			if (strike == 3) {
//				System.out.println("맞히셨습니다.");
//				run = false;
//			} else if (strike == 0 && ball == 0) {
//				System.out.println("다시 입력해 주세요.");
//			} else {
//				System.out.println(ball + "b " + strike + "s");
//			}

	}

}
