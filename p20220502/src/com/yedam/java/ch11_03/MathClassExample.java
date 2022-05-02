package com.yedam.java.ch11_03;

public class MathClassExample {
	public static void main(String[] args) {
		// p504
		
		// 음수의 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		// 올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);
		
		// 내림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		
		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		// 랜덤값
		double v11 = Math.random();
		System.out.println("v11 : " + v11);
		
		// rint 값, 가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7); // -5.7일 경우 -6.0
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);
		
		// 반올림값 round 값 // rint는 실수값, round는 long값 //round 값은 무조건 소수점 이하 첫째자리에서 반올림 함. round값은 소수점이하가 없음 
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 : " + v14);
		System.out.println("v15 : " + v15);
		
		// round 메소드를 통해 소수점 이하 셋째자리에서 반올림하고 싶은 경우
		double value = 12.3456;
		double temp1 = value * 100; // 1234.56
		long temp2 = Math.round(temp1); // 1235.0;
		double v16 = temp2 / 100.0; // 12.35;
		System.out.println("v16 : " + v16);
		
		// round 와 rint
		// rint는 정중앙의 값에서 짝수 값으로 넘어감. (0.5)에서 0으로 넘어감, (1.5)에서 2로 넘어감
		System.out.println("round(1.5) : " + Math.round(1.5));
		System.out.println("rint(1.5) : " + Math.rint(1.5));
		System.out.println("round(-0.5) : " + Math.round(0.5));
		System.out.println("rint(-0.5) : " + Math.rint(0.5));
		
		
		
		
		
		
	
		
	}

}
