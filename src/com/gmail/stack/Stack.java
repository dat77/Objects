package com.gmail.stack;

public interface Stack {
	
	public static final int STACK_SIZE = 32;
	public abstract void push(Object obj) throws StackSizeExceededException, IllegalObjectException;
	public abstract Object pop();
	public abstract Object peek();

}
