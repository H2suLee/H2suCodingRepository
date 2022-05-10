package co.micol.miniprj.draft;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Puppy {
	
	private String name;
	private String gender;
	private String weight;
	private String size;
	private String birthday;
	
	public Puppy() {
		
	}
	
	public Puppy(String name, String gender, String weight, String size) {
		super();
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.size = size;
		this.birthday = birthday();
	}
	
	// getter setter
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getWeight() {
		return weight;
	}

	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// 생년월일
	
	public String birthday() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		return simple.format(date);
	}
	@Override
	public String toString() {
		System.out.println("(" + this.name + ")");
		return null;
	}
	
	
}
