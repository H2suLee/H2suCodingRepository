package co.edu.condition;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = sc.nextInt();
//		
//		if(num ==1) {
//			System.out.println("숫자 1");
//		} else if (num ==2) {
//			System.out.println("숫자 2");
//		} else if (num ==3) {
//			System.out.println("숫자 3");
//		} else if (num ==4) {
//			System.out.println("숫자 4");
//		} else if (num ==5) {
//			System.out.println("숫자 5");
//		} else {
//			System.out.println("5 제외");
//		} 

		// Math.random 메소드 사용을 통한 중첩if문 연습
		// Math.random()(디폴트)은 0 <= x < 1 에서 랜덤값 추출, 따라서 double
		// Math.random() * 10을 하면 0 <= x < 10,
		// 0이라는 데이터 필요 없으니 Math.random() * 10 +1 -> 1 <= x < 11
		// 그리고 (int) 를 넣어 강제 타입 변환
	/*	while (true) { // break걸릴 때까지 32~44라인 반복)
			int num = (int) (Math.random() * 6) + 1; // means 1~6까지의 데이터를 랜덤으로 추출
			System.out.println("주사위의 수는 : " + num);

			if (num == 1) {
				System.out.println("숫자 1");
			} else if (num == 2) {
				System.out.println("숫자 2");
			} else if (num == 3) {
				System.out.println("숫자 3");
			} else if (num == 4) {
				System.out.println("숫자 4");
			} else if (num == 5) {
				System.out.println("숫자 5");
			} else {
				System.out.println("숫자 6, 탈출");
				break;
			} */
			
			// 학점 측정 프로그램
			Scanner sc = new Scanner(System.in);
			int grade;
			System.out.println("성적을 입력하세요.");
			grade = Integer.parseInt(sc.nextLine()); // 문자열 "85"를 정수 85로 바꿔줌
			
			if (grade >= 90) {
				System.out.println("A학점");
			} else if(grade >= 80) {
				System.out.println("B학점");
			} else if(grade >= 70) {
				System.out.println("C학점");
			} else if(grade >= 60) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점, 공부하세요!");
			}
			
		}
	}
 // 정렬 어지러우면 ctrl + shift + f
