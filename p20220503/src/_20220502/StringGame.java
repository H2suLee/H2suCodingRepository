package _20220502;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame {
	
	// 필드
	private String[] strData = {"Orange", "Game", "Phone", "Smart"};
	private String strAnswer; // 답
	private List<Character> charData; // b 넣고 c 넣은 값 받는 박스
	
	// 생성자
	public StringGame() {
		init();
	}
	// 게임 초기화
	public void init() {
		strAnswer = getStrAnswer();
		charData = new ArrayList<Character>();
	}
	
	// 게임 선택
	private String getStrAnswer() {
		return strData[(int)(Math.random()*4)].toLowerCase(); // 대문자 소문자 섞여있으므로 다 소문자로 통일
	}
	
	// 메뉴1. 문자 하나
	// 정답에 포함된 문자인 지 확인
	
	public void setCharData() {
		// 현재까지 입력된 문자들의 목록을 출력
		showCharData(); // 1~3에서 반복되는 기능이므로 아예 메소드로 구현할 것
		// 값 입력 받기 전 조건 걸어주고
		if(charData.size() == strAnswer.length()) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		// 값을 입력 받기
		}else {
			String inputStr = inputData(); // inputData()도 중복 사용이 많아서 메소드로
			if(strAnswer.indexOf(inputStr.charAt(0)) != -1) {
				System.out.println("문자열을 구성하는 문자입니다.");
				charData.add(inputStr.charAt(0));
			} else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}
	}
	
	public void showCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(char data : charData) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	public String inputData() { // 값을 입력 받아서 String으로 반환하는 메소드
		System.out.println("입력 값 >>");
		return new Scanner(System.in).next().toLowerCase(); 
	}
	
	// 여기까지 1, 3, 4 메뉴 구현 가능
	
	// 메뉴2. 단어
	// 현재까지 확인된 문자들의 목록을 먼저 출력하고
	// 값을 입력받고 
	// 정답인 지 
	// 정답이 아니라면 문자별로 O, X 구분
	public void setStrData() {
		showCharData();
		String inputStr = inputData();
		// 정답이라면
		if(strAnswer.equals(inputStr)) {// 위에 showCharData메소드에서 반환 값에 toLowerCase() 안했으면 equalsignore()도 써야 함
			System.out.println("정답입니다.");
		// 정답이 아니라면
		} else {
			showStrData(inputStr);
		}
	}
	
	public void showStrData(String inputStr) {
		if(strAnswer.length() == inputStr.length()) {
			for(int i = 0; i<strAnswer.length(); i++) {
				if(strAnswer.charAt(i) == inputStr.charAt(i)) {
					System.out.print("O ");
				} else {
					System.out.println("X ");
				}
			}
		} else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
		}
	}
	

}
