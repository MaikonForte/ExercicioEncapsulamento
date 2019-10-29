package aplicaçao;

import java.util.Scanner;

import entities.Conta;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = input.nextInt();
		
		System.out.print("Titular da conta:");
		String titular = input.nextLine();
		input.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial (s/n)? ");
		
		char resposta = input.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Informe o valor do deposito: ");
			double depositoInicial = input.nextDouble();
			
			conta = new Conta (titular, numeroConta, depositoInicial);
		}
		
		else {
			conta = new Conta (titular, numeroConta);
		}
		
		System.out.println();
		System.out.println("dados da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Deposito desejado:");
		double valorDeposito = input.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.print("Dados atualizado: ");
		System.out.print(conta);
		System.out.println();
		
		System.out.print("Saque desejado: ");
		double saqueDesejado = input.nextDouble();
		conta.saque(saqueDesejado);
		
		System.out.println("Dados atualizado:");
		System.out.println(conta);
		
		
		
	}
}
		


