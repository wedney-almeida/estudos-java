package secao_5_e_6;

import java.util.Locale;
import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
				x = sc.nextInt();
				y = sc.nextInt();		
			}
			else if(x < 0 && y > 0) {
				System.out.println("SEGUNDO");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x < 0 && y < 0) {
				System.out.println("TERCEIRO");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else {
				System.out.println("QUARTO");
				x = sc.nextInt();
				y = sc.nextInt();
			}
		}
		
		sc.close();
		
	}
}
