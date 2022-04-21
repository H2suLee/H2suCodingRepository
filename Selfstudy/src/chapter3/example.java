package chapter3;

public class example {
	public static void main(String[] args) {
		// 사다리꼴 넓이 = (윗변 + 밑변 ) * 높이 / 2
		// 윗변 = 5, 밑변 = 10, 높이 = 7 인 사다리꼴의 넓이를 구하시오. 소수점이 나올 수 있도록 계산하시오.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		
		// p129~ 9번부터 14번까지 풀기
	}
}
