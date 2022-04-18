package co.edu.convert;

public class CalExam {
	public static void main(String[] args) {
		// 자동 타입 변환 연산
		int intValue = 10;
		double doubleValue = 5.5; 
		double result = intValue + doubleValue;
		System.out.println(result);
		// ctrl+f11 => 바로 실행(자바 컴파일)
		
		byte x = 10;
		byte y = 20;
		// byte z = x+y; // 컴파일 오류, 컴퓨터는 x, y를 int로 인식하기 때문.
		int z = x+y;
		
		char c = 'A'; // A로 출력
		char d = 1; // int d = 1임
		// char e = c+d; // 컴파일 오류, 타입을 int로 바꿔야
		int e = c+d;
		System.out.println(c);
		System.out.println(d);
		System.out.println("유니코드 : " + e); //int로 66
		System.out.println("출력문자 : " + (char)e); //char로 B
		
		// 실수 타입 변환
		int i = 1;
		double j;
		j= i/5; // 정수 나누기 정수, 몫이 0이고 double 타입으로 바꾸면 0.0
		System.out.println(j);
		
		j= i/5.0; // 1.0 / 5.0, 몫이 0.2이고 double 타입으로 바꾸면 0.2
		System.out.println(j);

		j = (double) i/5; // int i(1)를 double 타입(1.0)으로 변환시킨 상태에서 나누어 몫이 0.2
		System.out.println(j);
		
		// 숫자 + 숫자
		int value = 15;
		System.out.println(15+3); // 18
		
		// 문자열 + 숫자, 앞에 문자열이 있으면 괄호 안에 있는 모든 타입들이 String으로 변환됨
		// 연산을 하고 싶으면 45번처럼 괄호를 넣어야 함
		System.out.println("문자열 + 숫자: " + value + 2); // 152
		System.out.println("문자열 + 숫자: " + (value + 2)); // 17
	
		// 숫자 + 문자열, 왼쪽부터 읽기 때문에 숫자 계산 후 스트링
		System.out.println(value + 2 + " 숫자 + 문자열");
		System.out.println(value + 2 + (" 숫자 + 문자열"));

		// 문자열 -> 숫자로 타입 변환
		//Integer.parseInt(변수이름)
		// (double), (int) 숫자 연산에서만 사용
		String str = "1000";
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		String str1 = "0.3";
		double value2 = Double.parseDouble(str1);
		System.out.println(value2);
		
		// String str3 = "가나다";
		// int value3 = Integer.parseInt(str3);
		// System.out.println(value3); // NumberFormatException at p20220418/co.edu.convert.CalExam.main(CalExam.java:62) 에러가 남
		
		// 숫자 -> 문자열, valueOf에 숫자를 넣으면 문자열로 타입 변환
		String str4 = String.valueOf(value1);
		System.out.println(String.valueOf(value1).getClass()); // ★이거 함수 뭐지
	}
}
