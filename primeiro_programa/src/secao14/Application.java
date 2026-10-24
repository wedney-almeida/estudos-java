package secao14;

import java.util.Locale;
import java.util.Scanner;

import entities.Account14;
import exceptions.BusinessException;

public class Application {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();
		System.out.print("Initial Balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		sc.nextLine();
		
		Account14 acc = new Account14(number, name, initialBalance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amountWithdraw = sc.nextDouble();
		
		try {
			acc.withdraw(amountWithdraw);
			System.out.println("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (BusinessException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
	
		
		sc.close();
	}
}
