package aplicativo;

import java.util.Scanner;

import entidade.Carteira;
import negocio.PlanejamentoFinanceiro;
import options.Investimentos;

public class AplicativoFINCalc {

	public static void main(String[] args) throws Exception {

		String menu = menuCalculadora();

		while (menu != "exit") {

			switch (menu) {
			case "plan":
				planejamentoParticao();
				;
			case "calc invest":
				calculadoraInvestimentos();
				;
			}

			menu = menuCalculadora();
		}

	}

	private static String menuCalculadora() {

		Scanner scan = new Scanner(System.in);

		String comando;

		System.out.println("APLICATIVO FINCalc");

		System.out.println("\nCOMANDOS: ");

		System.out.println("\nplan: acessa a calculadora de planejamento financeiro;");
		System.out.println("calc invest: acessa a calculadora de investimentos;");

		System.out.println("\nESCOLHA UM DOS COMANDOS LISTADOS E DIGITE-O: ");
		comando = scan.next();

		return comando;
	}

	private static void planejamentoParticao() {

		Scanner scan = new Scanner(System.in);

		Carteira carteira = new Carteira();
		PlanejamentoFinanceiro planRenda = new PlanejamentoFinanceiro();
		
		double valorRendaMensal;
		int opcao;

		System.out.println("\nCalculadora de Planejamento Finançeiro");

		System.out.println("\nDigite o valor da sua renda mensal ou salario: ");
		valorRendaMensal = scan.nextDouble();

		carteira.setValorSalario(valorRendaMensal);

		System.out.println("Escolha uma das formas de organizar a renda mensal listadas abaixo:");

		System.out.println("\n1 = 50% 30% 20%");
		System.out.println("2 = 40% 30% 30%");
		System.out.println("3 = 60% 20% 10% 10%");

		System.out.println("\nDigite o número da opção desejada: ");
		opcao = scan.nextInt();

		if (opcao == 1) {
			planRenda.regraFinanceira1(valorRendaMensal);
		}

		if (opcao == 2) {
            planRenda.regraFinanceira2(valorRendaMensal);  
		}

		if (opcao == 3) {
           planRenda.regraFinanceira3(valorRendaMensal); 
		}
	}

	private static void calculadoraInvestimentos() {
        
	}

}
