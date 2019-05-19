package com.gmail.stack;

public class IllegalObjectException extends Exception {
	
	@Override
	public String getMessage() {
		return "Object is illegal to add to stack";
	}

}
