package chapter4;

import java.util.Scanner;

public class Exam_1_F_C_Conversion {
	public static void main(String[] args) {
		// scanner로 화씨 데이터 입력받아 화씨 -> 섭씨 변환 프로그램
		// c = 5/9(F-32)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨 온도 데이터 입력");
		int tempF = sc.nextInt();
		double tempC = 5.0 / 9 * (tempF - 32);
		System.out.printf("섭씨 %.2f도입니다.", tempC);
		
	}
}
