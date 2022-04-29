package com.yedam.java.ch11_01;

//p475

public class Key {
	
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(key.number == this.number) {
				return true;
				
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
//		return super.hashCode(); // 재정의 전 디폴트 값
		return number;
	}
	
	// equals랑 hashcode 둘 다 Override해야 됨
	// 둘 중 하나라도 안 하면 Key example에서 홍길동을 null로 출력함
	

}
