package com.yedam.java.ch10_01;

public class ThrowsExample {

	public static void main(String[] args) {
		
//		호출된 findClass()를 try catch 해줘야 하는데 main에도 throw로 던져버리면 그냥 예외처리 안하겠다는 뜻
//		웬만하면 메인까지는 throw하는 일 없어야
		
		try {
			findClass();
		} catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않는다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2"); // ClassNotFoundException 발생, NumberFormatException도 발생 가능
		// throws로 선언만 하게되면 main class에서 호출하는 부분에서 try catch를 해 줘야 함
		// Add throws declaration
		
	}

}
