package secao_5_e_6;

import java.util.Locale;
import java.util.Scanner;

public class task11 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(cod != 4) {
			if(cod > 4) {
				System.out.println("Informe um codigo valido");
				cod = sc.nextInt();
			} else if(cod == 1) {
				alcool += 1;
				cod = sc.nextInt();
			} else if(cod == 2) {
				gasolina += 1;
				cod = sc.nextInt();
			} else {
				diesel += 1;
				cod = sc.nextInt();
			} 
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);
		
		sc.close();
	}
}
