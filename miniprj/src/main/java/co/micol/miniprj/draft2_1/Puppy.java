package co.micol.miniprj.draft2_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Puppy {

	Scanner sc = new Scanner(System.in);

	public String userName;
	public String name;
	public String gender;
	public String birthday;



	static Puppy[] p = new Puppy[1]; // 최대 한마리로 한정

	public Puppy() {

	}

	public Puppy(String name1, String name, String gender, String birthday) {
		super();
		this.userName = name1;
		this.name = name;
		this.gender = gender;
		this.birthday = getBirthday();

	}

	private String getBirthday() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		return simple.format(date);
	}

	public void register() {
		System.out.println("강아지 등록을 진행하겠습니다.");
		System.out.println("먼저 견주의 이름을 등록해 주세요");
		String name1 = sc.nextLine();
		System.out.println("강아지의 이름을 등록해 주세요");
		String name = sc.nextLine();
		System.out.println("강아지의 성별을 등록해 주세요");
		String gender = sc.nextLine();
		String birthday = getBirthday();

		Puppy pup = new Puppy(name1, name, gender, birthday);
		p[0] = pup;
		p[0].getInfo();

	}
//		System.out.println(name + "의 엄마가 되신 것을 축하합니다." + name1 + "님!");
//		System.out.println(name + "는" + birthday + "에 태어난 귀여운 " + gender + " 강아지예요.");
//		System.out.println("그럼 키우러 가볼까요..");
//	}

//		Puppy puppy2 = new Puppy(name1, name, gender, birthday);
//		getInfo(puppy2);
//	}
//	
	public void getInfo() {
		System.out.println(this.name + "의 엄마가 되신 것을 축하합니다." + this.userName + "님!");
		System.out.println(this.name + "는" + this.birthday + "에 태어난 귀여운" + this.gender + "강아지예요.");
		System.out.println("그럼 키우러 가볼까요..");
	}

}
