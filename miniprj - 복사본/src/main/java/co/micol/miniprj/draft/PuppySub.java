package co.micol.miniprj.draft;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PuppySub {
	Scanner sc = new Scanner(System.in);
	private Puppy puppy;
	private List<Puppy> list = new LinkedList<>();
	
	public void select() {
		
	}
	
	
	public void register() {
		sc.nextLine();
		
		System.out.println("강아지 이름 입력");
		String name = sc.nextLine();
		
		System.out.println("강아지 성별 입력");
		String gender = sc.nextLine();
		
		System.out.println("강아지 몸무게 입력");
		String weight = sc.nextLine();
		
		System.out.println("강아지 크기 입력");
		String size = sc.nextLine();
		
		
		puppy = new Puppy(name, gender, weight, size);
		list.add(puppy);
		
		System.out.println(name+"의 엄마가 되신 걸 축하합니다 ! ! !");

	}
	
	public void printList() {
		for(Puppy puppy : list) {
			list.toString();
		}
	}
}
