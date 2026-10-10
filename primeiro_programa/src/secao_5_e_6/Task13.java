package secao_5_e_6;

import java.util.Locale;
import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		int dentro = 0;
		int fora = 0;
		
		for(int i=1; i <= N; i++) {
			int X = sc.nextInt();
			if(X >=10 && X <=20) {
				dentro += 1;
			}
			else {
				fora += 1;
			}
		}
		
		System.out.println("in: " + dentro);
		System.out.println("out: " + fora);
		
		
		sc.close();
	}
}
