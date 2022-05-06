package co.micol.prj0506.stack;

public class Stack {
	
	// 샘이 만든 알고리즘
	private int[] stack = new int[10];
	private int top = 0;
	
	public void push(int num) {
		if(top == stack.length) {
			System.out.println("Stack Full");
		} else {
			stack[top] = num;
			top++;
		}
	}
	
	public int pop() {
		if(top == 0) {
			System.out.println("Stack Empty");
		} else {
			top--;
			System.out.println(stack[top]);
		}
		return 1;
	}

}

		/*
		// 메인에 내가 만든 거

		int[] stackstack = new int[10];
		int num;
		int top = 0;
		int data;

		// push

		for (int i = 0; i < 10; i++) {

			stackstack[i] = i + 1;
			top++;

			if (top == stackstack.length) {
				System.out.println("Stack full");
			}
		}

		// pop

		for (int i = 0; i < 10; i++) {

			System.out.println("pop 결과 : " + stackstack[top - 1]);
			top--;
			if (top == 0) {
				System.out.println("Stack empty");
			}
		}
		*/
