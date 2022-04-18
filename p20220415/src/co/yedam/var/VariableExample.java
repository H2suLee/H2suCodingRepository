package co.yedam.var;

public class VariableExample {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		long longVar1 = 10;
		long longVar2 = 20L;
		//long longVar3 = 10000000000; (컴파일 에러)
		long longVar4 = 10000000000L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		System.out.println(longVar4);
		
		char c1 = 'A'; // 출력 결과: A, 문자를 직접 저장
		char c2 = 65; // 출력 결과: A, 10진수로 저장
		char c3 = 44032; // 출력 결과: 가, 10진수로 저장
		char c4 = 0x0041;// 출력 결과: A, 16진수로 저장
		// 아스키코드(ASCII TABLE) 참조
		int c5 = 'A'; // 출력결과: 65, int 타입 변수에 문자 리터럴을 저장하면 유니코드 자체가 출력됨
		int c6 = 'a'; // 출력결과: 97, int 타입 변수에 문자 리터럴을 저장하면 유니코드 자체가 출력됨
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		char c = 'A'; // 문자
		String str = "AB"; //문자열
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(str);
		System.out.println(name);
		System.out.println(job);

		//역슬래시(이스케이프) 사용해 보기, 문자열 내부에 특정 문자 포함시키기
		System.out.println("번호\t이름\t직업"); // \t: 탭만큼 띄움
		System.out.println("행 단위 출력\n"); // \n: 행 단위 출력
		System.out.println("우리는 \"개발자\"입니다."); // \" 큰 따옴표 삽입 \' 작은 따옴표 삽입
		System.out.println("봄\\여름\\가을\\겨울\\"); // \\ 역슬래시 삽입

		// 실수 타입: float, double
		//float floatVar1 = 3.14; // float로 선언했는데 f를 안 붙여서 double로 인식해서 컴파일 에러 남
		float floatVar2 = 3.14f;
		double doubleVar1 = 0.321;
		
		// 정밀도 테스트, 소수점 몇자리까지 나타낼 수 있는 지
		float floatVar3 = 0.1234567890123456789f; // 소수점 아래 8자리까지, 
		double doubleVar2 = 0.1234567890123456789; // 소수점 아래 16자리까지, double이 2배 이상 정밀한 값으로 출력하여 정밀도가 더 높다
		
		System.out.println(floatVar3);
		System.out.println(doubleVar2);
		
		// 논리 타입: boolean
		boolean stop = true;
		boolean state = false;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		// 조건이 참일 때 if 다음의 중괄호로 진입,
		// 조건이 거짓일 때 else 다음의 중괄호로 진입
		
		if(state) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		if(5>3) {
			System.out.println("맞는 말이라는..");
		} else {
			System.out.println("틀린 말이라는..");
		}
		
		 int a = 1;
		 byte b = 1;
		 System.out.println(a);
		 System.out.println(b);
		 // 출력 결과는 같음 
		 // 근데 메모리에서 int로 선언된 a의 초기값 1은 메모리에서 4byte를 차지하고,
		 // byte로 선언된 b의 초기값 1은 메모리에서 1byte를 차지함
		
		} //클래스 닫음
} //패키지 닫음
