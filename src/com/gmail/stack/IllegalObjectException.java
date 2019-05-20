package com.gmail.stack;

public class IllegalObjectException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Object is illegal to add to stack";
	}

}
