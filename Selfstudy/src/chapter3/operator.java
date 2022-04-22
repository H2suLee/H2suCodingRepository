package chapter3;

public class operator {

	public static void main(String[] args) {
		// p102~ 
		// 연산의 방향과 우선순위
		// 단항, 부호, 대입은 오른쪽에서 왼쪽 방향으로 연산 수행
		// a = b = c = 5 -> c=5, b=c, a=b 순서로 진행 -> 그 결과 a, b, c 값이 모두 5가 됨
		
		// 연산자의 종류 p108~
		// 연산자는 필요로하는 연산자의 수에 따라 단항, 이항, 삼항으로 구분
		// 단항: ++x
		// 이항: x + y
		// 삼항: (sum > 90 )? "A" : "B";
		
		// 단항 연산자: 부호 연산자 +, -, 증감 연산자 ++, --, 논리 부정 연산자 !
		// 증감 연산자: i++ = ++i -> i의 값을 1 증가시킴, i-- = --i -> i의 값을 1 감소시킴
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x); // 12
		
		y--;
		--y;
		System.out.println("y= " + y); // 8
		
		z = x++;
		System.out.println("z= " + z); // 12
		System.out.println("x= " + x); // 13
		
		z = ++x;
		System.out.println("z= " + z); // 14
		System.out.println("x= " + x); // 14
		
		z= ++x + y++;
		System.out.println("z= " + z); // 23
		System.out.println("x= " + x); // 15
		System.out.println("y= " + y); // 9
		
		System.out.println("-------------");
		
		// 논리부정연산자(!): true를 false로, false를 true로
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		
	}

}
