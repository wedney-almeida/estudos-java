package miniprova;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import miniprova.model.entities.Product;

public class ProgramProva4 {
	
	public static void main(String[] agrs) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Notebook", "Electronics", 3500.00));
		products.add(new Product("Mouse", "Electronics", 80.00));
		products.add(new Product("Java Book", "Books", 120.00));
		products.add(new Product("Novel", "Books", 45.00));
		products.add(new Product("Headphones", "Electronics", 250.00));
		products.add(new Product("Pen", "Stationery", 3.50));
		
		for(Product p : products) {
			System.out.println(p.getName());
		}
		
		Map<String, Integer> prod = new LinkedHashMap<>();
		
		for(Product p : products) {
			if(prod.containsKey(p.getCategory())) {
				int actualeValue = prod.get(p.getCategory());
				prod.put(p.getCategory(), actualeValue + 1);
			}
			else {
				prod.put(p.getCategory(), 1);
			}
		}	
		
		Product maxPrice = products.get(0);
		for(Product p : products) {
			if(p.getPrice() > maxPrice.getPrice()) {
				maxPrice = p;
			}
		}
		System.out.println(maxPrice.getName());
		
		products.stream()
			.filter(p -> p.getPrice() > 100.00)
			.map(p -> p.getName())
			.sorted()
			.forEach(System.out::println);
		
		double sumBooks = products.stream()
				.filter(p -> p.getCategory().equals("Books"))
				.mapToDouble(p -> p.getPrice())
				.reduce(0.0, (x, y) -> x + y);
				
		System.out.println("Toal Value: $"+ sumBooks);	
		
		sc.close();
	}
}
