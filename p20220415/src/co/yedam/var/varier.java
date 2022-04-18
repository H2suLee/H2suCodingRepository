package co.yedam.var;

public class varier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언(p48~p58)
		
		// int는 타입(자료형), age는 변수 이름
		//int age = 20;

//		int age2, age3, age4 = 20; 는 아래로 풀어줄 수 있음
		int age2;
		int age3;
		int age4 = 20;
		
		int speed;
		int tire;
		//int speed, tire;
		// 위의 두 줄 = 밑에 한 줄
		// 데이터 입력은 아래와 같이 따로 할 수 있음
		speed = 10;
		tire = 20;
		
		// 정리하면,
		// 1개만 선언 후 데이터를 바로 넣지 않는 방법
		int age;
		age = 415;
		
		// 1개만 선언, 데이터를 바로 넣는 방법
		int a = 415;
		
		// 여러개 선언하는 방법, 데이터는 따로 늫기
		int b, c;
		b = 10;
		c = 11;
		
		// 여러개 선언과 동시에 데이터 넣는 방법
		int e = 1, g = 10, f = 100;
		
		// 지금까지 계속 초기화 과정을 계속 한 것임(p50)
		// 변수 초기화: 변수에 최초로 값이 저장되는 과정
		// 초기값: 변수 초기화에 사용된 값, 예를 들어 변수이름 e의 초기값은 1
								
		System.out.println(age);
		System.out.println(speed);
		System.out.println(tire);
		System.out.println(e+g+f);
	}

}
