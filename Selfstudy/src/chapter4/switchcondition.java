package chapter4;

public class switchcondition {
	public static void main(String[] args) {
		// switch문의 구조
		/*
		 * switch(변수) { case 값1: 실행문A break; case 값2: 실행문B break; case 값3: 실행문C break;
		 * case 값4: 실행문D break; default: // 변수 값 1~4 다 아닐 경우, 생략 가능 실행문 E }
		 */

		// p142. 주사위 번호 뽑기
		int num = (int) (Math.random() * 6) + 1;
		switch (num) {
		case 1:
			System.out.println("숫자 1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("숫자 2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("숫자 3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("숫자 4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("숫자 5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("숫자 6번이 나왔습니다.");
			break;
		}

		System.out.println("---------------------------");
		
		// p143 break문이 없는 case
		// case 끝에 break가 붙어 있는 이유는 다음 case를 실행하지 않고 switch문을 빠져나가기 위함.
		// break가 없다면 다음 case가 연달아 실행되는데, 이때 case 값과 상관 없이 실행됨.

		int time = (int) (Math.random() * 4) + 8; // 정수 8~11 중 랜덤 추출
		System.out.println("[현재 시각: " + time + "시]");
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
		case 11:
			System.out.println("외근을 갑니다.");
		case 12:
			System.out.println("밥을 먹습니다.");
		}
		
		// p143 char타입의 switch문
		// 알파벳 대소문자에 관계없이 동일하게 처리하도로 만든 switch문
		System.out.println("---------------------------");
		
		char grade = 'B';
		
		switch(grade) {
		case 'a':
		case 'A':
			System.out.println("최우수 회원입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("우수 회원입니다.");
			break;
		case 'c':
		case 'C':
			System.out.println("일반 회원입니다.");
			break;
		default: 
			System.out.println("손님입니다.");
		
		}
		
		//p144 String타입의 switch문
		System.out.println("---------------------------");
		String position = "과장";
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}

	}
}
