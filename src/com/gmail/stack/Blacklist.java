package com.gmail.stack;

public interface Blacklist {
	
	public abstract void addClass(Class newClass);
	public abstract boolean isClassIllegal(Class newClass);

}
