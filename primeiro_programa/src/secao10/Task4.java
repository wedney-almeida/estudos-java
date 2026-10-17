package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Task4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS FUNCIONARIO VOCÊ QUER CADASTRAR? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("FUNCIONARIO #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Employee(id, nome, salario));
		}
		
		double aumento = 0;
		Employee encontrado= null;
		
		System.out.print("INFORME O ID DO FUNCIONARIO QUE IRA RECEBER O AUMENTO: ");
		int idProcurado = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(list.get(i).getId() == idProcurado) {
				 encontrado = list.get(i);
			}
		}
		
		if(encontrado == null) {
			System.out.println("ESSE ID NÃO EXISTE!");
		}
		else {
			System.out.print("INFORME O VALOR DO AUMENTO: ");
			 aumento = sc.nextDouble();
			 encontrado.AumentoDeSalario(aumento);
		}
		
		System.out.println("FUNCIONARIO:");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
