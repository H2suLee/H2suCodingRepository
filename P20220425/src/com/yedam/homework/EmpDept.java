package com.yedam.homework;

// 자식 클래스
public class EmpDept extends Employee {

	// 필드
	public String dept;
	
	// 생성자 
	public EmpDept(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}
	
	// 메소드
	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + "\t연봉 : " + salary + "\t부서 : " + dept );
	}
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	

}
