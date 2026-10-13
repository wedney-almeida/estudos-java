package secao_8;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Aplication_Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo largura, altura;
		largura = new Retangulo();
		altura = new Retangulo();
		
		System.out.println("INFORME A ALTURA E A LARGURA: ");
		largura.largura = sc.nextDouble();
		altura.altura = sc.nextDouble();
		
		double area = altura.altura * largura.largura;
		double perimetro = altura.altura + altura.altura + largura.largura + largura.largura;
		double diagonal = Math.sqrt(Math.pow(altura.altura, 2) + Math.pow(largura.largura, 2));
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PERIMETRO: %.2f%n", perimetro);
		System.out.printf("DIAGONAL: %.2f%n", diagonal);
		
		sc.close();
		
	}

}
