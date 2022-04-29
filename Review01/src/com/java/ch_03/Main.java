package com.java.ch_03;

public class Main {

	public static void main(String[] args) {
//		int lotto;
//		for(int i = 1; i<=6; i++) {
//			lotto = (int) (Math.random() * 45) + 1;
//			System.out.println(i + "번째 수: " + lotto);
//		}
		
		int lotto1 = (int) (Math.random() * 45) + 1;
		System.out.println("1번째 수: " + lotto1);
		int lotto2 = (int) (Math.random() * 45) + 1;
		System.out.println("2번째 수: " + lotto2);
		int lotto3 = 0;
		int lotto4;
		int lotto5;
		int lotto6;
		
//		if (lotto1 == lotto2) {
//			System.out.println("중복 오류, 다시 돌리세요");
//		} else {
//			lotto3 = (int) (Math.random() * 45) + 1;
//			System.out.println("3번째 수: " + lotto3);
//		}
//		
//		if(lotto1 == lotto3 && lotto2 == lotto3) {
//			System.out.println("중복 오류, 다시 돌리세요");
//		} else {	
//			int lotto4 = (int) (Math.random() * 45) + 1;
//			System.out.println("4번째 수: " + lotto4);
//		}
		
		if (lotto1 != lotto3 && lotto2 != lotto3) {
			lotto4 = (int) (Math.random() * 45) + 1;
			System.out.println("4번째 수: " + lotto4);
		}
			if(lotto1 != lotto4 && lotto2 != lotto4 && lotto3 != lotto4 ) {
				lotto5 = (int) (Math.random() * 45) + 1;
				System.out.println("5번째 수: " + lotto5);
			}
				if(lotto1 != lotto5 && lotto2 != lotto5 && lotto3 != lotto5 && lotto4 != lotto5 ) {
					lotto6 = (int) (Math.random() * 45) + 1;
					System.out.println("보너스 수: " + lotto6);
				}
			}
}
				
//			}
//		} else {
//			System.out.println("다시 돌리세요.");
//		}
//		int lotto3;
//		int lotto4;
//		int lotto5;
//		int lotto6;
//		
//		if
//		
//		
//		int lottery1 = (int) (Math.random() * 45) + 1;
//		System.out.println("첫번째 번호 : " + lottery1);
//		int lottery2 = (int) (Math.random() * 45) + 1;
//		System.out.println("두번째 번호 : " + lottery2);
//		int lottery3 = (int) (Math.random() * 45) + 1;
//		System.out.println("세번째 번호 : " + lottery3);
//		int lottery4 = (int) (Math.random() * 45) + 1;
//		System.out.println("네번째 번호 : " + lottery4);
//		int lottery5 = (int) (Math.random() * 45) + 1;
//		System.out.println("다섯번째 번호 : " + lottery5);
//		int lottery6 = (int) (Math.random() * 45) + 1;
//		System.out.println("♥ 보너스 번호 : " + lottery6);

