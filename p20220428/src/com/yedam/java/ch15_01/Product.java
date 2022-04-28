package com.yedam.java.ch15_01;

// 복수 제너릭

public class Product<T, M> {
	
	
	// 필드
	private T t;
	private M m;
	
	
	// 메소드
	public T getT() {
		return t;
	}
	public M getM() {
		return m;
	}
	public void setT(T t) {
		this.t = t;
	}
	public void setM(M m) {
		this.m = m;
	}
	
}

class Tv {}
class Car {}

