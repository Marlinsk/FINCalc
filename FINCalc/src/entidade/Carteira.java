package entidade;

public class Carteira {
    
	protected double valorSalario;
	
	protected double particaoSalario1;
	protected double particaoSalario2;
	protected double particaoSalario3;
	protected double particaoSalario4;
	
    protected double valorAplicado;
	protected double taxaPreFixada;
	protected double taxaPosFixada;
	protected double taxaIPCA;
	protected double rendimentoAnual;
	protected double rendimentoAtual;
	protected int prazoAno;
	
	public Carteira() {
		super();
	}

	public Carteira(double particaoSalario1, double particaoSalario2, double particaoSalario3, double particaoSalario4) {
		super();
		this.particaoSalario1 = particaoSalario1;
		this.particaoSalario2 = particaoSalario2;
		this.particaoSalario3 = particaoSalario3;
		this.particaoSalario4 = particaoSalario4;
	}
	
	public Carteira(double taxaPreFixada, double taxaPosFixada, double taxaIPCA, double rendimentoAnual, double rendimentoAtual, int prazoAno) {
		super();
		this.taxaPreFixada = taxaPreFixada;
		this.taxaPosFixada = taxaPosFixada;
		this.taxaIPCA = taxaIPCA;
		this.rendimentoAnual = rendimentoAnual;
		this.rendimentoAtual = rendimentoAtual;
		this.prazoAno = prazoAno;
	}

	public double getValorSalario() {
		return valorSalario;
	}
	
	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	
	public double getParticaoSalario1() {
		return particaoSalario1;
	}
	
	public void setParticaoSalario1(double particaoSalario1) {
		this.particaoSalario1 = particaoSalario1;
	}
	
	public double getParticaoSalario2() {
		return particaoSalario2;
	}
	
	public void setParticaoSalario2(double particaoSalario2) {
		this.particaoSalario2 = particaoSalario2;
	}
	
	public double getParticaoSalario3() {
		return particaoSalario3;
	}
	
	public void setParticaoSalario3(double particaoSalario3) {
		this.particaoSalario3 = particaoSalario3;
	}
	
	public double getParticaoSalario4() {
		return particaoSalario4;
	}
	
	public void setParticaoSalario4(double particaoSalario4) {
		this.particaoSalario4 = particaoSalario4;
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
