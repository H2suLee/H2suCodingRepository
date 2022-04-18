package co.edu.Text;

import java.util.Scanner;

public class FCconvert {

	public static void main(String[] args) {
		// scanner로 화씨 데이터 입력받아 화씨 -> 섭씨 변환 프로그램
		// c = 5/9(F-32)
		Scanner sc = new Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		double F = (double) sc.nextInt();
		double C = (double) (5.0 / 9.0 * (F - 32.0));
		System.out.println("화씨로 : " + C);
		
//		int num = sc.nextInt();
//
//		Scanner sc = new Scanner(System.in); // 스캐너라는 타입의 변수를 선언하고, 데이터를 입력받을 수 있게끔 객체를 만듦
//		while(true) { // means 15~18 값을 계속 반복
//		System.out.println("스캐너 값을 입력하세요.");
//		String str = sc.nextLine(); // 문자열을 입력받을 수 있는
//		//int value = sc.nextInt(); // 정수를 입력받을 수 잇는
//		System.out.println("입력값 : " + str);
//		if(num ==1) {
////			System.out.println("숫자 1");
////		} else if (num ==2) {
////			System.out.println("숫자 2");
////		}
	}

}

