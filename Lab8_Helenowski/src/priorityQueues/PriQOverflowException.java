package priorityQueues;

class PriQOverflowException extends RuntimeException
{
  /**
	 * 
	 */
	private static final long serialVersionUID = -4741387906684098225L;

public PriQOverflowException()
  {
    super();
  }

  public PriQOverflowException(String message)
  {
    super(message);
  }
}