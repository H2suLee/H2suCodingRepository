package co.edu.member;

public class Person {

	// 필드
	public String nation = "korean";
	public String ssn;
	public String name;

	// 생성자

	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	// 메소드
	public void getInfo() {
		System.out.println(nation + "," + ssn + "," + name);
	}

}
