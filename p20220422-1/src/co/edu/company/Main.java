package co.edu.company;

import java.util.Scanner;

import co.edu.member.Person;

public class Main {
	public static void main(String[] args) {

		// co.edu.member의 Person 클래스 기능을 쓰고 싶을 때 5번 라인과 같이 작성
		// 스캐너 클래스 추가 임포트
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person("11235", "홍길동");
		// 이 클래스 쓸라고 Person 필드, 메소드를 Private(default값) 에서 public으로 바꿈
		p1.getInfo();
		
		
		// Manager, Programmer -> Employee를 상속 받고, getSalary를 오버라이드
		// Manager -> baseSalary + 1000000
		// Programmer -> baseSalary + 2000000
	
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		
		Programmer prog = new Programmer();
		System.out.println("프로그래머의 월급 : " + prog.getSalary());
		
		// Bird는 Animal을 상속 받고, walk 메소드 재정의
		// bird.walk -> 헤엄을 칠 수 있다.
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		
		
		
	}
	

}
