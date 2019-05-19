package com.gmail.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack stack = new StackStorage();
		
		for (Integer i = 0; i < 16; i++) {
			try {
				stack.push(i);
			} catch (StackSizeExceededException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
		
		System.out.println((Integer) stack.peek());
		
		for (int i = 0; i < Stack.STACK_SIZE; i++) {
			System.out.println((Integer) stack.pop());
		}
	}

}
