package com.yedam.java.ch11_01;

public class MemberExample {
	public static void main(String[] args) {
		Member n1 = new Member("blue");
		Member n2 = new Member("blue");
		Member n3 = new Member("red");
//		if(n1 == n2) { // 메소드 재정의하고 나서는 여기서 동등하지 않다고 함
		if(n1.equals(n2)) { // 동등 x if(n1 == n2)랑 같은 구문 // 메소드 정의하고 나서는 동등하다고 나옴
			System.out.println("n1과 n2는 동등합니다.");
		} else {
			System.out.println("n1과 n2는 동등하지 않습니다.");
		}
		
		if(n1.equals(n3)) { // 동등x
			System.out.println("n1과 n3는 동등합니다.");
		} else {
			System.out.println("n1과 n3는 동등하지 않습니다.");
		}
		
		if(n1 == n2) { // 동등x
			System.out.println("n1과 n2는 동등합니다.");
		} else {
			System.out.println("n1과 n2는 동등하지 않습니다.");
		}
		
		if(n1 == n3) { // 동등x
			System.out.println("n1과 n3는 동등합니다.");
		} else {
			System.out.println("n1과 n3는 동등하지 않습니다.");
		}
		
	}

}
