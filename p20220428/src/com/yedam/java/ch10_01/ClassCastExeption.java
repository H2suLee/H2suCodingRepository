package com.yedam.java.ch10_01;

public class ClassCastExeption {
	public static void main(String[] args) {
	
		changeDog(new Dog());
		changeDog(new Cat()); 
		// 둘 다 애니멀을 상속하고 있기 때문에 매개 변수를 넘기는 것 자체에는 문제가 없음, 
		// 그치만 애니멀은 changeDog 메소드 내에서 Dog으로 강제 타입 변환되었기 때문에 ClassCastException
		// 실행하면:  class com.yedam.java.ch10_01.Cat cannot be cast to class com.yedam.java.ch10_01.Dog (Cat이 Dog으로 변환될 수 없다)
	}
	
	public static void changeDog(Animal animal){
		Dog dog = (Dog) animal;
		
	}

	// 이런 식으로 오류처리 가능
	// public static void changeDog(Animal animal) {
	// if(animal instanceof Dog ) {
	//		Dog dog = (Dog) animal;	
	// }
	// 
	
	}
	
	





class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
