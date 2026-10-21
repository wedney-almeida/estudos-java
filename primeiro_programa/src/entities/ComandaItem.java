package entities;

public class ComandaItem {
	
	private Integer quantity;
	private Dish dish;
	
	public ComandaItem() {
	}

	public ComandaItem(Integer quantity, Dish dish) {
		super();
		this.quantity = quantity;
		this.dish = dish;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}
	
	public double subTotal() {
		return quantity * dish.getPrice();
	}
	
	@Override
	public String toString() {
		return dish.getName() 
				+ ", $" 
				+ String.format("%.2f", dish.getPrice()) 
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $" + String.format("%.2f", subTotal());
	}
}
