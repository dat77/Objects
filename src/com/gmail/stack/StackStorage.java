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

	private Item esp;
	private int stackSize;

	public StackStorage() {
		this.esp = null;
		this.stackSize = STACK_SIZE;
	}

	public Object getEsp() {
		return esp;
	}

	public int getStackSize() {
		return stackSize;
	}

	@Override
	public void push(Object obj) throws StackSizeExceededException {
		if (stackSize == 0) {
			throw new StackSizeExceededException();
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
		}else {
			return esp.itemPointer;
		}
	}

}
