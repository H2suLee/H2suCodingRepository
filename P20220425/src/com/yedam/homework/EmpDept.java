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
//	public void print() {
//		System.out.println("수퍼클래스\n서브클래스");
//	}
//	
	
	// 프린트 메소드는 20~23라인처럼 적어도 되지만 이런 식으로 부모 클래스의 메소드를 호출할 수도 있음
	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}

}
