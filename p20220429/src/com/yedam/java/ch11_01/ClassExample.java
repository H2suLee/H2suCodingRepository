package com.yedam.java.ch11_01;

public class ClassExample {
	
		public static void main(String[] args) throws ClassNotFoundException {
//			Class clazz = Member.class; // 방법 1
//			Class clazz = Class.forName("com.yedam.java.ch11_01.Member"); // 방법 2
			Member member = new Member("blue"); // 방법 3, 멤버 인스턴스를 사용해서 멤버 클래스를 가져오는 거
			Class clazz = member.getClass();
			
			System.out.println(clazz.getName()); // 풀네임
			System.out.println(clazz.getSimpleName()); // 간단 네임
			System.out.println(clazz.getPackage().getName()); // 패키지 풀네임
			System.out.println(clazz.getPackageName()); // 패키지 풀네임

			String textPath = clazz.getResource("info.txt").getPath();
			System.out.println(textPath);
			
		}

}
