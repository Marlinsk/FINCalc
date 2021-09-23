package options;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;

public class CalculosFinanceiros extends Carteira {
    
	public static void calculoTotalAcumulado1(double Econ1, double Econ2, double Econ3) {
		
		double acumulado1 = Econ1 * 12;
		double acumulado2 = Econ2 * 12;
		double acumulado3 = Econ3 * 12;
		
		BigDecimal renda1 = new BigDecimal(acumulado1);
		BigDecimal renda2 = new BigDecimal(acumulado2);
		BigDecimal renda3 = new BigDecimal(acumulado3);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(renda1));
		System.out.println(df.format(renda2));
		System.out.println(df.format(renda3));
		
	}
	
	public static void calculoTotalAcumulado2(double Econ1, double Econ2, double Econ3, double Econ4) {
		
		double acumulado1 = Econ1 * 12;
		double acumulado2 = Econ2 * 12;
		double acumulado3 = Econ3 * 12;
		double acumulado4 = Econ4 * 12;
		
		BigDecimal renda1 = new BigDecimal(acumulado1);
		BigDecimal renda2 = new BigDecimal(acumulado2);
		BigDecimal renda3 = new BigDecimal(acumulado3);
		BigDecimal renda4 = new BigDecimal(acumulado4);
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println(df.format(renda1));
		System.out.println(df.format(renda2));
		System.out.println(df.format(renda3));
		System.out.println(df.format(renda4));
		
	}	
}
