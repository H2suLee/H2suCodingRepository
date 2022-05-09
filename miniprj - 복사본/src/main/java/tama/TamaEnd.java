package tama;

import java.util.Scanner;

public class TamaEnd {
	Scanner scan = new Scanner(System.in);
	public void end() {							// 퀴즈에서 얻은 힌트로 암호를 입력하면 리얼엔딩.
		String answerStr;							// 문자열입력받을 변수.
		System.out.println("\r\nPassword : \r\n");	
		answerStr = scan.next();					// 변수에 입력값 입력.
		if(answerStr.equals("영진전문대J2화이팅")) {		// 입력받은 문자가 "영진전문대J2화이팅" 일 경우.
			System.out.println("\r\n여기까지 클리어 하신 "+TamaName.tamaName+"님 축하드립니다!\r\n 앞으로도 하시는 일 모두 잘되시길 바라겠습니다*^^* \r\n");			// 리얼엔딩.
		}
		else {
			System.out.println("\r\nERROR.\r\n");			// 암호가 틀렸을 경우.
		}
	}
	public void reStart() {						// 게임이 끝날을 때 재시작 할건지 말건지를 선택.
		System.out.println("게임이 종료되었습니다. 수고하셨습니다 ~.~");		
		System.out.print("1. 재시작  2. 종료");		// 메뉴 출력.
		Tama.inputNum = scan.nextInt();				// 선택.
	}
}
