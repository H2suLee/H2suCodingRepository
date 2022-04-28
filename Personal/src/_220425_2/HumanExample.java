package _220425_2;

public class HumanExample {

	public static void main(String[] args) {
		Human human;
		human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInformation();
		
		human = new Obesity("박둘이", 168, 90);
		human.getInformation();
				

	}

}
