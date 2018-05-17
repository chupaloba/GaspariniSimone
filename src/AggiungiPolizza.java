public class AggiungiPolizza 
{	
	private int codice;
	private String nome;
	private String cognome;
	private String targa;
	private int cilindrata;
	private boolean pagamento;

	public int getCodice() {
	return codice;
}

public void setCodice(int codice) {
	this.codice = codice;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getTarga() {
	return targa;
}

public void setTarga(String targa) {
	this.targa = targa;
}

public int getCilindrata() {
	return cilindrata;
}

public void setCilindrata(int cilindrata) {
	this.cilindrata = cilindrata;
}

public boolean isPagamento() {
	return pagamento;
}

public void setPagamento(boolean pagamento) {
	this.pagamento = pagamento;
}

	public AggiungiPolizza(int codice, String nome, String cognome, int cilindrata, boolean pagamento)
	{
		setCodice(codice);
		setNome(nome);
		setCognome(cognome);
		setTarga(targa);
		setCilindrata(cilindrata);
		setPagamento(pagamento);
	}
	
	public AggiungiPolizza(AggiungiPolizza info)
	{
		setCodice(info.getCodice());
		setNome(info.getNome());
		setCognome(info.getCognome());
		setTarga(info.getTarga());
		setCilindrata(info.getCilindrata());
		setPagamento(info.isPagamento());
	}

	public String toString()
	{
		return (getCodice()+" "+getNome()+" "+getCognome()+" "+getTarga()+" "+getCilindrata()+" "+isPagamento());
	}
}