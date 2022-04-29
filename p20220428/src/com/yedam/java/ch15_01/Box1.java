package com.yedam.java.ch15_01;

// 제너릭.. 변수 많이 안 쓸라고..

// 클래스가 제너릭타입으로 선언이 되면, 필드, 게터, 세터가 아래와 같이 변함
public class Box1<T> {
	
	// private Object object;
	
	private T t; // -> String t
	
	// public Object getObject(){return object; }
	
	public T get() {return t;} // -> public String get() { return t;}
	
	// public void setObject(Object object) { this.object = object; }
	public void set(T t) {this.t = t;} // public void set(String t) { this.t = t;}

}
