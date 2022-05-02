package personal;

public class CultureExample {

	public static void main(String[] args) {
		Culture culture;
		culture = new Movie("추격자", 7, 5, "영화");
		culture.setTotalScore(5);
		culture.setTotalScore(4);
		culture.setTotalScore(3);
		culture.getInformation();

		System.out.println("=======================");
		
//		culture = new Performance("지킬앤하이드", 9, 10, "공연");
		culture.setTotalScore(5);
		culture.setTotalScore(2);
		culture.setTotalScore(1);
		culture.setTotalScore(5);
		culture.setTotalScore(5);
		culture.setTotalScore(4);
		culture.setTotalScore(3);
		culture.setTotalScore(1);
		culture.getInformation(); // 평점 3.25
		
		
		
	}

}

//공연제목:지킬앤하이드
//감독:9
//배우:10
//공연총점 : 46
//공연평점 : ☆☆☆☆☆
