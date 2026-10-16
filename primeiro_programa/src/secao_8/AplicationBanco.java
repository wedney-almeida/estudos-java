package secao_8;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class AplicationBanco {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("**INFORME OS DADOS DA CONTA**");
		System.out.println("NUMERO DA CONTA:");
		int numConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("TITULAR DA CONTA:");
		String titular = sc.nextLine();
		
		System.out.println("HAVERA DEPOSITO (s/n)?");
		char resposta = sc.next().charAt(0);
		
		double depositoInicial;
		ContaBancaria conta;
		
		if(resposta == 's') {
			System.out.println("INSIRA O VALOR A SER DEPOSITADO:");
			depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numConta, titular, depositoInicial);
		}
		else {
			conta = new ContaBancaria(numConta, titular);
		}
		
		System.out.println("DADOS DA CONTA:");
		System.out.println(conta);
		
		System.out.println("INFORME O VALOR DE DEPOSITO:");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("DADOS ATUALIZADOS:");
		System.out.println(conta);
		
		System.out.println("INFORME O VALOR DE SAQUE:");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("DADOS ATUALIZADOS:");
		System.out.println(conta);
		
		sc.close();
	}
}
