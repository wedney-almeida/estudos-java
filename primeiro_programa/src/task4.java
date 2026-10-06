import java.util.Locale;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nf = sc.nextInt();
		double hf = sc.nextDouble();
		double vh = sc.nextDouble();
		
		double salario = hf * vh;
		
		System.out.println("NUMBER = " + nf);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
