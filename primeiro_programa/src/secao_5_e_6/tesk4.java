package secao_5_e_6;

import java.util.Scanner;

public class tesk4 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duraMaxima = 24;
		
		int duracao = (horaFinal - horaInicial) / duraMaxima;
				
		if(duracao == 0) {
			System.out.println("O jogo durou 24 horas");
		} else {
			System.out.println("O jogo durou " + duracao + "horas");
		}
			
			
		sc.close();
	}
}
