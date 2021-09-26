package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Investimentos {

	public void calcularRentabilidadecomTaxaPreFixada(double taxaPreFixada, int prazoAno, double valorAplicado) {
		
		double variavelaux1 = (1 + taxaPreFixada / 100);
		int variavelaux2 = prazoAno;
		double formula = Math.pow(variavelaux1, variavelaux2);
		
		BigDecimal valorfuturo = new BigDecimal( valorAplicado * formula);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println("\nR$ " + df.format(valorfuturo));
		
	}
     
    public void calcularRentabilidadecomTaxaPosFixada(double taxaPosFixada, double rendimentoAplicacao, int prazoAno, double valorAplicado) {
    	
    	double variavelaux1 = ( 1 + (taxaPosFixada / 100) * (rendimentoAplicacao/100));
    	int variavelaux2 = prazoAno;
    	double formula = Math.pow(variavelaux1, variavelaux2);
    	
    	BigDecimal valorFututo = new BigDecimal(valorAplicado * formula);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println("\nR$" + df.format(valorFututo));
	}
    
    public void calcularRentabilidadecomTaxaIPCA(double taxaIPCA, double rendimentoAplicacao, int prazoAno, double valorAplicado) {
    	
    	double variavelaux1 = ( 1 + (taxaIPCA / 100) * (rendimentoAplicacao/100));
    	int variavelaux2 = prazoAno;
    	double formula = Math.pow(variavelaux1, variavelaux2);
    	
    	BigDecimal valorfututo3 = new BigDecimal(valorAplicado * formula);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println("\nR$" + df.format(valorfututo3));
    
    }
	
    public void rentabilidadeAcumulada(double valorAplicado, double valorAtual) {
    	
    	BigDecimal rentabilidadeAtual = new BigDecimal(((valorAtual / valorAplicado) - 1) * 100);
    	
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
			
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
    	System.out.println("\nR$" + df.format(rentabilidadeAtual));
        
    }

}
