package Structures;

import Interfaces.Stack_I;

public class Stack<V> implements Stack_I<V> {
	
	private Node<V> top;
	
	public Stack() {
		top = null;
	}

	@Override
	public void push(V value) {
		Node<V> toAdd = new Node<>(value);
		if(isEmpty()) {
			top = toAdd;
		}else {
			toAdd.setNext(top);
			top = toAdd;
		}
	}

	@Override
	public V pop() {
		Node<V> temp = top;
		top = top.getNext();
		return temp.getValue();
	}

	@Override
	public V top() {
		return top.getValue();
	}

	@Override
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}

	
}
