package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.ComandaStatus;

public class Comanda {
	
	private Integer tableNumber;
	private Date openedAt;
	
	private ComandaStatus status;
	private Waiter waiter;
	
	private List<ComandaItem> items = new ArrayList<>();
	
	public Comanda() {
	}
	
	public Comanda(Integer tableNumber, Date openedAt, Waiter waiter) {
		super();
		this.tableNumber = tableNumber;
		this.openedAt = openedAt;
		this.waiter = waiter;
	}

	public Integer getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(Integer tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Date getOpenedAt() {
		return openedAt;
	}

	public void setOpenedAt(Date openedAt) {
		this.openedAt = openedAt;
	}

	public ComandaStatus getStatus() {
		return status;
	}

	public void setStatus(ComandaStatus status) {
		this.status = status;
	}

	public Waiter getWaiter() {
		return waiter;
	}

	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}
	
	public void addItem(ComandaItem item) {
		items.add(item);
	}
	
	public void removeItem(ComandaItem item) {
		items.remove(item);
	}
	
	public double subTotal() {
		double sum = 0.0;
		
		for(ComandaItem item: items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public double serviceFee() {
		return subTotal() * 0.10;
	}
	
	public double total() {
		return subTotal() + serviceFee();
	}
}	
