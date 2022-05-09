package co.micol.miniprj.prac;


import java.util.HashMap;
import java.util.Scanner;

public class WordSet {
	private HashMap<String, String> map = new HashMap<String, String>();
	private Scanner sc = new Scanner(System.in);

	private void init() {
		map.put("computer", "컴퓨터");
		map.put("father", "아버지");
		map.put("mather", "어머니");
		map.put("morning", "아침");
		map.put("moon", "달");
	}

	private void wordSearch() {
		System.out.println("검색할 단어를 입력하세요.");
		String key = sc.next();

		if (map.get(key) == null) {
			System.out.println("검색한 단어는 존재하지 않습니다.");
		} else {
			System.out.println(key + " : 의미 ==> " + map.get(key));
		}
	}

	private void wordAdd() {
		System.out.println("추가할 단어를 입력하세요.");
		String key = sc.next();
		System.out.println("의미하는 한글을 입력하세요.");
		String value = sc.next();

		if (map.get(key) == null) {
			map.put(key, value);
			System.out.println("성공적으로 단어 사전에 추가 하였습니다.");
		} else {
			System.out.println("이미존재하는 단어 입니다.");
		}
	}

	private void wordDel() {
		System.out.println("삭제할 단어를 입력하세요.");
		String key = sc.next();
		if (map.get(key) == null) {
			System.out.println("존재하지 않는 단어입니다.");
		} else {
			map.remove(key, map.get(key));
			System.out.println(key + "는 삭제되었습니다.");
		}
	}

	private void wordUpdate() {
		System.out.println("수정할 단어를 입력하세요.");
		String key = sc.next();
		if (map.get(key) == null) {
			System.out.println("존재하지 않는 단어입니다.");
		} else {
			System.out.println("단어의 의미를 입력하세요.");
			String value = sc.next();
			map.replace(key, value);
			System.out.println(key + "의 의미가 변경되었습니다.");
		}
	}

	private void title() {
		System.out.println("==================");
		System.out.println("=== 1. 단어 검색 ===");
		System.out.println("=== 2. 단어 추가 ===");
		System.out.println("=== 3. 단어 변경 ===");
		System.out.println("=== 4. 단어 삭제 ===");
		System.out.println("=== 5. 종    료 ===");
		System.out.println("==================");
	}

	private void menu() {
		boolean b = false;
		do {
			title();
			System.out.println("수행할 작업번호를 선택하세요?");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				wordSearch();
				break;
			case 2:
				wordAdd();
				break;
			case 3:
				wordUpdate();
				break;
			case 4:
				wordDel();
				break;
			case 5:
				b = true;
				System.out.println("Good Bye!!!");
				sc.close();
				break;
			}
		} while (!b);
	}

	public void run() {
		init();
		menu();
	}
}
