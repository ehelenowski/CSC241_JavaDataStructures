package Dequeue;

public class DequeueUnderFlowException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -419326228298597772L;

	public DequeueUnderFlowException(){
		super();
	}
	
	public DequeueUnderFlowException(String message){
		super(message);
	}

}
