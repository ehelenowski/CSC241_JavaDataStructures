package Dequeue;

public class DequeueOverFlowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9049529870363891670L;
	
	public DequeueOverFlowException(){
		super();
	}
	
	public DequeueOverFlowException(String message){
		super(message);
	}
	
}
