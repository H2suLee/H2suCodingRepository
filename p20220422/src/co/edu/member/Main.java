package co.edu.member;

public class Main {
	public static void main(String[] args) {
		
		//StaticMember sm = new StaticMember(); // 정적 멤버에서는 이렇게 객체를 만드는 부분 생략
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.plus(5, 10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10, 5);
		System.out.println(minus);
		
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		
		int sales = Pizza.count;
		System.out.println("판매된 피자 갯수 : " + sales);
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(p1== p2) {
			System.out.println("같은 피자입니다.");
		}
		// p1과 p2는 서로 다른 주소 번지를 가지고 있기 때문에 위 내용을 출력하지 않음
		if(obj1== obj2) {
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		// obj1==obj2는 같은 주소를 갖고 있는 단 하나의 싱글톤 객체이므로 위 내용 출력을 함
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		Person p4 = new Person("123456-4568791", "홍길동" );
	
		System.out.println(p4.nation + "," + p4.ssn + "," + p4.name);
		
//		p4.nation = "USA"; // 컴파일 에러, nation필드는 파이널로 지정되었기 때문
		
		// 정적 멤버와 파이널을 사용하여 지구의 면적 구하기
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA);
		
		
	}
}
