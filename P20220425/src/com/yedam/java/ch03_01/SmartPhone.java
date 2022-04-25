package com.yedam.java.ch03_01;

public class SmartPhone extends Phone {
	
	// 
	// 매개 변수를 가지는 생성자가 필요
	// super를 통해서는 반드시 부모 클래스의 생성자를 호출
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 위와 같이 생성하지 않으면 아래와 같이 java가 자동으로 default값 생성.
//	
//	public SmartPhone(String owner) {
//	 super() // java가 SmartPhone이 자식 클래스라는 걸 확인했기 때문에 super()도 자동으로 생성
//	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
