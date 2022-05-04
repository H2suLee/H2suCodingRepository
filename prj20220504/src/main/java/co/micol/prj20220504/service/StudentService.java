package co.micol.prj20220504.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.dto.StudentVO;

// CRUD
// Create 생성, 등록, 추가
// Read 조회, 읽기
// Update 수정, 변경, 갱신
// Delete 삭제

public class StudentService {

	private StudentVO student; // 필드로 오브젝트 타입 선언
	private List<StudentVO> students = new ArrayList<>();// 우항에 <StudentVO> 를 <>로 써도 됨
	// List는 인터페이스라서 ArrayList, LinkedList, QueueList로만 구현 가능함

	private void dataSet() {

		student = new StudentVO("lee", "이영흠", "컴퓨터공학", "대구광역시", "010-1111-1111", Date.valueOf("1996-02-27")); // 0행
		students.add(student);

		student = new StudentVO("park", "박승리", "컴퓨터공학", "대구광역시", "010-2222-1111", Date.valueOf("1997-09-03")); // 1행
		students.add(student);

		student = new StudentVO("kim", "김치국", "컴퓨터공학", "대구광역시", "010-3333-1111", Date.valueOf("1994-02-18")); // 2행
		students.add(student);

		student = new StudentVO("hong", "홍길동", "컴퓨터공학", "대구광역시", "010-4444-1111", Date.valueOf("1994-07-12")); // 3행
																												// StudentVO.get(id)
		students.add(student);

	}

	// 전체학생 목록 보기 // 어레이 구조로 나와야 함
	public void selectList() {
		dataSet();
		for (StudentVO vo : students) {
			vo.toString();
		}
	}

	public void selectStudent(String id) {
		dataSet();

		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				System.out.println("검색한 학생 ===");
				vo.toString();
				break;
			}
		}

	}
	
	public void insertStudent(StudentVO vo) {
		dataSet();
		students.add(vo);
		for(StudentVO s : students) {
			s.toString();
	}

	}

}
