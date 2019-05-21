package com.gmail.stack;

public class Main {

	public static void main(String[] args) {

		StackStorage stackStorage = StackStorage.getStackStorage();
		Stack stack = stackStorage.getStack();
		Blacklist blacklist = stackStorage.getBlacklist();

		blacklist.addClass(Double.class);

		try {
			for (Integer i = 0; i < 16; i++) {
				stack.push(i);
			}
		} catch (StackSizeExceededException | IllegalObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			for (int i = 1; i < 17; i++) {
				stack.push(Double.valueOf(1.0 / i));
			}
		} catch (StackSizeExceededException | IllegalObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			for (int i = 1; i < 20; i++) {
				stack.push(Float.valueOf(1.0f / i));
			}
		} catch (StackSizeExceededException | IllegalObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(stack.peek());

		for (int i = 0; i < Stack.STACK_SIZE; i++) {
			Object obj = stack.pop();
			System.out.println(obj.getClass() + " : " + obj);
		}
	}

}
