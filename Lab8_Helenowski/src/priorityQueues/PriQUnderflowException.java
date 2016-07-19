package priorityQueues;

class PriQUnderflowException extends RuntimeException
{
  /**
	 * 
	 */
	private static final long serialVersionUID = -2501230652825649397L;

public PriQUnderflowException()
  {
    super();
  }

  public PriQUnderflowException(String message)
  {
    super(message);
  }
}