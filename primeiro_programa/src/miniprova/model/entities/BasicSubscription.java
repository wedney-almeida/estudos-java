package miniprova.model.entities;

public class BasicSubscription extends Subs {
	
	public BasicSubscription(String name, Double monthlyPrice) {
		super(name, monthlyPrice);
	}
	
	@Override
	public Double totalCost(int months) {
		return getMonthlyPrice() * months;
	}
}
