package secao16.model.services;

import java.util.Calendar;
import java.util.Date;

import secao16.model.entities.Contract;
import secao16.model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinepaymentservice) {
		this.onlinePaymentService = onlinepaymentservice;
	}
	
	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i<=months; i++) {
			Date dueDate = addMonths(contract.getDate(), i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double subtotal = basicQuota + interest;
			double tax = onlinePaymentService.paymentFee(subtotal);
			double amount = subtotal + tax;
			
			contract.getInstallments().add(new Installment(dueDate, amount));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}