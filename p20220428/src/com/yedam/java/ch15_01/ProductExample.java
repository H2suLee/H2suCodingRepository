package com.yedam.java.ch15_01;

public class ProductExample {
	public static void main(String[] args) {
		Product <Tv, String> product1 = new Product<Tv, String>();
		product1.setT(new Tv());
		product1.setM("스마트 TV");
		
		Tv tv = product1.getT();
		String tvModel = product1.getM();
		
	}
}
