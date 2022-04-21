package chapter2;

public class primitive {

	public static void main(String[] args) {
		// 기본 타입 p59~
		// 정수 타입: byte(1, ~127까지 표현 가능), char(2), short(2), int(4). long(8)
		// 실수 타입: float, double
		// 논리 타입: boolean
		
		// 정수 리터럴 p61, 기본적으로 컴파일러는 정수 리터럴을 int 타입으로 간주
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		// long 타입 변수
		long longVar1 = 10; // 정수 리터럴이 int 타입의 허용 범위 이내라면 L을 붙이지 않아도 됨
		long longVar2 = 20L;
		//long longVar3 = 10000000000; // 컴파일 에러), 
		long longVar4 = 10000000000L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		System.out.println(longVar4);

		// char 타입 변수
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
		
		// String 타입, 문자열을 저장할 수 있는 변수 타입, 기본 타입이 아닌 클래스 타입임
		String str = "AB";
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(str);
		System.out.println(name);
		System.out.println(job);
		
		// 역슬래시(\, 이스케이프) 사용하기 p65
		System.out.println("번호\t이름\t직업"); // \t: 탭만큼 띄움
		System.out.println("행 단위 출력\n"); // \n: 행 단위 출력
		System.out.println("우리는 \"개발자\"입니다."); // \" 큰 따옴표 삽입 \' 작은 따옴표 삽입
		System.out.println("봄\\여름\\가을\\겨울\\"); // \\ 역슬래시 삽입
		
		// 실수 타입
		// float floatVar1 = 3.14; // float로 선언했는데 f를 안 붙여서 double로 인식해서 컴파일 에러 남
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
			System.out.println("중지합니다."); 		// 조건이 참일 때 if 다음의 중괄호로 진입,
		} else {
			System.out.println("시작합니다.");		// 조건이 거짓일 때 else 다음의 중괄호로 진입
		}


		if(state) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		if(5>3) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
		// 메모리 관련 설명 추가
		 int a = 1;
		 byte b = 1;
		 System.out.println(a);
		 System.out.println(b);
		 // 출력 결과는 같음 
		 // 근데 메모리에서 int로 선언된 a의 초기값 1은 메모리에서 4byte를 차지하고,
		 // byte로 선언된 b의 초기값 1은 메모리에서 1byte를 차지함
		 
		 String svar = "나의 직업은 \"개발자\"입니다.";
		 System.out.println(svar);

	}

}
