package co.micol.prj20220504.menu;

import java.sql.Date;
import java.util.Scanner;

import co.micol.dto.StudentVO;
import co.micol.prj20220504.service.StudentService;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	// 멤버 변수(필드)
	// 생성자
	// 멤버 메소드 정의
	
	private StudentService dao = new StudentService();

	public Menu() {
	}

	private void mainTitle() {
		System.out.println("=========================================");
		System.out.println("============ 1. 학 사 관 리 ===============");
		System.out.println("============ 2. 공 지 관 리 ===============");
		System.out.println("============ 3. 종      료 ===============");
		System.out.println("=========================================");
	}

	private void lmsTitle() {
		System.out.println("▶ 학 사 관 리 =============================");
		System.out.println("=========================================");
		System.out.println("============ 1. 전체 학생 조회 =============");
		System.out.println("============ 2. 학 생 조 회 ===============");
		System.out.println("============ 3. 학 생 등 록 ===============");
		System.out.println("============ 4. 학 생 수 정 ===============");
		System.out.println("============ 5. 학 생 삭 제 ===============");
		System.out.println("============ 6. 돌 아 가 기 ===============");
		System.out.println("=========================================");

	}

	private void noticeTitle() {
		System.out.println("▶ 공 지 관 리 =============================");
		System.out.println("=========================================");
		System.out.println("============ 1. 공 지 목 록 ===============");
		System.out.println("============ 2. 공 지 조 회 ===============");
		System.out.println("============ 3. 공 지 등 록 ===============");
		System.out.println("============ 4. 공 지 수 정 ===============");
		System.out.println("============ 5. 공 지 삭 제 ===============");
		System.out.println("============ 6. 돌 아 가 기 ===============");
		System.out.println("=========================================");

	}

	private void mainMenu() { // 종료 누를 때까지 동작이 되어야 함
		boolean b = false; // 초기값을 false로 두는 것이 관례

		do {
			mainTitle();
			System.out.println("원하는 작업을 선택하세요?");
			int code = sc.nextInt();
			switch (code) {
			case 1:
				lmsMenu();
				break;
			case 2:
				noticeMenu();
				break;
			case 3:
				b = true;
				sc.close(); // 최종적으로 끝낼 때 스캐너 종료 해줘야 됨
				System.out.println("Good bye♥");
				break;
			default:
				break;
			}
		} while (!b);

	}

	private void noticeMenu() {
		boolean b = false; // 초기값을 false로 두는 것이 관례

		do {
			noticeTitle();
			System.out.println("원하는 작업을 선택하세요?");
			int code = sc.nextInt();
			switch (code) {
			case 1:
				System.out.println("전체 공지의 목록을 보여준다.");
				break;
			case 2:
				System.out.println("공지 조회 내역을 보여준다.");
				break;
			case 3:
				System.out.println("공지사항을 등록한다.");
				break;
			case 4:
				System.out.println("공지사항을 수정한다.");
				break;
			case 5:
				System.out.println("공지사항을 삭제한다.");
				break;
			case 6:
				b = true;
				System.out.println("Good bye♥");
				break;
			default:
				break;
			}
		} while (!b);

	}

	private void lmsMenu() {
		boolean b = false; // 초기값을 false로 두는 것이 관례

		do {
			lmsTitle();
			System.out.println("원하는 작업을 선택하세요?");
			int code = sc.nextInt();
			switch (code) {
			case 1:
				dao.selectList();
				break;
			case 2:
				System.out.println("검색할 학생의 ID를 입력하세요.");
				String id = sc.next(); // 다음 공백을 만날 때까지만 읽겠다 // 대구광역시 중구 // 이러면 대구광역시까지만 읽음 // 스캐너 버퍼를 줄일 수 있음
				dao.selectStudent(id);
				break;
			case 3:
				sc.nextLine(); // 스캐너가 가지고 있는 버퍼 동작 시키는 // sc \n 삭제
				System.out.println("학생 아이디를 입력하세요");
				String nid = sc.nextLine();
				System.out.println("학생 이름을 입력하세요");
				String name = sc.nextLine();
				System.out.println("학생 전공을 입력하세요");
				String major = sc.nextLine();
				System.out.println("학생 주소를 입력하세요");
				String addr = sc.nextLine();
				System.out.println("학생	전화번호를 입력하세요");
				String tel = sc.nextLine();
				System.out.println("학생 생일을 입력하세요");
				String birthday = sc.nextLine();
				
				StudentVO vo = new StudentVO(nid, name, major, addr, tel, Date.valueOf(birthday));
				dao.insertStudent(vo);
				
				break;
			case 4:
				System.out.println("한 명 학생의 내역을 수정한다.");
				break;
			case 5:
				System.out.println("한 명 학생의 내역을 삭제한다.");
				break;
			case 6:
				b = true;
				break;
			default:
				break;
			}
		} while (!b);
	}
	
	public void run() { // 앞의 메소드들은 다 private // 캡슐화 기릿
		mainMenu();
	}

}
