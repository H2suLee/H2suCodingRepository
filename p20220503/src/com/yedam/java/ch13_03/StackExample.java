package com.yedam.java.ch13_03;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 어떻게 꺼내와 질 지
		
		while(!coinBox.isEmpty()) { // pop을 하다 보면 coinBox 비는 순간이 옴. 빌 때 까지 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		// push한 역순으로 pop됨
	}
}
