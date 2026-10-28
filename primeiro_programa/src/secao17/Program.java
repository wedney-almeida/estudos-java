package secao17;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			int cod = sc.nextInt();
			set.add(cod);
		}
		
		System.out.print("How many students for course B? ");
		qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			int cod = sc.nextInt();
			set.add(cod);
		}
		
		System.out.print("How many students for course B? ");
		qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			int cod = sc.nextInt();
			set.add(cod);
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();

	}

}
