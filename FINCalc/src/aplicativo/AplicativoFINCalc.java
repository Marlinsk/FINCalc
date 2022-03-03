package aplicativo;

import java.util.Scanner;

import entidade.Carteira;
import negocio.PlanejamentoFinanceiro;
import options.CalculadoraRentabilidade;

public class AplicativoFINCalc {

	public static void main(String[] args) {

		String menu = menuCalculadora();

		while (menu != "exit") {

			switch (menu) {
			case "plan":
				planejamentoParticao();
				;
			case "calcinvest":
				calculadoraInvestimentos();
				;
			}

			menu = menuCalculadora();
		}

	}

	private static String menuCalculadora() {

		Scanner scan = new Scanner(System.in);

		String comando;

		System.out.println("\n" + "----------------------------------------------------------");

		System.out.println("\nAPLICATIVO FINCalc");

		System.out.println("\nCOMANDOS: ");

		System.out.println("\nplan: acessa a calculadora de planejamento financeiro;");
		System.out.println("calcinvest: acessa a calculadora de investimentos;");

		System.out.println("\nESCOLHA UM DOS COMANDOS LISTADOS E DIGITE-O: ");
		comando = scan.next();

		System.out.println("\n" + "----------------------------------------------------------");

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

		System.out.println("\n1 = 50% / 30% / 20% ;");
		System.out.println("2 = 40% / 30% / 30% ;");
		System.out.println("3 = 60% / 20% / 10% / 10% ;");

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

		Scanner scan = new Scanner(System.in);
		
		CalculadoraRentabilidade inv = new CalculadoraRentabilidade();

		double valorInvestido;
		double taxaPreFixada;
		double taxaPosFixada;
		double taxaIPCA;
		double rendimentoAplicacao;
		double rendimentoAtual;
		int prazoAno;

		int opcao;

		System.out.println("\nCalcule aqui a rentabilidade das suas ações");

		System.out.println("\nEscolha o tipo de investimento: ");
		System.out.println("\n1 - Investimento com Taxa Pre-fixada;");
		System.out.println("2 - Investimento com Taxa Pós-fixada;");
		System.out.println("3 - Investimento com Taxa IPCA ;");
		System.out.println("4 - Calcular rentabilidade atual de um investimento");

		System.out.println("\nDigite o número da opção desejada: ");
		opcao = scan.nextInt();

		if (opcao == 1) {

			System.out.println("\nDigite a porcentagem da taxa de rendimento pré-fixado da aplicação:");

			System.out.println("(*Observação: Não é necessário escrever a procentagem com o símbolo % e o valor divido por 100)");
			taxaPreFixada = scan.nextDouble();

			System.out.println("\nDigite o prazo em anos:");
			prazoAno = scan.nextInt();

			System.out.println("\nDigite o valor investido nesta aplicação:");
			valorInvestido = scan.nextDouble();

			System.out.println("\nNo final do prazo, você terá em caixa");
			inv.calcularRentabilidadecomTaxaPreFixada(taxaPreFixada, prazoAno, valorInvestido);

		}

		if (opcao == 2) {
            
			System.out.println("\nDigite a porcentagem da taxa de rendimento pós-fixada da aplicação");
			
			System.out.println("(*Observação: Não é necessário escrever a procentagem com o símbolo % e o valor divido por 100):");
			taxaPosFixada = scan.nextDouble();
			
			System.out.println("\nDigite a porcentagem de rendimento anual da aplicação");
			
			System.out.println("(*Observação: Não é necessário escrever a procentagem com o símbolo % e o valor divido por 100):");
			rendimentoAplicacao = scan.nextDouble();
			
			System.out.println("\nDigite o prazo em anos:");
			prazoAno = scan.nextInt();
			
			System.out.println("\nDigite o valor investido nesta aplicação:");
			valorInvestido = scan.nextDouble();
			
			System.out.println("\nNo final do prazo, você terá em caixa");
			inv.calcularRentabilidadecomTaxaPosFixada(taxaPosFixada, rendimentoAplicacao, prazoAno, valorInvestido);
			
		}

		if (opcao == 3) {
           
			System.out.println("\nDigite a porcentagem da taxa de rendimento IPCA da aplicação");
			
			System.out.println("(*Observação: Não é necessário escrever a procentagem com o símbolo % e o valor divido por 100):");
			taxaIPCA = scan.nextDouble();
			
			System.out.println("\nDigite a porcentagem de rendimento anual da aplicação");
			
			System.out.println("(*Observação: Não é necessário escrever a procentagem com o símbolo % e o valor divido por 100):");
			rendimentoAplicacao = scan.nextDouble();
			
			System.out.println("\nDigite o prazo em anos:");
			prazoAno = scan.nextInt();
			
			System.out.println("\nDigite o valor investido nesta aplicação:");
			valorInvestido = scan.nextDouble();
			
			System.out.println("\nNo final do prazo, você terá em caixa");
			inv.calcularRentabilidadecomTaxaIPCA(taxaIPCA, rendimentoAplicacao, prazoAno, valorInvestido);
			
		}
		
		if (opcao == 4) {
            
			System.out.println("\nDigite o valor aplicado:");
			valorInvestido = scan.nextDouble();
			
			System.out.println("\nDigite o valor de rendimento atual na aplicação:");
			rendimentoAtual = scan.nextDouble();
			
			System.out.println("\nSua aplicação rendeu:");
			inv.rentabilidadeAcumulada(valorInvestido, rendimentoAtual);
			
		}

	}

}
