package com.yedam.homework;

public class HumanExemple {

	public static void main(String[] args) {
		
	Human human = new StandardWeightInfo("홍길동", 168, 45);
	human.getInformation();
	Human human1 = new ObesityInfo("박둘이", 168, 90);
	human1.getInformation();
	}

}
