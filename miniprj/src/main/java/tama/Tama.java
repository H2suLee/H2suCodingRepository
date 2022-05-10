package tama;

import java.util.Random;
import java.util.Scanner;

public class Tama {
	static int cplay, cfeed, cshower, chealth; // 각 행위의 카운터.
	static int like; // like = 호감도(점수).
	static float time;	// 시간 .
	static int Dday; 			// 날짜.
	static int dCount; 		// 날짜카운트.
	static int age; 			// 나이(Dday)가 '7'이 되면 '1'씩 증가.
	static int chanceTime;		// 각 시간대 마다 미니게임을 중복으로(2회 이상)하지 못하게 판별하는 변수.
	static boolean gameChance;	// 미니게임을 할 수 있는 기회의 유무를 확인하는 변수.	
	static String now;	 		// 현재 시간대.
	static int inputNum;		// 선택지에서 숫자입력받는 변수.
	String o = "□", x = "■";			// 상태 수치를 문자로 표시.
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public void Set() {		// 게임시작시 각 수치들을 초기화 해주는 작업.
		cplay = 50;	
		cfeed = 50; 		
		cshower = 50;
		chealth = 50;
		like = 50;			// 각 카운터들과 호감도는 '50' 부터 시작한다.
		Dday = 1;			// 날짜 '1' 일부터 시작.
		dCount = 1;			// 날짜 세는 카운터 '1' 부터 시작.
		time = 0;			// 시간은 '0' 부터 시작.
		chanceTime = 0;		// 미니게임 기회 판별하는 변수, 시간대에 따라 값이 바뀐다.
		age = 0;			// 나이 '0' 부터 시작.
	}
	
	public void infoprint() {	// 현재 날짜, 시간대와 다마고치의 현재 상태를 수치테이블로 출력.
		System.out.print("Day : " + Dday + "\t");		//현재 날짜를 출력.
		timec();										//현재 시간대 계산.
		System.out.print("time : " + now + "\t\n\n");		//현재 시간대 출력.
		System.out.print(
				"이름 : " + TamaName.tamaName +"     " //다마고치의 이름 출력.	
				+ "나이 : "+age+"     호감도 : " 		 //현재 나이 출력.
				+ like +"\r\n\r\n");	////현재 호감도 출력.
		stateTable();									//다마고치의 상태를 수치표로 출력.
	}
	
	public void timec(){					// 현재 시간대 출력,미니게임 기회 부여.
		if(time < 8) {						// 시간이 '8' 미만일 때.
			now="아침"; 						// now변수에 "아침" 을 입력.
			if(chanceTime == 0) {			// chanceTime이 '0' 일 경우에만 실행.
				chanceTime = 1;				// chanceTime에 '1' 을 입력.
				gameChance = true;			// gameChance에 'true' 를 입력.(미니게임을 가능상태로 변환)
			}
		}
		else if(time < 16) {				// 시간이 '16' 미만일 때.
			now="점심";						// now변수에 "점심" 을 입력.
			if(chanceTime == 1) {			// chanceTime이 '1' 일 경우에만 실행.
				chanceTime = 2;				// chanceTime에 '2' 를 입력.
				gameChance = true;			// gameChance에 'true' 를 입력.(미니게임을 가능상태로 변환)
			}
		}
		else {								// 시간이 '24' 미만일 때.
			now="저녁"; 						// now변수에 "저녁" 을 입력.
			if(chanceTime == 2) {			// chanceTime이 '2' 일 경우에만 실행.
				chanceTime = 3;				// chanceTime이 '3' 일 경우에만 실행.
				gameChance = true;			// gameChance에 'true' 를 입력.(미니게임을 가능상태로 변환)
			}
		}
	}
	
	public void stateTable() {			// 현재 다마고치의 상태를 수치로표현.
		System.out.print("심심 : ");			// 심심한 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (cplay / 10 >= i) {			// cplay의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cplay의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("허기 : ");			// 배고픈 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (cfeed / 10 >= i) {			// cfeed의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cfeed의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("청결 : ");			// 깨끗한 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (cshower / 10 >= i) {		// cshower의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cshower의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("근육 : ");			// 운동량을 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (chealth / 10 >= i) {		// chealth의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// chealth의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
	}
}
