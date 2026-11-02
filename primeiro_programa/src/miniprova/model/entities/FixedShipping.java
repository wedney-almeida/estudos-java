package miniprova.model.entities;

public class FixedShipping implements Shipping {

	private Double taxRate;	

	public FixedShipping(Double taxRate) {
		super();
		this.taxRate = taxRate;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public double cost(double purchaseValue) {
		return getTaxRate();
	}
	
}
