package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class PlanejamentoFinanceiro extends Carteira {
     
	public void regraFinanceira1(double valorSalario) {
		
		BigDecimal valor1 = new BigDecimal(valorSalario * 0.5); // 50% = Essenciais: transporte, alimentação, moradia, contas, estudos
		BigDecimal valor2 = new BigDecimal(valorSalario * 0.3); // 30% = Desejos: jantares, assinaturas de serviços, lazer, videogame
		BigDecimal valor3 = new BigDecimal(valorSalario * 0.2); // 20% = Poupar: investimentos, emergências, objetivos
		
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
		
		BigDecimal valor1 = new BigDecimal(valorSalario * 0.4); // 40% = Essenciais: transporte, alimentação, moradia, contas, estudos
		BigDecimal valor2 = new BigDecimal(valorSalario * 0.3); // 30% = Desejos: jantares, assinaturas de serviços, lazer, videogame
		BigDecimal valor3 = new BigDecimal(valorSalario * 0.3); // 30% = Poupar: investimentos, emergências, objetivos
		
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
		
		BigDecimal valor1 = new BigDecimal(valorSalario * 0.6); // 60% = Essenciais: transporte, alimentação, moradia, contas, estudos; 
		BigDecimal valor2 = new BigDecimal(valorSalario * 0.2); // 20% = Desejos: jantares, assinaturas de serviços, lazer, videogame;
		BigDecimal valor3 = new BigDecimal(valorSalario * 0.1); // 10% = Poupar: emergências, objetivos de curto prazo;
		BigDecimal valor4 = new BigDecimal(valorSalario * 0.1); // 10% = Poupar: investimentos de longo e curto prazo;
		
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
