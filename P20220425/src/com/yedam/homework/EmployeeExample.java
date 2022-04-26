package com.yedam.homework;

public class EmployeeExample {

	public static void main(String[] args) {
		EmpDept jina = new EmpDept("이지나", 3000, "교육부");
//		Employee jina = new EmpDept("이지나", 3000, "교육부"); // 처럼 자동 타입 변환 방식으로 해도 됨
		jina.getInformation();
		jina.print();
	}

}
