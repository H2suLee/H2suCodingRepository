package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 반복문으로 최대값 최소값 구하기
		int[] ary1 = { 5, 10, 4, 7, 8 };
		int max = 0;
		int min = ary1[0]; // 최소값을 비교할 수 있도록 0이 아니라 배열의 첫번째 칸 값을 넣음

		for (int i = 0; i < ary1.length; i++) {
			if (max < ary1[i]) {
				max = ary1[i];
			}
			if (min > ary1[i]) {
				min = ary1[i];
			}

		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

		//
		Scanner sc = new Scanner(System.in);
		int[] ary2 = null; // 배열은 만들되, 배열의 크기를 지금 정하지는 않겠다.
		System.out.println("배열의 사이즈를 입력하세요.");
		int num = sc.nextInt(); // 배열 크기로 할 정수 입력
		ary2 = new int[num]; // 입력한 정수가 배열 크기가 됨

		for (int i = 0; i < ary2.length; i++) { // 각 칸에 숫자 담기 0번째 칸 = 1
			ary2[i] = i + 1;
		}
		System.out.println("ary2[1]칸에 있는 값: " + ary2[1]);

		//2의 배수 구하기 
		 for(int i = 0;i<ary2.length; i++) { 
			 if(ary2[i] % 2 == 0) {
		 System.out.println(ary2[i]); } }
		 

		// 홀수만 출력
		for (int i = 0; i < ary2.length; i++) {
			if (ary2[i] % 2 == 1) {
				System.out.println(ary2[i]);
			}
		}
		
		// 값을 입력받아 ary2와 ary3, 총 두 개의 배열을 만듦
		int[] ary3 = new int[num];
		for (int i = 0; i < ary3.length; i++) {
			ary3[i] = i;
		}
		
		// 중첩 반복문, 조건문을 이용한 데이터 출력
		for (int i = 0; i < ary3.length; i++) {
			for(int j = 0; j<ary3.length; j++) {
				if(ary2[i]+ary3[j] < 10) {
					System.out.println("1. "+ary2[i]+ "/ 2."+ary3[j]);
				}
			}
			
		}
		
		
		
		
		
	}

}
