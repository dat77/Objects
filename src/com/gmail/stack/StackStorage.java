package com.gmail.stack;

public class StackStorage implements Stack {

	private class Item {
		public Object itemPointer;
		public Object nextPointer;

		public Item(Object itemPointer, Object nextPointer) {
			this.itemPointer = itemPointer;
			this.nextPointer = nextPointer;
		}

	}

	private static StackStorage stack;
	private Item esp;
	private int stackSize;
	private Blacklist blacklist;

	private StackStorage() {
		this.esp = null;
		this.stackSize = STACK_SIZE;
		blacklist = new IllegalList();
	}

	public static StackStorage getStackStorage() {
		if (stack == null) {
			stack = new StackStorage();
		}
		return stack;
	}

	public Stack getStack() {
		return stack;
	}

	public Object getEsp() {
		return esp;
	}

	public int getStackSize() {
		return stackSize;
	}

	public Blacklist getBlacklist() {
		return blacklist;
	}

	@Override
	public void push(Object obj) {
		if (stackSize == 0) {
			throw new StackSizeExceededException();
		}
		
		if (blacklist.isClassIllegal(obj.getClass())) {
			throw new IllegalObjectException();
		}

		Item item = new Item(obj, esp);
		esp = item;
		stackSize--;

	}

	@Override
	public Object pop() {
		if (stackSize == STACK_SIZE) {
			return null;
		}
		Object obj = esp.itemPointer;
		esp = (Item) esp.nextPointer;
		stackSize++;
		return obj;
	}

	@Override
	public Object peek() {
		if (stackSize == STACK_SIZE) {
			return null;
		} else {
			return esp.itemPointer;
		}
	}

}
