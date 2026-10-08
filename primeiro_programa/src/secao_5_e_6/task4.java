package secao_5_e_6;

import java.util.Scanner;

public class task4 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duraMinima = 1;
		int duraMaxima = 24;
		
		int duracao = ((horaFinal - horaInicial - duraMinima + duraMaxima) % duraMaxima) + duraMinima;
		
		if(duracao == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
			
		sc.close();
	}
}
