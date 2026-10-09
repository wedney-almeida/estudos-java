package secao_5_e_6;

import java.util.Locale;
import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		int senhaCorreta = 2002;
		
		while(senha != senhaCorreta) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}
}
