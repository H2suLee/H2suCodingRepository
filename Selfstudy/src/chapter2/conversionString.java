package chapter2;

public class conversionString {

	public static void main(String[] args) {
		// + 연산에서 문자열 자동 타입 변환 p80~
		// 숫자 + 숫자 -> 덧셈 연산 -> 숫자
		System.out.println(15 + 3); // 18

		// "문자열" + 숫자 -> 결합 연산 -> "문자열숫자"
		System.out.println("1" + 15 + 2); // 1152
		System.out.println("1" + (15 + 2)); // 117, 괄호를 걸어주어야 덧셈 우선

		// 숫자 + "문자열" -> "숫자" + "문자열" -> 결합 연산 -> "숫자문자열"
		System.out.println(2 + "7"); // 2+"7" -> "2"+"7" -> "27"
		System.out.println(2+2+"7"); // 왼쪽으로부터 순차적으로 연산 수행. 2+2 덧셈 연산부터 하고 결합 연산
		System.out.println("---------------");
		
		//p83
		String str1 = 10 + 2 + "8";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2+8);
		System.out.println(str4);
		System.out.println("---------------");

		// 문자열 -> 기본 타입으로 강제 타입 변환
		// String -> byte: byte value = Byte.parseByte(str)
		// String -> short: short value = Short.parseShort(str)
		// String -> int: int value = Integer.parseInt(str)
		// String -> long: long value = Long.parseLong(str)
		// String -> float: float value = Float.parseFloat(str)
		// String -> double: double value = Double.parseDouble(str)
		// String -> boolean: boolean value = Boolean.parseBoolean(str)
		// ** (double), (int) 숫자 연산에서만 사용
		
		// "1000"을 정수 1000으로

		int value00 = Integer.parseInt("1000");
		System.out.println(value00);
		
		String str5 = "1000";
		int value0 = Integer.parseInt(str5);
		System.out.println(value0);
		
		double value000 = Double.parseDouble("1000");
		System.out.println(value000);

		// "0.025"를 실수 0.025로
		String str6 = "0.25";
		double value1 = Double.parseDouble(str6);
		System.out.println(value1);
		System.out.println(value00 + value0 + value000 + value1); // 숫자로 바꿔진 거 증명(덧셈 연산)
		System.out.println("---------------");


		// 기본 타입을 문자열로 바꾸는 메소드
		String str7 = String.valueOf(10);
		String str8 = String.valueOf(3.14);
		String str9 = String.valueOf(true);
		System.out.println(str7 + str8); // 문자열로 바꿔진 거 증명 (결합 연산)
	}

}
