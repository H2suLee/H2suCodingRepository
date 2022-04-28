package _220425_1;

public class Employee {
	
	// 필드
	String name;
	
	// 생성자
	int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// 메소드
	public void getInformation() {
		System.out.print("이름 : " + this.name + " 연봉 : " + this.salary + "\n" );
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	

}
