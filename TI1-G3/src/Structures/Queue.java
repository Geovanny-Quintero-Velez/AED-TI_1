package Structures;

import Interfaces.Queue_I;

public class Queue<V> implements Queue_I<V> {

	Node<V> front, back;
	public Queue() {
		front = null;
		back = null;
	}
	
	@Override
	public void enqueue(V value) {
		Node<V> node = new Node<V>(value);
		if(isEmpty()) {
			front = node;
		} else {
			back.setNext(node);;
		}
		back = node;
	}

	@Override
	public V dequeue() {
		if(!(isEmpty())) {
			Node<V> eliminated = front;
			front = front.getNext();
			eliminated.setNext(null);
			return eliminated.getValue();
		}
		return null;
	}

	@Override
	public V front() {
		if(!(isEmpty())) {
			return front.getValue();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(front == null && back == null) {
			return true;
		}
		return false;
	}

}
