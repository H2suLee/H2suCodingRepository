package co.edu.loop;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		// 1. 최소, 최대값 구하기 scanner, 값 3개 받아서 최대값, 최소값 구해보기
		// 2. 두 주사위를 던졌을 때 주사위 합이 6인 데이터 출력, random으로 데이터 2개 꼽아서 합이 6인 것들 출력
		// 3. 피보나치 수열, 첫번째 두번째 합은 세번째 항, 세번째 네번째 합은 다섯번째 항, while(value < 50)

		// 1. 반복문 없어도 됨, 없어야 됨, 문제 잘못 내심
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int first = sc.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int second = sc.nextInt();
		System.out.println("세번째 값을 입력하세요");
		int third = sc.nextInt();
		int max;
		int min;
		
		max = first;
		if(max < second) {
			max = second;
		}
		if(max<third) {
			max=third;
		}
		
//		// 2.
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("첫번째 주사위 값 : " + num);
			System.out.println("두번째 주사위 값 : " + num2);
			System.out.println("★주사위 값 합 : " + (num+num2));
			if (num+ num2 == 6) {
				break;
			}
		}
		
		// 2. 다른 풀이
		for(int i = 1; i<=6; i++) {
			int randomValue = (int)(Math.random()*6)+1;
			int randomValue2 = (int)(Math.random()*6)+1;
			if(randomValue + randomValue2 ==6) {
				System.out.println(randomValue + "," + randomValue2 + "=" + (randomValue+randomValue2));
			}
		}
		
		
		// 3. 1, 2, 3, 5, 8, 13, 21, 33, 54 
		int number1 = 1;
		int number2= 2;
		int number3 = 0;
		while(number3 <= 50) {
			number3 = number1+number2;
			System.out.println(number1 + " , " + number2 + " , " + number3);
			number1 = number2;
			number2 = number3;
		}
	}
}
