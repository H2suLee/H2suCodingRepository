package chapter4;

import java.util.Scanner;

public class Exam_7_MinMax {
	public static void main(String[] args) {
		// scanner를 통해 값 3개 받아서 최대값, 최소값 구해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		int num3 = sc.nextInt();
		
		int max = num1; // int max의 초기값을 num1로 설정하는 것이 중요!
		if (max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println("세 정수 중 최대값은 " + max + "입니다.");
		
		int min = num1;
		if (min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		System.out.println("세 정수 중 최소값은 " + min + "입니다.");
		
	}
}
