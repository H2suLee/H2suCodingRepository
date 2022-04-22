package co.edu.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열: 같은 데이터타입을 연속된 공간에 저장
		// int 타입 (정수) 배열, 5개의 데이터를 넣을 수 있는 공간
		int[] ary = new int[5];

		// 데이터 저장 방법
		// 1)
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;
		
		pu

		// 2)
		int[] ary1 = { 1, 2, 3, 4, 5 };

		// 1. 배열을 만든 후, 반복문과 Scanner를 통해 데이터 담기.
		Scanner sc = new Scanner(System.in);
		int[] ary2 = new int[5];
		
		 for(int i = 0; i < ary2.length; i++) { System.out.println("데이터를 입력하시오.");
		 ary2[i] = sc.nextInt(); // 각 배열 칸에 첫번째 ~ 대섯번째 데이터를 넣는 구문
		 System.out.println(ary2[i]); // 각 배열 칸의 데이터 출력 }
		 

		// 2.
		
//		 for(int i = 0; i < ary2.length; i++) { 
//			 System.out.println("점수를 입력하시오.");
//		 }
//		 ary2[i] = sc.nextInt(); 
//		 
//		 int sum = 0; 
//		 for(int i = 0; i < ary2.length; i++) { 
//			 sum += ary2[i]; }
//		 }
//		 System.out.println("총점 : " + sum); 
//		 System.out.println("평균 : " + (double)(sum/ary2.length));
//		 
//		int sum = 0;
//
//		
//		 for(int i = 0; i < ary2.length; i++) { System.out.println("점수를 입력하시오.");
//		 ary2[i] = sc.nextInt(); sum += ary2[i]; System.out.println(sum); }
//		 
//		 System.out.println("총점 : " + sum); System.out.println("평균 : " + (double)(sum/ary2.length));
//		 
//		
//		
//		// 1~100까지 합을 구하는 방법
//		int sum = 0;
//		int[] ary3 = new int[10];
//		for (int i = 0; i < ary3.length; i++) {
//			ary3[i] = i + 1; // 0~99번의 칸에 1부터 100까지 데이터를 입력
//		}
//		sum = 0;
//		for (int i = 0; i < ary3.length; i++) {
//			sum += ary3[i]; // sum에 배열 0~99번째까지의 데이터를 누적
//		}
//		System.out.println(ary3[98]);
//		System.out.println(ary3[99]);
//		System.out.println(sum);

//		sum = 0;
//		System.out.println(ary3[0]);
//		System.out.println(ary3[9]);
//		for (int i = 0; i < ary3.length; i++) {
//			// 99번째 칸(마지막칸)에 1~99 더한 값(4950)을 저장 함
//			if (i == 9) {
//				ary3[i] = sum;
//				break;
//			}
//			System.out.println(ary3[i]);
//			sum += ary3[i];
//		}
//		System.out.println(ary3[8]);
//		System.out.println(ary3[9]);
//		System.out.println(sum); // 1~99까지의 합
//
	}

}
}

