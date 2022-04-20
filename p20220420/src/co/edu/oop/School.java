package co.edu.oop;

public class School {
	public static void main(String[] args) {
		
		Student std = new Student();
		// new연산자를 통해 초기화 된 std라는 이름의 Student 타입
		// Student라는 타입을 만들거고 이름은 std. new는 뭔데
		std.name = "고길동";
		std.age = 20;
		std.getInfo();
		
		std.name = "이희수";
		std.getInfo();
		
		int value = 1;
		// value라는 이름의 정수 타입. 
		
	}
}
