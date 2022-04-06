package Structures;

public class PriorityNode<V> {
	
	private int priority;
	private V value;
	private PriorityNode<V> next;

	public PriorityNode(V value) {
		this.value = value;
		priority =0;
	}
	
	public PriorityNode() {
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public PriorityNode<V> getNext() {
		return next;
	}

	public void addNext(V value) {
		this.next = new PriorityNode<V>(value);
	}
	
	public void addNext() {
		this.next = new PriorityNode<V>();
	}
	
	public void setNext(PriorityNode<V> node) {
		this.next = node;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
}
