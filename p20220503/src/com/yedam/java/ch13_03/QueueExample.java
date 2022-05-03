package com.yedam.java.ch13_03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		// queue는 인터페이스라서 구현 클래스가 필요함
		// 구현 클래스를 linked list로 지정
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) { // 빌 때까지 반복
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 메시지를 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			
			}
		}
		
		// 선입선출로 출력됨 FIFO
	}
}
