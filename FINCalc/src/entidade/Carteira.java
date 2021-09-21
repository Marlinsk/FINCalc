package entidade;

public class Carteira {
    
	protected double saldoConta;
	protected double valorSalario;
	
	protected double totalDinheiroGasto;
	protected double metaDeGasto;
	
	protected double dinheiroEco;
	protected double economiaTotalAno;
	
	protected double saldoMetaMes;
	protected double saldoMetaAno;
	protected double saldoMetaLongoPrazo;
	
    protected double valorAplicado;
	protected double taxaPreFixada;
	protected double taxaPosFixada;
	protected double taxaIPCA;
	protected double rendimentoAnual;
	protected int prazoAno;
	
	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public double getTotalDinheiroGasto() {
		return totalDinheiroGasto;
	}

	public void setTotalDinheiroGasto(double totalDinheiroGasto) {
		this.totalDinheiroGasto = totalDinheiroGasto;
	}

	public double getMetaDeGasto() {
		return metaDeGasto;
	}

	public void setMetaDeGasto(double metaDeGasto) {
		this.metaDeGasto = metaDeGasto;
	}

	public double getSaldoMetaMes() {
		return saldoMetaMes;
	}

	public void setSaldoMetaMes(double saldoMetaMes) {
		this.saldoMetaMes = saldoMetaMes;
	}

	public double getSaldoMetaAno() {
		return saldoMetaAno;
	}

	public void setSaldoMetaAno(double saldoMetaAno) {
		this.saldoMetaAno = saldoMetaAno;
	}

	public double getSaldoMetaLongoPrazo() {
		return saldoMetaLongoPrazo;
	}

	public void setSaldoMetaLongoPrazo(double saldoMetaLongoPrazo) {
		this.saldoMetaLongoPrazo = saldoMetaLongoPrazo;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
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

	public double getValorAnualPorcentagem() {
		return rendimentoAnual;
	}

	public void setValorAnualPorcentagem(double valorAnualPorcentagem) {
		this.rendimentoAnual = valorAnualPorcentagem;
	}

	public int getPrazoAno() {
		return prazoAno;
	}

	public void setPrazoAno(int prazoAno) {
		this.prazoAno = prazoAno;
	}

	public double getDinheiroEco() {
		return dinheiroEco;
	}

	public void setDinheiroEco(double dinheiroEco) {
		this.dinheiroEco = dinheiroEco;
	}

}
