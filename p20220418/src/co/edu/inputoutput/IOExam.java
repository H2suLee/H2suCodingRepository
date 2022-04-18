package co.edu.inputoutput;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		// scanner 써 보기
		// scanner 선언했을 때 에러나면 import하면 됨(단축키는 ctrl+shift+o)
		// 그러면 3, 4라인과 같이 외부 기능 추가 라인 생성됨

		Scanner sc = new Scanner(System.in); // 스캐너라는 타입의 변수를 선언하고, 데이터를 입력받을 수 있게끔 객체를 만듦
		while(true) { // means 15~18 값을 계속 반복
		System.out.println("스캐너 값을 입력하세요.");
		String str = sc.nextLine(); // 문자열을 입력받을 수 있는
		//int value = sc.nextInt(); // 정수를 입력받을 수 잇는
		System.out.println("입력값 : " + str);
		if(str.equals("q")) {  // .equals: 문자열일때 괄호 안에 입력된 데이터와 내가 콘솔창에 넣은 데이터 비교 
			break; //19~20 means 입력값으로 q를 넣으면 반복 멈춤
		}
		
	}
		
//		System.out.print(false); // 괄호 안 내용 그냥 출력
//		System.out.println(); // 괄호 안 내용 출력 후 엔터
//		System.out.printf(null, args); // 괄호 안의 내용 커스텀해서 출력 
		
//		// printf 정수
//		int value = 100;
//		System.out.printf("%d\n", value); // %d: 자리 지정, \n: 줄 바꿈
//		System.out.printf("%5d\n", value); // 데이터가 총 다섯자리고, 공간이 남으면 공백을 앞에
//		System.out.printf("%-5d\n", value); // 총 다섯자리고, 공간이 남으면 공백을 뒤에
//		System.out.printf("%05d\n", value); // 총 다섯자리고, 공간이 남으면 공백을 앞에 '0'으로 처리
//
//		// printf 실수
//		double value2 = 12.123;
//		System.out.printf("%.2f\n", value2); // 소숫점 아래 2개까지만 표현
//		System.out.printf("%9.4f\n", value2); // 총 아홉 자리를 나타낼 거고, 소숫점 아래는 4개, 공간이 남으면 앞에 공백
//		System.out.printf("%-9.0f\n", value2); // 총 아홉 자리를 나타낼 거고, 소숫점 아래에 아무것도 표현하지 않고 남은 공간은 내 자료 뒤로 공백

		
		try {
			
			System.out.println("값을 입력하세요.");
			int keyCode = System.in.read();
			System.out.println("입력값 : " + keyCode);
			// 입력값은 콘솔창에
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
