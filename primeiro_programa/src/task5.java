import java.util.Locale;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int codPeca1 = sc.nextInt();
		int np1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int np2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double valorApagar = (np1 * valorPeca1 + np2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorApagar);
		
		sc.close();
	}
}
