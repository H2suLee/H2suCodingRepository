package co.edu.company;

// 자식 클래스

public class Bird extends Animal {
	void fly() {
		System.out.println("날 수 있음");
	}
	
	@Override
	void walk() {
		System.out.println("헤엄칠 수 있음");
	}
	

}
