package Interfaces;

public interface Queue_I<V> {

	public abstract void enqueue(V value);
	
	public abstract V dequeue();
	
	public abstract V front();
	
	public abstract boolean isEmpty();  
	
}
