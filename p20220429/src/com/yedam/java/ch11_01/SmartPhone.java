package com.yedam.java.ch11_01;

public class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

//	@Override
//	public String toString() {
//		return "SmartPhone [company=" + company + ", os=" + os + "]";
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return company + "," + os;
	}
	
	

}
