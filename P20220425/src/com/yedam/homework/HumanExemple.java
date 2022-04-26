package com.yedam.homework;

public class HumanExemple {

	public static void main(String[] args) {
		
//	Human human = new StandardWeightInfo("홍길동", 168, 45);
//	human.getInformation();
//	Human human1 = new ObesityInfo("박둘이", 168, 90);
//	human1.getInformation();
		
		// 문제에서 변수를 한 번만 선언하라고 했으니
		Human human = null;
		human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInformation();
		human = new ObesityInfo("박둘이", 168, 90);
		human.getInformation();
	}

}
