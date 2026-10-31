package miniprova;

import java.util.Locale;
import java.util.Scanner;

import miniprova.model.entities.Wallet;
import miniprova.model.exceptions.WalletException;

public class ProgramProva2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your wallet details:");
		try {
			System.out.print("Provide the balance: ");
			double accountBalence = sc.nextDouble();
			System.out.print("Enter the limit: ");
			double accountLimit = sc.nextDouble();
			System.out.print("Enter the withdrawal amount: ");
			double withdrawal = sc.nextDouble();
			
			Wallet wallet = new Wallet(accountBalence, accountLimit);
			wallet.pay(withdrawal);
			
			System.out.println(wallet.toString());
		}
		
		catch (WalletException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
