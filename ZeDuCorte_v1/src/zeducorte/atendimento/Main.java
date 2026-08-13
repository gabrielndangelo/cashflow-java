/*
 * =========================================================
 * Projeto: ZéDuCorte Barbershop
 * Versão: 1.0
 * Autor: Gabriel do Nascimento Dangelo
 * Data: 11/08/2026
 *
 * Descrição:
 * Simulação de um micro-sistema de agendamento de serviços 
 * de um pequeno negócio local (no caso, barbearia)
 *
 * Conteúdos utilizados:
 * - Variáveis e tipos de dados
 * - Scanner
 * - Estrutura condicional simples: if/else  
 * - Estruturas condicionais aninhadas: switch/case  
 * =========================================================
 */

package zeducorte.atendimento;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		String nomeCliente;   // ler o nome do cliente
		
		String servicoEscolhido = "";
		
		double valor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int servico;
		
		/* Área das variáveis para ler o número e o
		nome do atendente em caractere (que será mostrado ao final */
		
		String nomeAtendente = "";
		int atendente;
		
		int horario; // para ler as opções de horário para o cliente agendar
		String horarioCliente = "";
		
		System.out.println("-----------------------------------");
		System.out.println("             ZéDuCorte            ");
		System.out.println("             Barbershop           ");
		System.out.print("Bem-vindo, cliente! Qual seu nome?  ");
		nomeCliente = sc.next();
		System.out.println("Olá, " + nomeCliente + "!");
		System.out.println("Esses são os serviços oferecidos pela nossa");
		System.out.println("ZéDuCorte Barbershop. Está interessado em algum?");
		System.out.println("---------------------------------");
		System.out.println("(1) CORTE À TESOURA - R$ 40,00");
		System.out.println("(2) CORTE À MÁQUINA - R$ 30,00");
		System.out.println("(3) BARBA - R$ 20,00");
		System.out.println("(4) COMBO CORTE + BARBA - R$ 50,00");
		System.out.println("(5) CORTE KIDS - R$ 25,00");
		System.out.println("(6) SOMBRANCELHA - R$ 20,00");
		System.out.println("---------------------------------");
		System.out.println("Digite o número do pedido: ");
		servico = sc.nextInt();
		
		/* Em seguida, o programa irá ler entre os serviços escolhidos 
		*/
		
		switch (servico) {
		case 1:
			servicoEscolhido = "Corte à tesoura";
			valor = 40.00;
		break;
		case 2:
			servicoEscolhido = "Corte à máquina";
			valor = 30.00;
			break;
		case 3:
			servicoEscolhido = "Barba";
			valor = 20.00;
			break;
		case 4:
			servicoEscolhido = "Combo corte + barba";
			valor = 50.00;
			break;
		case 5:
			servicoEscolhido = "Corte KIDS";
			valor = 25.00;
			break;
		case 6:
			servicoEscolhido = "Sombrancelha";
			valor = 20.00;
			break;
		default:
		break;
		}
		
		/* Em seguida, o programa irá mostrar as opções de atendentes 
		  para o cliente escolher */
		
		System.out.println("----------------------------------------------------");
		System.out.println(" Escolha um dos nossos atendentes disponíveis:     ");
		System.out.println("(1) Pedro");
		System.out.println("(2) Tiago");
		System.out.println("(3) João");
		System.out.println("----------------------------------------------------");
		atendente = sc.nextInt();
		
		switch (atendente) {
		case 1:
			nomeAtendente = "Pedro";
		break;
		case 2:
			nomeAtendente = "Tiago";
			break;
		case 3:
			nomeAtendente = "João";
			break;
		default:
		break;
		}
		
	    System.out.println("----------------------------------------------------");
		System.out.println(" Escolha um de nossos horários disponíveis: ");
		System.out.println("(1) 09:00");
		System.out.println("(2) 12:00");
		System.out.println("(3) 15:00");
		System.out.println("(4) 18:00");
		System.out.println("----------------------------------------------------");
		horario = sc.nextInt();
		
		switch (horario) {
		case 1:
			horarioCliente = "09:00";
		break;
		case 2:
			horarioCliente = "12:00";
			break;
		case 3:
			horarioCliente = "15:00";
			break;
		case 4:
			horarioCliente = "18:00";
			break;
		default:
		break;
		}
		
		System.out.println("-----------------------");
		System.out.println("     AGENDAMENTO       ");
		System.out.println("   ZéDuCorte Barbershop");
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Serviço: " + servicoEscolhido);
		System.out.println("Barbeiro: " + nomeAtendente);
		System.out.println("Horário agendado: " + horarioCliente);
		System.out.printf("Valor: R$ %.2f%n",valor);
		System.out.println("-----------------------");
		System.out.println("CONFIRMAR AGENDAMENTO? (S) SIM (N) NÃO");
		char agendamento = sc.next().toLowerCase().charAt(0);
		
		if (agendamento == 's'){
			System.out.println(" Agendamento confirmado! ");
			System.out.println("TE ESPERAMOS EM NOSSA BARBEARIA, " + nomeCliente.toUpperCase() + "!");
			System.out.println("(PROMOÇÃO) Chopp gelado grátis no seu primeiro pedido!");
			System.out.println("         ZéDuCorte Barbershop       ");
		}
		else {
			System.out.println("VOLTE SEMPRE, " + nomeCliente.toUpperCase() + "!");
			System.out.println("         ZéDuCorte Barbershop       ");
		} 
		
		sc.close();
	}

}
