package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		double media = 0;
		
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		System.out.printf("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		
		media = soma / vect.length;
		
		
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		sc.close();
	}
}
