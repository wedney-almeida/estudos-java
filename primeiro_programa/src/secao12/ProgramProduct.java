package secao12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramProduct {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birthdate (DD/MM/YYYY): ");
		Date dateBuy = sdf.parse(sc.next());
		
		Client client = new Client(clientName, clientEmail, dateBuy);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusTetxo = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusTetxo); 
		Date agora = new Date();
		
		Order order = new Order(agora, status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			OrderItem items = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(items);
		}
		
		System.out.println(order);
		
		sc.close();
	}
}
