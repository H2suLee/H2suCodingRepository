package co.micol.prj0506.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyLotto {

	public static void main(String[] args) {
		// 게임 수 입력받기
		// 1장에 maximum 다섯 개
		// 1장당 천원
		// 1장 사면 1000원입니다, 5장 사면 5000원입니다.
		// 숫자 오름차순으로
		
		// 메소드 호출 형태로 다시 해 보기

		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		List<int[]> game = new ArrayList<>();
		System.out.println("몇 번 돌릴까요");
		int num = Integer.parseInt(sc.next());
		System.out.println("===============================");
		System.out.println("금액은 " + (num * 1000) + "원입니다.");
		System.out.println("===============================");
		boolean run = true;
		do {
			if (num == 0) {
				run = false;
				break;
			} else {
				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
							break;
						}
					}
				}
				Arrays.sort(lotto);
				for (int i : lotto) {
					System.out.print(i + " ");
				}
				System.out.println();
				game.add(lotto);

				num -= 1;

			}
		} while (true);
		System.out.println("===============================");
	}
}