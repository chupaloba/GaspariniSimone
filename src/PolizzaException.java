public class PolizzaException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messaggio;
	
	public PolizzaException(String messaggio)
	{
		this.messaggio=messaggio;
	}
	
	public String toString()
	{
		return messaggio;
	}
	
}