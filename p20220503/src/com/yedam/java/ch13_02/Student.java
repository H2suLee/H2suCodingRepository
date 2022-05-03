package com.yedam.java.ch13_02;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// 내부 필드 값이 모두 동일하면 똑같은 hashCode 값을 가질 수 있도록 두 메소드 오버라이딩
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && name.equals(student.name);
		} else {
			return false;
		}
	}
	
	

}
