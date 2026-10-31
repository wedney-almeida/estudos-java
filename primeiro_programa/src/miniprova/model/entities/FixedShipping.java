package miniprova.model.entities;

public class FixedShipping implements Shipping {

	@Override
	public double cost(double purchaseValue) {
		return purchaseValue;
	}
	
}
