package chapter2;

public class example_1 {

	public static void main(String[] args) {
		// 반지름이 5인 원의 면적(원주율*반지름제곱)
		
		double PI = 3.14;
		int radius = 5;
		double gongsik = PI * radius * radius;
		// double이 더 큰 타입이기 때문에
		System.out.println(3.14*5*5);
		System.out.println(gongsik);
		
		// 사칙연산 + - * /
		// 한 면이 4, 높이는 4인 정삼각형의 넓이를 구하시오.
		// 정삼각형 넓이: 밑면 * 높이 / 2
		int byeon;
		byeon = 4;
		int height;
		height = 4;
		int gongsik_2 = byeon * height / 2;
		System.out.println(gongsik_2);
		System.out.println(byeon*height/2);
		
		height = 6;
		byeon = 6;
	}

}
