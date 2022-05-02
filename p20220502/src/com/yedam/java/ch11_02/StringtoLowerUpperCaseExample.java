package com.yedam.java.ch11_02;

public class StringtoLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2)); // false
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		
		System.out.println(str1.equalsIgnoreCase(str2)); // 논리적인 값만 비교
		
		
				
	}

}
