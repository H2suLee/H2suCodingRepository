package chapter3;

public class operator2 {
	public static void main(String[] args) {
		// 이항 연산자: 피연산자가 2개인 연산자
		// 산술 연산자, 문자열 결합 연산자, 비교 연산자, 논리 연산자, 대입 연산자

		// 산술 연산자: +-/* %(나머지 구하는)

		// char 타입의 산술 연산
		char c1 = 'A' + 1; // char c1 = 66 -> B
		char c2 = 'A'; // 작은 따옴표 안의 A 그대로 저장됨
		// char c3 = c2 + c1; // c2 + c1의 값은 정수인데 char c3에 넣으려니 컴파일 오류 남
		char c3 = (char) (c2 + c1); // 이렇게 char로 강제 변환하거나
		int c4 = c2 + c1; // int로 자동 변환 해야 함 (66+65=131)
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println("-------");

		// 비교 연산자: (크기 비교) < <= > >=, (동등 비교) ==(같은 지) !=(다른 지)
		// true나 false 값만 산출

		System.out.println(10 == 10);
		System.out.println(10 >= 10);
		System.out.println(10 != 10); // 달라야 true인데 같으니까 false
		System.out.println('A' < 'B');
		System.out.println(1 == 1.0); // 비교하기 전에 피연산자 타입을 일치 시킴. 1.0 == 1.0
		System.out.println(0.2 == 0.2f); // float 타입과 double 타입은 두 값이 같지 않음. 아래와 같이 타입 변환 필요
		System.out.println((float) 0.2 == 0.2f);
		System.out.println("-------");

		// 문자열 비교 p121
		// 문자열에서는 동등 비교만 가능. 기본 타입 변수는 == 연산자로 비교한다면 문자열은 equals() 메소드 사용
		String str1 = "AA";
		String str2 = "AA";
		String str3 = "AB";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("-------");

		// 논리 연산자 && || ^ !
		// 논리 연산자의 피연산자는 boolean만 가능
		// p123
		int ia = 'A';
		if((ia>=65) && (ia<=90) ) {
			System.out.println("대문자군요");
		}
		if((ia>=97) && (ia<=127) ) {
			System.out.println("소문자군요");
		}
		
		int var = 6;
		if(var % 2 == 0 && var % 3 == 0) {
			System.out.println("2의 배수이면서 3의 배수입니다.");
		} else {
			System.out.println("2 그리고 3의 배수가 아닙니다.");
		}
		
		var = 14;
		if(var % 2 == 0 || var % 4 == 0) {
			System.out.println("2의 배수이거나 4의 배수입니다.");
		} else {
			System.out.println("2 그리고 4의 배수가 아닙니다.");
		}

		var = 9;
		if(var % 2 == 0 || var % 4 == 0) {
			System.out.println("2의 배수이거나 4의 배수입니다.");
		} else {
			System.out.println("2 그리고 4의 배수가 아닙니다.");
		}

		System.out.println("-------");
		
		
		// 대입 연산자 = += -= *= /= %=
		// ex) 변수 += 피연산자 -> 변수 = 변수 + 피연산자
		// p125
		
		int result = 0;
		result += 10; // result = result + 10 -> result = 0 + 10 -> result = 10
		System.out.println(result);
		
		result -= 5; // result = result - 5 -> result = 10 - 5 -> result = 5
		System.out.println(result);
		
		result *= 3; // result = result * 3 -> result = 5 * 3 -> result = 15
		System.out.println(result);
		
		result /= 5; // result = result / 5 -> result = 15 / 5 -> result = 3
		System.out.println(result);
		
		result %= 3; // result = result % 3 -> result = 3 % 3 -> result = 0
		System.out.println(result);
		
		System.out.println("-------");


	}
}
