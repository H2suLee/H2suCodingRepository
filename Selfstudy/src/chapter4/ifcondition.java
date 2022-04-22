package chapter4;

public class ifcondition {
	public static void main(String[] args) {
		// if 조건문의 실행 흐름 도식화
		/*
		 * 1) if문 if(조건식) { 실행문A // 조건식이 참일때 실행 } // 2) if-else문 if(조건식) { 실행문A } else {
		 * 실행문 B } // 3) 중첩 if문 if(조건식) { 실행문A } else if(조건식2) { 실행문B } else { 실행문C }
		 */

		int score3 = 93;
		if (score3 >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		System.out.println("--------------------");
		
		
		int score2 = 60;
		if (score2 >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급이 A가 아닙니다.");
		}
		System.out.println("--------------------");
		
		int score = 75;
		if (score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		System.out.println("--------------------");
		
	}

}
