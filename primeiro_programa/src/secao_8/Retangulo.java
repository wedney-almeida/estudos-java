package secao_8;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME A ALTURA E A LARGURA: ");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		double area = w * h;
		double perimetro = w + w + h + h;
		double diagonal = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PERIMETRO: %.2f%n", perimetro);
		System.out.printf("DIAGONAL: %.2f%n", diagonal);
		
		sc.close();
		
	}

}
