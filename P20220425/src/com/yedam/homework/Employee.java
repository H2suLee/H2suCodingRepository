package com.yedam.homework;

public class Employee {
//	- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 각 필드의 getter만 존재한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//	(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능

	// 필드 
	public String name;
	public int salary;
	
	// 생성자
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
// 각 필드의 getter만 존재한다는 얘기가 settergetter에서 setter만 빼고 출력하란 소린 아니지요..?
//	public String getName() {
//		return name;
//	}
//
//	public int getSalary() {
//		return salary;
//	}

	// 메소드
	public void getInformation() {
		System.out.println("이름 : " + name + "\t연봉 : " + salary);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	

}
