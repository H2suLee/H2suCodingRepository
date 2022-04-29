package com.java.ch_04;

import java.util.Scanner;

public class Main {
	// 문제 4. 입력한 수만큼 주사위 1~6을 굴려서 나온 수들 중
	// 1. 최고 수 2. 최저 수 3. 수들의 합을 구하는 프로그램
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

		// 주사위 숫자 도출
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
			} else {
				min = dice[0];
			}
		}
		System.out.println("max " + max);
		System.out.println("min " + min);
		System.out.println("sum " + sum);

		System.out.println("======================");
	}

//					
//			for(int j = 0; j <=)
//			dice[i] = (int) (Math.random()*6)+1; 
//				System.out.println(i+"번째 숫자 = " + dice[i]);
//					
}
