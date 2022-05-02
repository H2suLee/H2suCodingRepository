package personal;

public abstract class Culture {
	
	// 필드
	public String title;
	public int director;
	public int actor;
	public int audience;
	public int totalScore;
	
	
	// 생성자
//	public Culture() {
//		
//	}

	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	// 메소드
	
	// 관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) {
		audience++; // setTotalScore로 값 받을 때마다 (관객수) 1 누적
		this.totalScore += score;
	}
	
	
//	public String getGrade() {
//		
//		String grade = null;
//		int avg = this.totalScore / this.audience;
//		switch(avg) {
//		case 1:
//			grade = "☆";
//			break;
//		case 2:
//			grade = "☆☆";
//			break;
//		case 3:
//			grade = "☆☆☆";
//			break;
//		case 4:
//			grade = "☆☆☆☆";
//			break;
//		case 5:
//			grade = "☆☆☆☆☆";
//			break;
//		}
//		return grade;
//	}
	
// ★ 별찍기로 총점 출력하는 방법
	public String getGrade() {
		
		int grade = this.totalScore / this.audience; 
		String strGrade = null;
		for(int i = 0; i<=grade;i++) {
			strGrade += "☆";
		}
		return strGrade; // 일케 getGrade() 호출하면 ☆☆☆☆영화평점 : 로 뜸
		
	}
	
	public abstract void getInformation();
	

}