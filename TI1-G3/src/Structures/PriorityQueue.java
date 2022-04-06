package Structures;

import Interfaces.PriorityQueue_I;

public class PriorityQueue<V> implements PriorityQueue_I<V> {
	
	private PriorityNode<V> node;
	
	public PriorityQueue() {
		node = null;
	}

	@Override
	public void enqueue(V value, int priority) {
		PriorityNode<V> p, q;
		boolean finded = false;
		p = node;
		while((p.getNext()!=null)&&(!finded)) {
			if(p.getNext().getPriority()<priority) {
				finded = true;
			}else {
				p = p.getNext();
			}
		}
		q = p.getNext();
		p.addNext();
		p = p.getNext();
		p.setValue(value);
		p.setPriority(priority);
		p.setNext(q);
	}

	@Override
	public V dequeue() {
		if(!(isEmpty())) {
			PriorityNode<V> temp = node;
			node = node.getNext();
			return temp.getValue();
		}
		return null;
	}

	@Override
	public V max() {
		return node.getValue();
	}

	@Override
	public boolean isEmpty() {
		if(node == null) {
			return true;
		}
		return false;
	}
	

}
