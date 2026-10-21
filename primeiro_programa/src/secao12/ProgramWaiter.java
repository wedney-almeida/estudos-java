package secao12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comanda;
import entities.ComandaItem;
import entities.Waiter;
import entities.enums.ComandaStatus;

public class ProgramWaiter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter waiter data:");
		System.out.print("Name: ");
		String waiterName = sc.nextLine();
		System.out.print("Registration: ");
		int waiterRegistration = sc.nextInt();
		sc.nextLine();
		
		Waiter waiter = new Waiter(waiterName, waiterRegistration);
		
		System.out.print("Table number: ");
		int numberTable = sc.nextInt();
		sc.nextLine();
		System.out.print("Status: ");
		ComandaStatus status = ComandaStatus.valueOf(sc.nextLine());
		
		Comanda comanda = new Comanda(numberTable, new Date(), status, waiter);
		
		System.out.println("How many items? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.print("Dish name: ");
			String dishName = sc.nextLine();
			System.out.print("Dish price: ");
			double dishPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Quantity: ");
			int dishQuantity = sc.nextInt();
			sc.nextLine();
			
			ComandaItem items = new ComandaItem(dishName, dishPrice, dishQuantity);
			comanda.addItem(items);
		}
		
		sc.close();
	}

}
