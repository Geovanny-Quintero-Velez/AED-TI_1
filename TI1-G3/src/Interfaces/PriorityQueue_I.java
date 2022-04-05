package Interfaces;

public interface PriorityQueue_I <V, K> {
	
	public abstract void enqueue(V value, K key);
	
	public abstract V dequeue();
	
	public abstract V max();
	
	public abstract boolean isEmpty();  
}
