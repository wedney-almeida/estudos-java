package secao16.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao16.model.entities.Contract;
import secao16.model.entities.Installment;
import secao16.model.services.ContractService;
import secao16.model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, parcelas);
		
		System.out.println("Parcelas:");
		for(Installment inst : contract.getInstallments()) {
			System.out.println(inst);
		}
		
		sc.close();

	}

}
