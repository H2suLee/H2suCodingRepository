package co.edu.Oper;

public class OperatorExam2 {

	public static void main(String[] args) {
	
		// 비교연산자 (p119)
		// == != > >= < <=
		
		// 논리연산자 (p122)
		// AND(&&,&, 논리곱), OR(||,|, 논리합), XOR, NOT
		// TRUE = 1, FALSE = 0
		
		// 실습 
		
		/*if 문 기본 구조
		if (조건) {
			참일 때 실행;
		} else {
			거짓일 때 실행;
		}*/
		
		// 정수 비교
		int i = 101;
		if (i <= 100) { 
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
		// 문자열 비교
		String str = "서브웨이";
		String str2 = "버거킹";
		if(str.equals(str2)) {
			System.out.println("맛있다.");
		} else {
			System.out.println("별로다.");
		}
		
		int var = 6;
		if(var % 2 == 0 && var % 3 == 0) {
			System.out.println("2의 배수이면서 3의 배수입니다.");
		} else {
			System.out.println("2 그리고 3의 배수가 아닙니다.");
		}
		
		var = 9;
		if(var % 2 == 0 || var % 4 == 0) {
			System.out.println("2의 배수이면서 4의 배수입니다.");
		} else {
			System.out.println("2 그리고 4의 배수가 아닙니다.");
		}
				
		// 논리부정연산자 (p113)
		boolean flag = true;
		if(!flag) { // 참 값을 부정하고 싶을 때 변수 앞에 !를 넣어 실행 흐름 제어
			System.out.println("참");			
		} else {
			System.out.println("거짓");
		}
		
		// 삼항연산자 (p125)
		int score = 95;
		char grade = (score > 90)?'A':'B'; // (조건)?참이면a실행:거짓이면b실행
		System.out.println("학점은 " + grade + "입니다.");
			
	}

}
