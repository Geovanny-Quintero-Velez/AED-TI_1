package Structures;

public class Node<V> {

	private V value;
	private Node<V> next;
	
	public Node(V value) {
		this.value = value;
		next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<V> getNext() {
		return next;
	}

	public void addNext(V value) {
		this.next = new Node<V>(value);
	}
	
	public void setNext(Node<V> node) {
		this.next = node;
	}
	
}
