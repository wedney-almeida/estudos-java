package secao_5_e_6;

import java.util.Scanner;

public class task3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int multiplo1 = A % B;
		int multiplo2 = B % A;
		
		if(multiplo1 == 0 || multiplo2 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
	}
}
