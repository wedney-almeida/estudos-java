package miniprova.model.entities;

public class FreeAboveShipping implements Shipping {

	private Double minimumValue;
	private Double taxRate;
	
	public FreeAboveShipping() {
	}
	
	
	public FreeAboveShipping(Double minimumValue, Double taxRate) {
		this.minimumValue = minimumValue;
		this.taxRate = taxRate;
	}
	

	public Double getMinimumValue() {
		return minimumValue;
	}


	public void setMinimumValue(Double minimumValue) {
		this.minimumValue = minimumValue;
	}


	public Double getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public double cost(double purchaseValue) {
		if(purchaseValue >= getMinimumValue()) {
			taxRate = 0.0;
		}
		else {
			taxRate += taxRate;
		}
		return purchaseValue;
	}

}
