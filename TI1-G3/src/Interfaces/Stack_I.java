package Interfaces;

public interface Stack_I <V>{

	public abstract void push(V value);
	
	public abstract V pop();
	
	public abstract V top();
	
	public abstract boolean isEmpty();
}
