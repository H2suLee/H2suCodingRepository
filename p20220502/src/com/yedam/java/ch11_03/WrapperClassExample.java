package com.yedam.java.ch11_03;

public class WrapperClassExample {
	public static void main(String[] args) {
		// Boxing 늫기
		Integer obj1 = Integer.valueOf(300);
		Integer obj2 = Integer.valueOf("300");
		
		// Unboxing 끄집어내기
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		// 자동 Boxing
		Integer obj = 100; // heap 영역에 새로운 객체 생성
		System.out.println("value: " + obj.intValue());
		
		// 대입 시 자동 Unboxing
		int value = obj; // 객체의 주소 값이 아닌 내부 값을 넘겨 줌, heap 영역에 있는 객체의 값을 복사
		System.out.println("value: " + value);
		
		// 연산 시 자동 Unboxing
		int result = obj + 100; // 100 + 100
		System.out.println("result: " + result);
		
		// 포장 객체 비교 // 논리값이 아닌 저장된 값을 비교하려면 == 이 아닌 equals()를 사용해야
		// 단 값의 범위 안이라면 == 연산자를 사용해도 됨
		System.out.println("[-128~127 범위 값일 경우(byte, short, int)]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== 결과: " + (obj3==obj4));
		System.out.println("언박싱 후 == 결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + (obj3.equals(obj4)));
		System.out.println(obj3);
		System.out.println(obj3.intValue());
		
		System.out.println("[-128~127 초과 값일 경우(byte, short, int)]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("== 결과: " + (obj5==obj6));
		System.out.println("언박싱 후 == 결과: " + (obj5.intValue() == obj6.intValue())); // 언박싱하고 비교 // 이게 번거로워서 equals
		System.out.println("equals() 결과: " + (obj5.equals(obj6)));
		System.out.println(obj5);
		System.out.println(obj5.intValue());
		
		
	}
}
