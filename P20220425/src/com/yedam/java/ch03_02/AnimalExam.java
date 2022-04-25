package com.yedam.java.ch03_02;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();

		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("=================================");
		
		// 자동타입변환

		Animal animal = null;
		animal = new Dog(); // 다형성 확인
		animal.sound();
		animal = new Cat(); // 다형성 확인
		animal.sound();
		System.out.println("=================================");

	}
}
