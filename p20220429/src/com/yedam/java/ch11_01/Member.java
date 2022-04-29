package com.yedam.java.ch11_01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	
	// shift + alt + s > Override/Implement Methods에서 equals 선택
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj; // 강제 타입 변환
			if(id.equals(member.id)) { // 타입이 아니라 타입 안의 필드를 비고
				return true;
			}
		}
		return false;
	}

// 디폴트
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	@Override
	public int hashCode() {
//		return super.hashCode(); // 재정의 전 디폴트 값
		return id.hashCode();
	}
	

}
