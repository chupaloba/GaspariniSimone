
public class Nodo 
{
	private AggiungiPolizza info;
	private Nodo link;
	
	public Nodo (AggiungiPolizza persona)
	{
		setInfo(persona);
		link=null;
	}

	public AggiungiPolizza getInfo() {
		return info; 
	}

	public void setInfo(AggiungiPolizza info) 
	{
		this.info = new AggiungiPolizza(info);
	}

	public Nodo getLink() {
		return link;
	}

	public void setLink(Nodo link) {
		this.link = link;
	}
}