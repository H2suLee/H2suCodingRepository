package co.edu.getset;

public class Car {
	// 필드
	private String company;
	private String model;
	private String color;
	private int speed;

	// 생성자
	// 위 필드들이 public이었으면 아래와 같이 생성자를 만들었을 것
//	public Car(int a) {
//		this.speed = a;
//	}
	
	// 메소드 
	
	// 그치만 getter setter를 활용할 거기 때문에 위 필드들을 private로 바꾸고 
	// getter and setter 메소드 써 보기
	
	public String getCompany() { // getter
		return company;
	} 
	public void setCompany(String company) { // setter
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		// set을 mile 로 했을 때 km로 환산하여 출력하기
		// 환산 공식을 km = mile * 2라고 가정
		return speed*2;
	}
	public void setSpeed(int speed) {
		// 속도를 음수로 입력하는 상황을 방지화하기 위해 데이터 입력 제한
		if(speed < 0) {
			speed = 0;
		}
		this.speed = speed;
	}
}
