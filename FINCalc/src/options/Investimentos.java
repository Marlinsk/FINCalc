package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class Investimentos extends Carteira {
     
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
     
    public static void calcularRentabilidadecomTaxaPosFixada(double valorAplicado, double rendimentoAnual, double taxaPosFixada, int prazoAno) {
    	
    	double variavelaux1 = ( 1 + (taxaPosFixada / 100) * (rendimentoAnual/100));
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
    
    public static void calcularRentabilidadecomTaxaIPCA(double valorAplicado, double rendimentoAnual, double taxaIPCA, int prazoAno) {
    	
    	double variavelaux1 = ( 1 + (taxaIPCA / 100) * (rendimentoAnual/100));
    	int variavelaux2 = prazoAno;
    	double formula = Math.pow(variavelaux1, variavelaux2);
    	
    	BigDecimal valorfututo3 = new BigDecimal(valorAplicado * formula);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println(df.format(valorfututo3));
    
    }
	
    public void rentabilidadeAcumulada(double valorAplicado, double valorAtual) {
    	
    	BigDecimal rentabilidadeAtual = new BigDecimal(((valorAtual / valorAplicado) - 1) * 100);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
			
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println(df.format(rentabilidadeAtual));
        
    }

}
