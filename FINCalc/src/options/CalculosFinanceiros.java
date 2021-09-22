package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class CalculosFinanceiros extends Carteira {

	public static void calculoDeGastoSimples(double metaDeGasto, int meses) {
		 
		BigDecimal totalDinheiroGasto = new BigDecimal(Math.pow(metaDeGasto, meses));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(totalDinheiroGasto));

	}
	
	public static void calculoDeEcoSimples(double dinheiroEconimzado, int meses) {
		
		BigDecimal economiaTotalAno = new BigDecimal(Math.pow(dinheiroEconimzado, meses));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(economiaTotalAno));
	}
	
	public static void calculoFinanceiro(double valorSalario, double dinheiroEconimzado, double metaDeGasto, int mes) {
		
		BigDecimal sobra = new BigDecimal(valorSalario - (dinheiroEconimzado + metaDeGasto));
		BigDecimal quantidadeMeses = new BigDecimal(mes);
		BigDecimal acumulo = sobra.multiply(quantidadeMeses);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(sobra));
		System.out.println(df.format(acumulo));
		
	}
	
	public static void calculoDeMetas(double metaDeEconomia, int anos) {
		
		int calc1 = anos * 12;
		BigDecimal calc2 = new BigDecimal(metaDeEconomia * calc1);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(calc2));
		
	}
	
}
