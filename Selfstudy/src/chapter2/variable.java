package chapter2;

public class variable {

	public static void main(String[] args) {
		// 변수 선언: 변수 타입, 변수 이름
		int x;
		int y;
		int z;
		// int x, y, z; 와 동일

		// 값 저장, 대입 연산자(=) 이용
		int score;
		score = 90;
		// 이 때, 변수 score는 초기화 된 상태이며, 초기값은 90으로 설정됨
		// int score = 90; 과 동일
		
		// 값 저장 요약
		// 1개만 선언, 데이터는 후에 저장
		int age;
		age = 415;

		// 1개만 선언과 동시에 데이터 바로 저장
		int a = 415;

		// 여러개 선언, 데이터는 후에 저장
		int b, c;
		b = 10;
		c = 11;

		// 여러개 선언과 동시에 데이터 저장
		int e = 1, g = 10, f = 100;
		
		// 변수 사용: 변수에 저장된 값을 출력하거나 연산하여 사용
		System.out.println(e+g+f);

		
		int aa = 1;
		int bb = 2;
		System.out.println(aa + bb);
		System.out.println(aa - bb);
		System.out.println(aa / bb);
		System.out.println(aa * bb);
		
		// 변수 사용 예제 p53
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + " 분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		// ★변수값 교환 p53
	}

}
