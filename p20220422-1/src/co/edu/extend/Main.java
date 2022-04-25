package co.edu.extend;

public class Main {
	public static void main(String[] args) {
		CellPhoneDMB dmbCellPhone = new CellPhoneDMB("고아라폰", "white", 100);
		
		// 부모 클래스 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangUp();
		
		// 자식 클래스 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		
		// 부모 클래스 메소드
		dmbCellPhone.powerOff();
		System.out.println("===================================");
		// Calculator - Computer p318
		// 부모 클래스
		Calculator cal = new Calculator();
		cal.areaCircle(50);
		System.out.println(cal);
		System.out.println(cal.areaCircle(50)); 
			
		// 자식 클래스
		Computer com = new Computer();
		com.areaCircle(50);
		System.out.println(com);
		System.out.println(com.areaCircle(50)); 
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeoff(); // 부모
		sa.fly(); // overrided 자식
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly(); // overrided 자식
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly(); // overrided 자식
		sa.land(); // 부모
	
		// 클래스 간 자동 타입 변환
		Member mem = new Person();
		
		
		
	}

}
