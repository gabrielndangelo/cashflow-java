/**
 * MinasInCentro CoffeeShop - Sistema de Fluxo de Caixa
 *
 * Microprojeto desenvolvido para praticar fundamentos de Java,
 * aplicando conceitos de fluxo de caixa aprendidos no curso
 * de Assistente Administrativo.
 *
 * O sistema permite registrar entradas e saídas, consultar o
 * saldo e gerar um relatório diário do caixa.
 *
 * @author Gabriel Dangelo
 * @version 1.0
 * @since 2026
 */

package cafeteria.fluxodecaixa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double saldoInicial = 500.00;
		double saldo = saldoInicial; // saldo inicial do fluxo de caixa
		int menuOpcoes;
		
		String tipoEntrada = "";  // aqui o tipo irá variar conforme a saída e a entrada
		String tipoSaida = "";
		
		/* Aqui serão declaradas as descrições de entrada e saída*/
		
		
		double valorEntrada;
		double valorSaida;
		
		double totEnt = 0;
		double totSai = 0;
		
		
		Scanner sc = new Scanner(System.in);

		/* Aqui vai uma 
		 estrutura de repetição para o usuário ver até encerrar */
		
		do {
		System.out.println("==========================");
		System.out.println(" MinasInCentro CoffeeShop");
		System.out.println("==========================");
		System.out.println("(1) Registrar ENTRADA");
		System.out.println("(2) Registrar SAÍDA");
		System.out.println("(3) CONSULTAR FLUXO");
		System.out.println("(4) ENCERRAR");
		menuOpcoes = sc.nextInt();
		
		switch (menuOpcoes) {
		case 1:
			System.out.print("TIPO DE ENTRADA: ");
			tipoEntrada = sc.nextLine();
			sc.nextLine();
			System.out.print("VALOR: R$ ");
			valorEntrada = sc.nextDouble();
			
			totEnt = totEnt + valorEntrada; // os valores de entrada vão somar com o total, ainda indefinido
			
			if (valorEntrada > 0){
				saldo = saldo + valorEntrada;
			}
			
		break;
		
		case 2:
			System.out.print("TIPO DE SAÍDA: ");
			tipoSaida = sc.nextLine();
			sc.nextLine();
			System.out.print("VALOR: R$ ");
			valorSaida = sc.nextDouble();
			
			totSai = totSai + valorSaida; // serão declarados os totais de saídas do caixa
			
			saldo = saldo - valorSaida; // aqui, o saldo será subtraído pelo valor de saída
			
		break;
		
		case 3:
			System.out.println("==========================");
			System.out.println(" MinasInCentro CoffeeShop");
			System.out.println("==========================");
			System.out.printf("ENTRADAS: R$ %.2f%n",totEnt);
			System.out.printf("SAÍDAS: R$ %.2f%n",totSai);
			System.out.printf("SALDO: R$ %.2f%n",saldo);
		default:	
		break;
		}
		
		} while (menuOpcoes < 4); 
		
		if (menuOpcoes == 4) {
			
			
		double diferenca = saldo - saldoInicial;
				
			System.out.println("==========================");
			System.out.println(" MinasInCentro CoffeeShop");
			System.out.println("==========================");	
			System.out.println("Fluxo de caixa diário");
			System.out.printf("ENTRADAS: R$ %.2f%n",totEnt);
			System.out.printf("SAÍDAS: R$ %.2f%n",totSai);
			
			System.out.println("=============================");
			System.out.printf("SALDO FINAL: R$ %.2f%n",saldo);
			System.out.printf("Diferença: R$ %.2f%n",diferenca);
			
			if (saldo > saldoInicial){
			 System.out.println("STATUS: Lucro");	
			}
			else if (saldo < saldoInicial) {
				System.out.println("STATUS: Prejuízo");
			}
			else if (saldo == saldoInicial) {
				System.out.println("STATUS: Neutro");
			}
			
			System.out.println("=============================");
		}
		    
		
		sc.close();
	}

}
