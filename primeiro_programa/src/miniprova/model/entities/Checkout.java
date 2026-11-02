package miniprova.model.entities;

public class Checkout {
	
	private Shipping shipping;
	
	
	public Checkout(Shipping shipping) {
		super();
		this.shipping = shipping;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	
	public Double total(double purchaseValue) {
		
		double freight = shipping.cost(purchaseValue);
		return purchaseValue + freight;
	}
}
