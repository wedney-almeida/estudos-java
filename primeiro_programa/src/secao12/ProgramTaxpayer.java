package secao12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.LegalEntity;
import entities.Taxpayer;

public class ProgramTaxpayer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> taxpayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				sc.nextLine();
				
				taxpayers.add(new Individual(name, anualIncome, health));
			}
			else {
				System.out.print("Number of employees: ");
				int numbEmployees = sc.nextInt();
				
				taxpayers.add(new LegalEntity(name, anualIncome, numbEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		
		double total = 0.0;
		for(Taxpayer tp : taxpayers) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			total += tp.tax();
		}
		System.out.println("TAXES TAXES: $ " + String.format("%.2f", total));
		
		sc.close();
	}
}	
