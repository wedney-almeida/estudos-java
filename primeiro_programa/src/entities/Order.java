package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private List<Product> product = new ArrayList<>(); 
	
	public Order() {
	}

	public Order(Date moment) {
		super();
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(Product product) {
		product.getName();
		product.getPrice();
	}
	
	public void removeItem(Product prod) {
		
	}
}	
