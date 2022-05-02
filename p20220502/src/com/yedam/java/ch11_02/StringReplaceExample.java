package com.yedam.java.ch11_02;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(newStr);
		
		// 다시 원래로 바꾸고 싶으면
		System.out.println(oldStr);
		
//		oldStr = oldStr.replace("자바", " "); // 변수는 하나인데 객체는 두 개. 변수는 최신 객체만 불러오기 때문에 첫번째 객체는 앞으로 쓰이지도 않음. 메모리 낭비 발생
		// 위의 상황을 방지하기 위해서 사용하는 것이 Stringbuilder
		// 하나의 변수로 여러번 수정을 일으킨다고 하더라도 메모리를 하나 밖에 가지지 않으므로 메모리 낭비가 일어나지 않음
	}

}
