package co.edu.oop;

public class Person {
	
	// Person 클래스 선언
	// 1) 필드
	// 1. 주민번호, 2. 이름, 3. 주소 4. 나이
	
	String idNo;
	String name;
	String addr;
	int age;
	
	// 2) 생성자
	// 1. 기본 생성자 ( 필드 초기화 x)
	// 지금 이 실습에서 당장 쓰이지는 않음. 첫번째 생성자 다 지워도 메인 클래스 가동 됨
	public Person() {
		
	}
	// 2. 주민번호, 이름, 주소, 나이를 매개변수로 필드 초기화

	public Person(String idNo, String name, String addr, int age) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	// 3) 메소드
	// 1. introduce
		// -> 출력 예시: "Person[name : John, age: 20]"
	void introduce() {
	//	System.out.println("Person\n> idNo: " + idNo + ", \n> name : " + name + ", \n> addr: " + addr + ", \n> age: " + age + "\n=========================" );
		System.out.println("Person\n> idNo: " + this.idNo + ", \n> name : " + this.name + ", \n> addr: " + this.addr + ", \n> age: " + this.age + "\n=========================" );

	}
	// Main 클래스에서 임의의 3명에 대한 객체를 만들고 메소드 introduce라는 호출을 하여 정보 출력

}
