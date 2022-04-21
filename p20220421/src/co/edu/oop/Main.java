package co.edu.oop;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car(); // 자동차 객체 생성
		
		myCar.company = "기아";
		myCar.model = "K3";
		myCar.color = "white";
		myCar.maxSpeed = 150;
		
		myCar.info();
		System.out.println("=====================");
		
		// 생성자를 통한 데이터 입력

		// 회사이름은 null, 최대 속도는 0으로 뜨는데, 객체 초기화 시 데이터 지정이 안 되었기 때문임.
		Car myCar2 = new Car("소나타", "black");
		myCar2.info();
		System.out.println("=====================");
		
		// null 값이 뜨는 필드는 아래와 같이 직접 입력이 가능함
		Car myCar3 = new Car("소나타");
		myCar3.company = "현대";
		myCar3.color = "white";
		myCar3.maxSpeed = 150;
		myCar3.info();
		System.out.println("=====================");
		
		 Korean k1 = new Korean("박자바", "012345-1234567");
		 k1.getInfo();
		 
		 Korean k2 = new Korean("김자바", "789456-7894564");
		 k2.getInfo();
		 
		 Korean k3 = new Korean("미국", "이자바", "789456-3216548");
		 k3.getInfo();
	}

}
