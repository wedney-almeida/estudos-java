package miniprova;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import miniprova.model.entities.BasicSubscription;
import miniprova.model.entities.PremiumSubscription;
import miniprova.model.entities.Subs;

public class ProgramProva1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Subs> subscriptions = new ArrayList<>();
		
		System.out.print("Quantidade de meses: ");
		int subsMonths = sc.nextInt();
		
		subscriptions.add(new BasicSubscription("Basic", 10.0));
		
		subscriptions.add(new PremiumSubscription("Premium", 15.0 , 20.0));
		
		for(Subs s : subscriptions) {
			System.out.println(s.getName() + ": " + String.format("%.2f", s.totalCost(subsMonths)));
		}
		
		sc.close();
	}
}
