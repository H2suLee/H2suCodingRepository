package chapter3;

public class operator3 {
	public static void main(String[] args) {
		// 삼항 연산자(?:) 3개의 피연산자 필요
		// (조건식)?(참이면 실행할 값 또는 연산식):(거짓이면 실행할 값 또는 연산식);
		
		int score0 = 95;
		char grade0;
		if(score0>90) {
			grade0 = 'A';
		} else {
			grade0 = 'B';
		}
		System.out.println("학점은 " + grade0 + "입니다.");
		
		// 위 반복문을 삼항 연산자를 활용하여 아래와 같이 간단하게 표현할 수 있다.
		
		int score = 95;
		char grade = (score > 90)?'A':'B'; // (조건)?참이면a실행:거짓이면b실행
		System.out.println("학점은 " + grade + "입니다.");
		
		//p126
		
		int score1 = 65;
		char grade1 = (score1>90)?'A':((score1>80)?'B':'C');
		System.out.println("학점은 " + grade1 + "입니다.");
		
	}
}
