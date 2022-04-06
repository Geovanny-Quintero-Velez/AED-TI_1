package Structures;

import Interfaces.LinkedList_I;

public class DoubleLinkedList<V> implements LinkedList_I<V> {

	int size;
	DoubleNode<V> doubleNode;
	
	public DoubleLinkedList() {
		size = 0;
		doubleNode = null;
	}

	@Override
	public void add(V value) {
		if(size == 0) {
			doubleNode = new DoubleNode<V>(value);
		}
		else {
			doubleNode.addNext(value);
			doubleNode.getNext().setPrevious(doubleNode);
		}
		size++;
		doubleNode = doubleNode.getNext();
	}

	@Override
	public void remove(int position) {
		if(size>0 && 0<=position && position<=size) {
			DoubleNode<V> container = doubleNode;
			for(int i=0;i<size;i++) {
			container = container.getPrevious();
			}
			for(int i=0;i<position;i++) {
				container = container.getNext();
			}
			if(container.getNext() != null) {
				container.getNext().setPrevious(container.getPrevious());
			}
			container.getPrevious().setNext(container.getNext());
			container.setNext(null);
			container.setPrevious(null);
			size--;
		}
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public V getValue(int position) {
		if(size>0 && 0<=position && position<=size) {
			DoubleNode<V> container = doubleNode;
			for(int i=0;i<size;i++) {
			container = container.getPrevious();
			}
			for(int i=0;i<position;i++) {
				container = container.getNext();
			}
			return container.getValue();
		}
		return null;
	}

	
}
