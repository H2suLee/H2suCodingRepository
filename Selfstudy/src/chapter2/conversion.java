package chapter2;

public class conversion {

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
		char charValue = (char) intValue;

		int intValue1 = 10; // 1byte 127까지 표현 가능
		byte byteValue = (byte) intValue1;
		
		double doubleValue = 3.14;
		int intValue2 = (int) doubleValue;

		System.out.println(charValue);
		System.out.println(byteValue);
		System.out.println(intValue2);
		System.out.println("--------------------------");
		
		// 연산을 통한 자동 타입 변환 p76~
		// 정수 연산에서의 자동 타입 변환
		
		byte xx = 10;
		byte yy = 20;
		// byte zz = xx+yy; // 컴파일 오류, 컴퓨터는 x, y를 int로 인식하기 때문.
		int zz = xx+yy;
		System.out.println(zz);
		
		char charValue1 = 'A'; // A로 출력
		char charValue2 = 1; // int charValue = 1임
		// char charResult = charValue1+charValue2; // 컴파일 오류, 타입을 int로 바꿔야
		int intValuee = charValue1+charValue2;
		char cccc = (char) (charValue1 + 1);
		System.out.println(charValue1);
		System.out.println(charValue2);
		System.out.println("유니코드 : " + intValuee); //int로 66
		System.out.println("출력문자 : " + (char)intValuee); //char로 B
		System.out.println(cccc);
		
		System.out.println("--------------------------");

		// 실수 연산에서의 자동 타입 변환: 실수 타입 변수가 산술 연산식에서 피연산자로 사용될 경우, 피연산자 중 하나가 double이면 다른 피연산자도 double로 자동 변환되어 연산 수행, 연산 결과는 double타입이 됨

		int inval = 1;
		double inre = inval / 2.0;
		System.out.println(inre); // 출력 결과: 2.0, 정수 나누기 실수를 하면 실수로 자동 타입 변환
		
		int aa = 10;
		double bb = 5.5;
		double result = aa + bb;
		System.out.println(result); // 출력 결과: 15. 5, double 타입으로 자동 변환
		
		int result2 = aa + (int) bb; // 출력 결과: 15, int로 강제 변환
		System.out.println(result2);
		
		int x = 1;
		int y = 2;
		double result3 = x/y;
		System.out.println(result3); // 출력 결과: 0.0, 정수 나누기 정수 후 몫을 정수로 출력(=0), 이를 double로 출력하려니 0.0이 됨
		
		// 위를 0.5로 출력하려면, 아래와 같이 세 가지 방법이 가능. x와 y 둘 중 하나 또는 둘 모두를 double 타입으로 변경
		int i = 1;
		int j = 2;
		double k = (double) i / j;
		System.out.println(k);
		
		int ii = 1;
		int jj = 2;
		double kk = ii / (double) jj;
		System.out.println(kk);
		
		int iii = 1;
		int jjj = 2;
		double kkk = (double) iii / (double) jjj; // (double) (iii/jjj) 로 수정하면 0.0 출력
		System.out.println(kkk);		
		
	
	}

}
