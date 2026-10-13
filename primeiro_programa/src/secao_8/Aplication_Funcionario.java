package secao_8;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Aplication_Funcionario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.println("INFORME OS DADOS DO FUNCIONARIO: ");
		fun.nome = sc.nextLine();
		fun.salario = sc.nextDouble();
		fun.desconto = sc.nextDouble();
		
		System.out.println(fun.formato());
		System.out.println("INFORME O VALOR DO AUMENTO: ");
		fun.acrescimo = sc.nextDouble();
		
		
		
		sc.close();
	}
}
