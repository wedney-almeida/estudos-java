package miniprova;

import java.util.Locale;

import miniprova.model.entities.Checkout;
import miniprova.model.entities.FixedShipping;
import miniprova.model.entities.FreeAboveShipping;

public class ProgramProva3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		FreeAboveShipping freeAboveShipping = new FreeAboveShipping(50.00, 20.00);
		Checkout checkout = new Checkout(freeAboveShipping);
		System.out.println("Total amount: $" + String.format("%.2f", checkout.total(120)));
		
		FixedShipping fixedShipping = new FixedShipping(15.00);
		Checkout checkout2 = new Checkout(fixedShipping);
		System.out.println("Total amount including fee: $" + String.format("%.2f", checkout2.total(120)));
		
	}
}
