package _220425_2;

public class Human {
	String name;
	int height;
	int weight;

	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.printf("%d님의 신장 %d, 몸무게 %d입니다.", this.name, this.height, this.weight);
	}

}
