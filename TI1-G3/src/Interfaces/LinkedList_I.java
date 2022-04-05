package Interfaces;

public interface LinkedList_I <V, K>{
	
	public abstract void add(V value, K key);
	
	public abstract void remove(K key);
	
	public abstract boolean isEmpty();
	
	public abstract int size(); 
	
	public abstract V getValue(K key); 
}
