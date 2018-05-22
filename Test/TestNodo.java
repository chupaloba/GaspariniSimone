import static org.junit.Assert.*;

import org.junit.Test;

public class TestNodo 
{
	@Test
	public void testCostruttoreNodo() 
	{
		AggiungiPolizza p=new AggiungiPolizza();
		Nodo n=new Nodo(p);
		assertTrue("Costruttore nodo",n.getInfo().equals(p)&&n.getLink()==null);
	}
	
	@Test
	public void testSetInfo() 
	{
		AggiungiPolizza p1=new AggiungiPolizza();
		AggiungiPolizza p2=new AggiungiPolizza();
		Nodo n=new Nodo(p1);
		n.setInfo(p2);
		assertTrue("setInfo",n.getInfo().equals(p2)&&n.getLink()==null);
	}
	
	@Test
	public void testSetLink() 
	{
		AggiungiPolizza p1=new AggiungiPolizza();  
		AggiungiPolizza p2=new AggiungiPolizza();
		Nodo n1=new Nodo(p1);
		Nodo n2=new Nodo(p2);
		n1.setLink(n2);
		assertTrue("setLink",n1.getInfo().equals(p1)&&n1.getLink()==n2);
	}
}
	