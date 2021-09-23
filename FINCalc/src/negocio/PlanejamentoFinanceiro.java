package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class PlanejamentoFinanceiro extends Carteira {
     
	public void regraFinanceira1(double valorSalario) {
		
		double Econ1 = valorSalario * 0.5; // 50% = Essenciais: transporte, alimenta��o, moradia, contas, estudos
		double Econ2 = valorSalario * 0.3; // 30% = Desejos: jantares, assinaturas de servi�os, lazer, videogame
		double Econ3 = valorSalario * 0.2; // 20% = Poupar: investimentos, emerg�ncias, objetivos
				
		BigDecimal valor1 = new BigDecimal(Econ1); 
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(valorSalario));
		System.out.println(df.format(valor1));
		System.out.println(df.format(valor2));
		System.out.println(df.format(valor3));
		
	}
	
	public void regraFinanceira2(double valorSalario) {
		
		double Econ1 = valorSalario * 0.4; // 40% = Essenciais: transporte, alimenta��o, moradia, contas, estudos
		double Econ2 = valorSalario * 0.3; // 30% = Desejos: jantares, assinaturas de servi�os, lazer, videogame
		double Econ3 = valorSalario * 0.3; // 30% = Poupar: investimentos, emerg�ncias, objetivos
		
		BigDecimal valor1 = new BigDecimal(Econ1); 
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(valorSalario));
		System.out.println(df.format(valor1));
		System.out.println(df.format(valor2));
		System.out.println(df.format(valor3));
		
	}
	
	public void regraFinanceira3(double valorSalario) {
		
		double Econ1 = valorSalario * 0.6; // 60% = Essenciais: transporte, alimenta��o, moradia, contas, estudos
		double Econ2 = valorSalario * 0.2; // 20% = Desejos: jantares, assinaturas de servi�os, lazer, videogame
		double Econ3 = valorSalario * 0.1; // 10% = Poupar: emerg�ncias, objetivos de curto prazo
		double Econ4 = valorSalario * 0.1; // 10% = Poupar: investimentos de longo e curto prazo
		
		BigDecimal valor1 = new BigDecimal(Econ1);  
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		BigDecimal valor4 = new BigDecimal(Econ4); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(valorSalario));
		System.out.println(df.format(valor1));
		System.out.println(df.format(valor2));
		System.out.println(df.format(valor3));
		System.out.println(df.format(valor4));
		
	}
	
}
