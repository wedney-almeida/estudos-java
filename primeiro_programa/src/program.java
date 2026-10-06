
public class program {
	public static void main (String [] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";	
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %f.2%n", product1, price1);
		System.out.printf("%s, which price is: %f.2%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f.8%n", measure);
		System.out.println();
		System.out.printf("Rouded (three decimal places): %f.3%n", measure);
		System.out.println();
		System.out.printf("US decimal point: %f.3%n", measure);
		
	}
}
