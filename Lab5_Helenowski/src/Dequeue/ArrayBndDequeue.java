package Dequeue;

public class ArrayBndDequeue<T> implements BoundedDequeueInterface<T> {

	private T[] dequeue;
	private int maxSize;
	private int currSize = 0;
	
	@SuppressWarnings("unchecked")
	public ArrayBndDequeue(){
		maxSize = 100;
		dequeue = (T[]) new Object[maxSize];
	}
	
	@SuppressWarnings("unchecked")
	public ArrayBndDequeue(int maxSize){
		this.maxSize = maxSize;
		dequeue = (T[]) new Object[maxSize];
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (currSize == 0);
	}

	@Override
	public T dequeue() throws DequeueUnderFlowException {
		// TODO Auto-generated method stub
		if (isEmpty()){
			throw new DequeueUnderFlowException("Attempted to dequeue on empty dequeue");
		}
		else{
			
		T front = dequeue[0];
		for (int i = 1; i < currSize; i++){
			dequeue[i-1] = dequeue[i];
		}
		dequeue[currSize] = null;
		currSize--;
		return front;
		
		}
	}

	@Override
	public T removeRear() throws DequeueUnderFlowException {
		// TODO Auto-generated method stub
		if (isEmpty()){
			throw new DequeueUnderFlowException("Attempted to removeRear on empty dequeue");
		}
		else{
			T rear = dequeue[currSize-1];
			dequeue[currSize-1] = null;
			currSize--;
			return rear;
		}
	}

	@Override
	public void enqueue(T toBeAdded) throws DequeueOverFlowException {
		if (isFull()){
			throw new DequeueOverFlowException("Attempted to enqueue a full dequeue");
		}
		else{
			dequeue[currSize] = toBeAdded;
			currSize++;
		}
	}

	@Override
	public void addFront(T toBeAdded) throws DequeueOverFlowException {
		// TODO Auto-generated method stub
		if (isFull()){
			throw new DequeueOverFlowException("Attempted to enqueue a full dequeue");
		}
		else{
			for (int i = currSize; i > 0; i--){
				dequeue[i] = dequeue[i-1];
			}
			currSize++;
			dequeue[0] = toBeAdded;
		}
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return currSize == maxSize;
	}

	@Override
	public String toString(){
		String toBeReturned = "";
		if (!isEmpty()){
		for (int i = 1; i <= currSize; i++){
			toBeReturned += (i)+": "+dequeue[i-1]+"\n";
		}
		}
		else{
			toBeReturned = "Empty";
		}
		return toBeReturned;
	}
}
