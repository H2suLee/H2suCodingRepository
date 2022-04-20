package co.edu.oop;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.x = 5;
		cal.y = 2;

		cal.plus(10, 2);
		cal.minus(10, 2);
		cal.multi(10, 2);
		cal.div(10, 2);
		
		Car car = new Car();
		car.model = "흠";
		car.color = "흠";
		car.price = 20000000;
		
		car.info();
		
		Car car2 = new Car();
		car2.model = "흠2";
		car2.color = "흠2";
		car2.price = 200000002;
		
		car2.info();
		
		Car car3 = new Car("그랜저", "black", 200); // 생성과 동시에 데이터를 입력하는 방법(Car에 두번째 생성자 참고)
		car3.info();
		
		
	}

}
