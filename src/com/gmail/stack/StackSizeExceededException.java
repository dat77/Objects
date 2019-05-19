package com.gmail.stack;

public class StackSizeExceededException extends Exception {

	@Override
	public String getMessage() {
		return "Stack maximum size was exceeded";
	}

}
