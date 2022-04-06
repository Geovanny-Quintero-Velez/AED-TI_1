package Interfaces;

public interface PriorityQueue_I <V>{
	
	public abstract void enqueue(V value, int priority);
	
	public abstract V dequeue();
	
	public abstract V max();
	
	public abstract boolean isEmpty();  
}
