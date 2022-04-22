package co.edu.getset;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(-50);
		int speed = myCar.getSpeed();
		System.out.println(speed);
		
		myCar.setSpeed(8);
		speed = myCar.getSpeed();
		System.out.println(speed);
		
	}
	
}
