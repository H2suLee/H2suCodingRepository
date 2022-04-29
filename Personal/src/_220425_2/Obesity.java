package _220425_2;

public class Obesity extends StandardWeightInfo {

	public Obesity(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	// 메소드
	// 내 풀이
//	public double getObesity() {
//		return (double)(this.weight / getStandardWeight() *100);
//	}
//	
//	@Override
//	public void getInformation() {
//		if(getObesity()>120) {
//			System.out.printf("%s님의 신장 %d, 몸무게 %d, 비만입니다.\n", this.name, this.height, this.weight);
//		}
//	}
	
	// 선생님 풀이: 비만도 공식, 비만조건 설정, 출력 시 getObesity메소드 직접 호출

	
	@Override
	public void getInformation() {
		System.out.println(this.name + "님의 신장 " + this.height + ", 몸무게 " + this.weight +", " + getObesity() +"입니다.");
	}
	
	public String getObesity() {
		double bmi = (this.weight - this.getStandardWeight())/this.getStandardWeight() * 100;
		String obesity = null;
		if(bmi <= 18.5) {
			obesity = "저체중";
		}else if(bmi <= 22.9) {
			obesity = "정상";
		}else if(bmi <= 24.9) {
			obesity = "과체중";
		}else {
			obesity = "비만";
		}
		return obesity;
	}

}
