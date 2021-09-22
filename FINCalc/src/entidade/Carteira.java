package entidade;

public class Carteira {
    
	protected double valorSalario;
	
	protected double metaDeGasto;
	protected double dinheiroEconimzado;
	protected double metaDeEconomia;
	
    protected double valorAplicado;
	protected double taxaPreFixada;
	protected double taxaPosFixada;
	protected double taxaIPCA;
	protected double rendimentoAnual;
	protected double rendimentoAtual;
	protected int prazoAno;

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public double getMetaDeGasto() {
		return metaDeGasto;
	}

	public void setMetaDeGasto(double metaDeGasto) {
		this.metaDeGasto = metaDeGasto;
	}

	public double getDinheiroEconimzado() {
		return dinheiroEconimzado;
	}

	public void setDinheiroEconimzado(double dinheiroEconimzado) {
		this.dinheiroEconimzado = dinheiroEconimzado;
	}

	public double getMetaDeEconomia() {
		return metaDeEconomia;
	}

	public void setMetaDeEconomia(double metaDeEconomia) {
		this.metaDeEconomia = metaDeEconomia;
	}

	public double getValorAplicado() {
		return valorAplicado;
	}

	public void setValorAplicado(double valorAplicado) {
		this.valorAplicado = valorAplicado;
	}

	public double getTaxaPreFixada() {
		return taxaPreFixada;
	}

	public void setTaxaPreFixada(double taxaPreFixada) {
		this.taxaPreFixada = taxaPreFixada;
	}

	public double getTaxaPosFixada() {
		return taxaPosFixada;
	}

	public void setTaxaPosFixada(double taxaPosFixada) {
		this.taxaPosFixada = taxaPosFixada;
	}

	public double getTaxaIPCA() {
		return taxaIPCA;
	}

	public void setTaxaIPCA(double taxaIPCA) {
		this.taxaIPCA = taxaIPCA;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public double getRendimentoAtual() {
		return rendimentoAtual;
	}

	public void setRendimentoAtual(double rendimentoAtual) {
		this.rendimentoAtual = rendimentoAtual;
	}

	public int getPrazoAno() {
		return prazoAno;
	}

	public void setPrazoAno(int prazoAno) {
		this.prazoAno = prazoAno;
	}
	
}
