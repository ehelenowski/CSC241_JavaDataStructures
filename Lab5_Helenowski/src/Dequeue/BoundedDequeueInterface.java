package Dequeue;

public interface BoundedDequeueInterface<T> extends DequeueInterface<T> {
	void enqueue(T toBeAdded) throws DequeueOverFlowException;
	void addFront(T toBeAdded) throws DequeueOverFlowException;
	boolean isFull();
	String toString();
}
