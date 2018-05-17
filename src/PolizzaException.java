public class PolizzaException extends Exception 
{

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