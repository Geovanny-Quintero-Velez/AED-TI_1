package Structures;

public class DoubleNode <V> {
	
	private V value;
	private DoubleNode<V> next, previous;
	
	public DoubleNode(V value) {
		this.value = value;
		next = null;
		previous = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void addNext(V value) {
		next = new DoubleNode<V>(value);
		next.setPrevious(this);
	}
	
	public void setNext(DoubleNode<V> nodo) {
		this.next = nodo;
	}
	
	public void setPrevious(DoubleNode<V> nodo) {
		this.previous = nodo;
	}
	
	public DoubleNode<V> getNext() {
		return next;
	}
	
	public DoubleNode<V> getPrevious() {
		return previous;
	}
	
}
