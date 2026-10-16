package secao10;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Task3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTAS PESSOAS SERAO CADASTRADAS? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("DADOS DA " + (i + 1) + "a PESSOA:");
			System.out.print("NOME: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("IDADE: ");
			int idade = sc.nextInt();
			System.out.print("ALTURA: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAlturas = 0;
		int menores16 = 0;
		
		for (int i = 0; i < vect.length; i++) {
			somaAlturas += vect[i].getAltura();
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				menores16++;
			}
		}
		
		double porcentagem = (double) menores16 / vect.length * 100 ;
		double media = somaAlturas / vect.length;
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
