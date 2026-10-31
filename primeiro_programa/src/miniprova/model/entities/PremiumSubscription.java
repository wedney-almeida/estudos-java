package miniprova.model.entities;

public class PremiumSubscription extends Subs{
	
	private Double discountPercent;
	
	public PremiumSubscription(String name, Double discountPercent, Double monthlyPrice) {
		super(name, monthlyPrice);
		this.discountPercent = discountPercent;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	@Override
	public Double totalCost(int months) {
		
		double sum = getMonthlyPrice() * months;
		
		if(months >= 12) {
			sum -= sum * getDiscountPercent() / 100;
		}
		
		double tax = sum + 30.00;
		
		return tax;
	}

}
