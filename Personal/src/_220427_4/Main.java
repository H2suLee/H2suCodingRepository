package _220427_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 횟수 지정
		System.out.println("몇 번 굴릴까요?");
		int num = Integer.parseInt(sc.nextLine());
		int[] dice = new int[num];
//		System.out.println(dice.length);
		int sum = 0;
		int max = 0;
		int min = dice[0];

		// 입력받은 횟수만큼 주사위 숫자 도출 
		for (int i = 0; i < dice.length; i++) {
			dice[i] = (int) (Math.random() * 6) + 1;
			System.out.println(dice[i]);
			sum += dice[i];
//			System.out.println("dice[0]" + dice[0]);
		}

		// 최대최소값도출

		for (int i = 0; i < dice.length; i++) {
			if (max < dice[i]) {
				max = dice[i];
			}
		}
		for (int i = 0; i < dice.length; i++) {
			if (min > dice[i]) {
				min = dice[i];
			} else { // else문을 안 해 주니까 최소값이 0으로 계속 나옴
				min = dice[0];
			}
		}
		System.out.println("max " + max);
		System.out.println("min " + min);
		System.out.println("sum " + sum);

		System.out.println("======================");
	}

}
