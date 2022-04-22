package chapter4;

import java.util.Scanner;

public class Exam_3_GradePrg {

	public static void main(String[] args) {
		// scanner를 통해 점수를 입력받아, switch문만 사용해서 출력하기
		// 100점부터 90점 : A
		// 89점~80점 : B
		// 79점~70점 : C
		
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = (int) sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		}
		
	}

}
