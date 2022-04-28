package _220425_2;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double getStandardWeight() {
		return (this.height - 100)*0.9;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, 표준 체중 %.1f입니다.\n", this.name, this.height, this.weight, getStandardWeight());
	}
	

}
