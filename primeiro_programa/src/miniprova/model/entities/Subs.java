package miniprova.model.entities;

public abstract class  Subs {
	
	private String name;
	private Double monthlyPrice;
	
	public Subs() {
	}

	public Subs(String name, Double monthlyPrice) {
		super();
		this.name = name;
		this.monthlyPrice = monthlyPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(Double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	
	public abstract Double totalCost(int months);
}
