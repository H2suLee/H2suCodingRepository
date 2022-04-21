package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		// 메소드 호출, powerOn이라는 메소드를 안 썼는데 excute메소드를 통해 "전원을 켭니다." 호출
		cal.execute(); // 외부 호출
		
		int result;
		result = cal.plus(3, 2);  // 이때 괄호 안에 있는 것들(3, 2)가 매개변수
		System.out.println(result);
		result = cal.minus(10, 2);
		System.out.println(result);
		
		double avg; 
		avg = cal.avg(10, 2);
		System.out.println(avg);
		
		// 메소드 오버로딩
		// Calculator2 사용해 보기
		Calculator2 cal2 = new Calculator2();
		double result1 = cal2.areaRectangle(10);
		double result2 = cal2.areaRectangle(10, 2);
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
		
		
	}

}
