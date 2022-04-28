package com.yedam.java.homework;

public class Question1 {
	
		public static void main(String[] args){
			String[] strArray = { "10" , "2a" };
			int value = 0;
			for(int i = 0; i <= 2; i++ ){ // numberformatException
				
        	try{
            	value = Integer.parseInt(strArray[i]); // numberformatException
            } catch(ArrayIndexOutOfBoundsException e){
            	System.out.println("ArrayIndexOutOfBoundsException가 발생하였습니다. 반복문 등호 수정");
            } catch(NumberFormatException e) {
            	System.out.println("NumberFormatException이 발생하였습니다. 숫자 형식에 맞게 필드값 수정");
            } finally {
            	System.out.println(value);
            }
        }
    }
}



