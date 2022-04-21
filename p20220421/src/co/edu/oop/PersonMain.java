package co.edu.oop;

public class PersonMain {
	public static void main(String[] args) {
	
	Person person1 = new Person("940712-2*", "이희수", "대구시 중구", 29);
	person1.introduce();
	
	Person person2 = new Person("960227-1*", "이영흠", "서울시 강남구", 27);
	person2.introduce();
	
	Person person3 = new Person("970901-1*", "전영흠", "서울시 용산구", 26);
	person3.introduce();
	
	
	}
}

