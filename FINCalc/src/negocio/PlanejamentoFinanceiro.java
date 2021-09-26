package negocio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import entidade.Carteira;
import negocio.PlanejamentoFinanceiro;

public class PlanejamentoFinanceiro extends Carteira {
    
	public void regraFinanceira1(double valorSalario) {
		
		double Econ1 = valorSalario * 0.5; // 50% = Essenciais: transporte, alimentação, moradia, contas, estudos
		double Econ2 = valorSalario * 0.3; // 30% = Desejos: jantares, assinaturas de serviços, lazer, videogame
		double Econ3 = valorSalario * 0.2; // 20% = Poupar: investimentos, emergências, objetivos
		
		setParticaoSalario1(Econ1);
		setParticaoSalario2(Econ2);
		setParticaoSalario3(Econ3);
		
		BigDecimal valor1 = new BigDecimal(Econ1); 
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println("\n" + "Sua renda mensal de " + "R$ " + df.format(valorSalario) + " foi organizada em:");
		System.out.println("R$ " + df.format(valor1) + " para essenciais;");
		System.out.println("R$ " + df.format(valor2) + " para desejos de consumo;");
		System.out.println("R$ " + df.format(valor3) + " para reserva de emergência + investimentos;");
		
		calculoTotalAcumulado1(Econ1, Econ2, Econ3);
		
	}
	
	public void regraFinanceira2(double valorSalario) {
		
		double Econ1 = valorSalario * 0.4; // 40% = Essenciais: transporte, alimentação, moradia, contas, estudos
		double Econ2 = valorSalario * 0.3; // 30% = Desejos: jantares, assinaturas de serviços, lazer, videogame
		double Econ3 = valorSalario * 0.3; // 30% = Poupar: investimentos, emergências, objetivos
		
		setParticaoSalario1(Econ1);
		setParticaoSalario2(Econ2);
		setParticaoSalario3(Econ3);
		
		BigDecimal valor1 = new BigDecimal(Econ1); 
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println("\n" + "Sua renda mensal de " + "R$ " + df.format(valorSalario) + " foi organizada em:");
		System.out.println("R$ " + df.format(valor1) + " para essenciais;");
		System.out.println("R$ " + df.format(valor2) + " para desejos de consumo;");
		System.out.println("R$ " + df.format(valor3) + " para reserva de emergência + investimentos;");
		
		calculoTotalAcumulado1(Econ1, Econ2, Econ3);
		
	}
	
	public void regraFinanceira3(double valorSalario) {
		
		double Econ1 = valorSalario * 0.6; // 60% = Essenciais: transporte, alimentação, moradia, contas, estudos
		double Econ2 = valorSalario * 0.2; // 20% = Desejos: jantares, assinaturas de serviços, lazer, videogame
		double Econ3 = valorSalario * 0.1; // 10% = Poupar: emergências, objetivos de curto prazo
		double Econ4 = valorSalario * 0.1; // 10% = Poupar: investimentos de longo e curto prazo
		
		setParticaoSalario1(Econ1);
		setParticaoSalario2(Econ2);
		setParticaoSalario3(Econ3);
		setParticaoSalario4(Econ4);
		
		BigDecimal valor1 = new BigDecimal(Econ1);  
		BigDecimal valor2 = new BigDecimal(Econ2); 
		BigDecimal valor3 = new BigDecimal(Econ3); 
		BigDecimal valor4 = new BigDecimal(Econ4); 
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padraoBR = "###,###.##";
		DecimalFormat df = new DecimalFormat(padraoBR, dfs);
		System.out.println("\n" + "Sua renda mensal de " + "R$ " + df.format(valorSalario) + " foi organizada em:");
		System.out.println("R$ " + df.format(valor1) + " para essenciais;");
		System.out.println("R$ " + df.format(valor2) + " para desejos de consumo;");
		System.out.println("R$ " + df.format(valor3) + " para reserva de emergência;");
		System.out.println("R$ " + df.format(valor4) + " para investimentos;"); 
		
		calculoTotalAcumulado2(Econ1, Econ2, Econ3, Econ4);
		
	}
	
    public void calculoTotalAcumulado1(double Econ1, double Econ2, double Econ3) {
		
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
		System.out.println("\n" + "Por ano você tem um acumulo de: ");
		System.out.println("R$ " + df.format(renda1) + " para essenciais;");
		System.out.println("R$ " + df.format(renda2) + " para desejos de consumo;");
		System.out.println("R$ " + df.format(renda3) + " para reserva de emergência + investimentos;");
		
	}
	
	public void calculoTotalAcumulado2(double Econ1, double Econ2, double Econ3, double Econ4) {
		
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
		System.out.println("\n" + "Por ano você tem um acumulo de: ");
		System.out.println("R$" + df.format(renda1) + " para essenciais;"); 
		System.out.println("R$" + df.format(renda2) + " para desejos de consumo;");
		System.out.println("R$" + df.format(renda3) + " para reserva de emergência;");
		System.out.println("R$" + df.format(renda4) + " para investimentos;");
		
	}
	
}
