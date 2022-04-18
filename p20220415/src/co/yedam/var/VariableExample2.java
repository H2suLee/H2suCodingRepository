package co.yedam.var;

public class VariableExample2 {	
	public static void main(String[] args) {
	// 자동 타입 변환(묵시적)
		byte a = 10;
		int b = a;
		long c = b;
		// byte 타입은 int 타입보다 데이터 범위가 작기 때문에 오류 없이 쏙 들어감
		// int 타입 < long 타입, 타입 변환 가능
		
		// char는 음수 표현이 불가능함
		// char가 byte보다 데이터 범위가 더 큼에도 음수 표현이 불가능하기 때문에 byte -> char로 타입 변환 불가능
		
	// 강제 타입 변환(명시적): 큰 타입을 작은 타입 단위로 쪼개기
		int intValue = 44032;
		char charValue = (char)intValue;
		
		int intValue1 = 10; // 1byte 127까지 표현 가능
		byte byteValue = (byte)intValue1; 
		
		System.out.println(charValue);
		System.out.println(byteValue);
		
		
		
}
}
