package Dequeue;

public interface DequeueInterface<T> {
	boolean isEmpty();
	T dequeue() throws DequeueUnderFlowException;
	T removeRear() throws DequeueUnderFlowException;
}
