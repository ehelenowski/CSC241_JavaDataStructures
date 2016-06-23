package ch03.stacks;

public class StackOverflowException extends RuntimeException
{
  /**
	 * 
	 */
	private static final long serialVersionUID = -6324997654055759685L;

public StackOverflowException()
  {
    super();
  }

  public StackOverflowException(String message)
  {
    super(message);
  }
}