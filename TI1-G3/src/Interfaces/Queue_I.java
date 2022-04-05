package Interfaces;

public interface Queue_I<V,K> {

	public abstract void enqueue(V value, K key);
	
	public abstract V dequeue();
	
	public abstract V front();
	
	public abstract boolean isEmpty();  
	
}
