package _220427_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 스캐너를 통해 값 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 > ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 수 입력 > ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("세번째 수 입력 > ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		// if문을 이용, 사칙 연산 별로 네 가지 조건 설정하여 출력
		if(num1+num2 == num3) {
			System.out.println(num1 + "+" + num2 + "=" + num3);
		} else if(num1-num2 == num3) {
			System.out.println(num1 + "-" + num2 + "=" + num3);
		} else if(num1*num2 == num3) {
			System.out.println(num1 + "*" + num2 + "=" + num3);
		} else if(num1/num2 == num3) {
			System.out.println(num1 + "/" + num2 + "=" + num3);
		} else {
			System.out.println("사칙연산으로 연산할 수 없습니다."); // 오류 처리
		}

	}

}
