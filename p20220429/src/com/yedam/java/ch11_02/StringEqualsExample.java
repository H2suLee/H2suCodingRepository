package com.yedam.java.ch11_02;

public class StringEqualsExample {
	
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동"; // new 연산자를 사용하여 새로운 객체를 만들지 않았으므로 둘은 논리적으로 같음 (equals로도 동등하고 ==로도 동등함)
		String str3 = new String("홍길동");
		// String에서 ==은 번지 비교, equals는 문자열 비교
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조합니다.");
			
		} else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}
		
		if(str1 == str3) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다."); 
		} else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가집니다.");
		} else {
			System.out.println("str1과 str2는 다른 문자열을 가집니다.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 문자열을 가집니다."); 
		} else {
			System.out.println("str1과 str3는 다른 문자열을 가집니다.");
		}
		
		
	}

}
