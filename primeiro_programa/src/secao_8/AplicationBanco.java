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
		System.out.println("TITULAR DA CONTA:");
		String titular = sc.nextLine();
		System.out.println("HAVERA DEPOSITO? ");
		
		String depositoInicial;
		ContaBancaria conta;
		
		if(depositoInicial == "s") {
			System.out.println("INSIRA O VALOR A SER DEPOSITADO:");
			depositoInicial = sc.nextLine();
			conta = new ContaBancaria(numConta, titular, depositar);
		}
		else {
			conta = new ContaBancaria(numConta, titular);
		}
		
		conta = new ContaBancaria(numConta, titular, depositar);
		
		sc.close();
	}
}
