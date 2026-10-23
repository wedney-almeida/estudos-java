package entities;

import java.util.Date;

public class UsedProduct2 extends Product2 {
	
	private Date manufactureDate;
	
	private UsedProduct2() {
		super();
	}

	public UsedProduct2(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return String.format("%.2f", getPrice());
	}
}
