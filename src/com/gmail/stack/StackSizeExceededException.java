package com.gmail.stack;

public class StackSizeExceededException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Stack maximum size was exceeded";
	}

}
