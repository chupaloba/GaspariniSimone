import java.io.Serializable;

public class AggiungiPolizza 
{	
	private int codice;
	private String nome;
	private String cognome;
	private String targa;
	private int cilindrata;
	private boolean pagamento;
	private double quota=0.5;

	public double getQuota() {
		return quota;
	}

	public void setQuota(double quota2) {
		this.quota = quota2;
	}

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

	public AggiungiPolizza()
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
	
	public String CalcolaQuota(double cilindrata,double quota)      
	{
		cilindrata=cilindrata*quota;
		return ("La quota da pagare �: "+getCilindrata());
		}
	
	public class SalvaSuFile implements Serializable
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SalvaSuFile (int codice, String nome, String cognome, String targa, int cilindrata, boolean pagamento, double quota)
		{
			setCodice(codice);
			setNome(nome);
			setCognome(cognome);
			setTarga(targa);
			setCilindrata(cilindrata);
			setPagamento(pagamento);
			setQuota(quota);
		}
		
		public String toString()
		{
			return (codice+" "+nome+" "+cognome+" "+targa);
		}
	}
	}
