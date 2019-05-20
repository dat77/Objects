package com.gmail.stack;

import java.util.Arrays;

public class IllegalList implements Blacklist{

	private Class[] illegalClasses;

	public IllegalList() {
		this.illegalClasses = new Class[0];
	}

	public Class[] getIllegalClasses() {
		return illegalClasses;
	}

	@Override
	public void addClass(Class newClass) {
		if (isClassIllegal(newClass)) {
			return;
		}
		Class[] c = new Class[this.illegalClasses.length + 1];
		System.arraycopy(this.illegalClasses, 0, c, 0, this.illegalClasses.length);
		c[c.length - 1] = newClass;
		this.illegalClasses = c;
	}

	@Override
	public boolean isClassIllegal(Class newClass) {
		for (Class class1 : illegalClasses) {
			if (newClass.equals(class1)) {
				return true;
			}
		}
		return false;
	}

}
