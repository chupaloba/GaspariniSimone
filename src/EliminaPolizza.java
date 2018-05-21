public class EliminaPolizza
{

	private Nodo head;
	private int elementi;
	
	public EliminaPolizza()
	{
		head=null;
		elementi=0;
	}
	
	public int getElementi()
	{
		return elementi;
	}
	
	private Nodo creaNodo(AggiungiPolizza polizza, Nodo link)
	{
		Nodo nodo=new Nodo(polizza);
		nodo.setLink(link);
		return nodo;
	}
	
	private Nodo getLinkPosizione(int posizione) throws PolizzaException
	{
		
		if (elementi==0)
			throw new PolizzaException("Lista vuota");
		if (posizione<=0 || posizione>elementi)
			throw new PolizzaException("Posizione non valida");
		
		Nodo p=head;
		int n=1;
		while(p.getLink()!=null && n<posizione)
		{
			p=p.getLink();
			n++;
		}
		return p;
	}
	
	public String toString()
	{
		String risultato="Head";
		if (elementi==0)
			return risultato;
		Nodo p=head;
		while(p!=null)
		{
			risultato+="-->"+p.getInfo().getNome();
			p=p.getLink();
		}
		return risultato;
	}
	
	public void inserisciInTesta(AggiungiPolizza polizza)
	{
		Nodo p=creaNodo(polizza, head);
		head=p;
		elementi++;
	}
	
	public void inserisciInCoda(AggiungiPolizza polizza) throws PolizzaException
	{
		if(elementi==0)
		{
			inserisciInTesta(polizza);
			return;
		}
		
		Nodo pn=creaNodo(polizza, null);
		Nodo p=getLinkPosizione(elementi);
		p.setLink(pn);
		elementi++;
	}
	
	void inserisciInPosizione(AggiungiPolizza polizza, int posizione) throws PolizzaException
	{	
		if(posizione==1)
		{
			inserisciInTesta(polizza);
			return;
		}
		if (posizione<=0 || posizione>elementi+1)
			throw new PolizzaException("Posizione non valida");
		
		if (posizione==elementi+1)
		{
			inserisciInCoda(polizza);
			return;
		}
		
		Nodo pn=creaNodo(polizza, getLinkPosizione(posizione));
		Nodo precedente=getLinkPosizione(posizione-1);
		precedente.setLink(pn);
		elementi++;	
	}
	
	public void eliminaInTesta() throws PolizzaException
	{
		if (elementi==0)
			throw new PolizzaException("Lista vuota");	
		head=head.getLink();
		elementi--;
	}
	
	public void eliminaInCoda() throws PolizzaException
	{
		if (elementi==0)
			throw new PolizzaException("Lista vuota");
		if(elementi==1)
		{
			eliminaInTesta();
			return;
		}
		
		Nodo penultimo=getLinkPosizione(elementi-1);
		penultimo.setLink(null);
		elementi--;
	}
	
	public void eliminaInPosizione(int posizione) throws PolizzaException
	{
		if (elementi==0)
			throw new PolizzaException("Lista vuota");
		if (posizione<=0 || posizione>elementi)
			throw new PolizzaException("Posizione non valida");
		
		if (posizione==1)
		{
			eliminaInTesta();
			return;
		}
		
		if (posizione==elementi)
		{
			eliminaInCoda();
			return;
		}
		Nodo p=getLinkPosizione(posizione);
		Nodo precedente=getLinkPosizione(posizione-1);
		precedente.setLink(p.getLink());
		elementi--;
	}

	
	public AggiungiPolizza getInfo(int posizione) throws PolizzaException
	{
		if (elementi==0)
			throw new PolizzaException("Lista vuota");
		if (posizione<=0 || posizione>elementi)
			throw new PolizzaException("Posizione non valida");
		
		
		Nodo p=getLinkPosizione(posizione);
		AggiungiPolizza i=new AggiungiPolizza(p.getInfo());
		return (i);
	}
}