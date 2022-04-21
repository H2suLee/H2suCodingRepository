package chapter2;

public class InputOutput {

	public static void main(String[] args) {
//		System.out.print(false); // 괄호 안 내용 그냥 출력
//		System.out.println(); // 괄호 안 내용 출력 후 엔터
//		System.out.printf("형식 문자열", 값1, 값 2...); // 값1과 값2를 형식 문자열대로 출력해라 

		// printf 정수
		int value = 100;
		System.out.printf("%d\n", value); // %d: 자리 지정, \n: 줄 바꿈
		System.out.printf("%5d\n", value); // 데이터가 총 다섯자리고, 공간이 남으면 공백을 앞에
		System.out.printf("%-5d\n", value); // 총 다섯자리고, 공간이 남으면 공백을 뒤에
		System.out.printf("%05d\n", value); // 총 다섯자리고, 공간이 남으면 공백을 앞에 '0'으로 처리

		// printf 실수
		double value2 = 12.123;
		System.out.printf("%.2f\n", value2); // 소숫점 아래 2개까지만 표현
		System.out.printf("%9.4f\n", value2); // 총 아홉 자리를 나타낼 거고, 소숫점 아래는 4개, 공간이 남으면 앞에 공백
		System.out.printf("%-9.0f\n", value2); // 총 아홉 자리를 나타낼 거고, 소숫점 아래에 아무것도 표현하지 않고 남은 공간은 내 자료 뒤로 공백
		
		//p91
		
		int price = 100;
		System.out.printf("가격: %d원\n", price);
		System.out.printf("가격: %6d원\n", price);
		System.out.printf("가격: %-6d원\n", price);
		System.out.printf("가격: %06d원\n", price);
		
		double area = 3.1459 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 첫번째 정수는 10, 두번째 실수엔 area
		
	}

}
