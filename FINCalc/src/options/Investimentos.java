package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class Investimentos extends Carteira {

	protected double totalDinheiroInvestido;
	protected double valorAplicado;
	
	protected double taxaPreFixada;
	protected double taxaPosFixada;
	protected double taxaIPCA;
	
	protected double valorAnualPorcentagem;
	
	protected int prazoAno;
	
	public static void calcularRentabilidadecomTaxaPreFixada(double valorAplicado, double taxaPreFixada, int prazoAno) {
        
		double variavelaux1 = (1 + taxaPreFixada / 100);
		int variavelaux2 = prazoAno;
		double formula = Math.pow(variavelaux1, variavelaux2);
		
		BigDecimal valorfuturo = new BigDecimal( valorAplicado * formula);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(valorfuturo));
	}

    public static void calcularRentabilidadecomTaxaPosFixada(double valorAplicado, double valorAnualPorcentagem, double taxaPosFixada, int prazoAno) {
    	
    	double variavelaux1 = ( 1 + (taxaPosFixada / 100) * (valorAnualPorcentagem/100));
    	int variavelaux2 = prazoAno;
    	double formula = Math.pow(variavelaux1, variavelaux2);
    	
    	BigDecimal valorFututo = new BigDecimal(valorAplicado * formula);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println(df.format(valorFututo));
	}
	
    public static void calcularRentabilidadecomTaxaIPCA(double valorAplicado, double valorAnualPorcentagem, double taxaIPCA, int prazoAno) {
    	
    	double variavelaux1 = ( 1 + (taxaIPCA / 100) * (valorAnualPorcentagem/100));
    	int variavelaux2 = prazoAno;
    	double formula = Math.pow(variavelaux1, variavelaux2);
    	
    	BigDecimal valorfututo = new BigDecimal(valorAplicado * formula);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println(df.format(valorfututo));
    }
	
    public static void rentabilidadeAcumulada(double valorAplicado, double valorAtual) {
    	
    	BigDecimal rentabilidade = new BigDecimal(((valorAtual / valorAplicado) - 1) * 100);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println(df.format(rentabilidade));
    }
    
    ////////////////////// * GETTERS AND SETTER * //////////////////////

	public double getTotalDinheiroInvestido() {
		return totalDinheiroInvestido;
	}

	public void setTotalDinheiroInvestido(double totalDinheiroInvestido) {
		this.totalDinheiroInvestido = totalDinheiroInvestido;
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
		return valorAnualPorcentagem;
	}

	public void setValorAnualPorcentagem(double valorAnualPorcentagem) {
		this.valorAnualPorcentagem = valorAnualPorcentagem;
	}

	public int getPrazoAno() {
		return prazoAno;
	}

	public void setPrazoAno(int prazoAno) {
		this.prazoAno = prazoAno;
	}
    
}
