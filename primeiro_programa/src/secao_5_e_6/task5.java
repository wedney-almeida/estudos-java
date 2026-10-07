package secao_5_e_6;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt(); 
		int qtd = sc.nextInt();
		
		
		double item1 = 4.00;
		double item2 = 4.50;
		double item3 = 5.00;
		double item4 = 2.00;
		double item5 = 1.50;
		
		double valor;
		
		switch (cod) {
		case 1:
			valor = item1 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 2:
			valor = item2 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 3:
			valor = item3 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 4:
			valor = item4 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 5:
			valor = item5 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;	
		}
		
		sc.close();
	}
}
