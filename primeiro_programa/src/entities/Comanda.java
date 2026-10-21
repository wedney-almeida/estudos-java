package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.ComandaStatus;

public class Comanda {
	
	private Integer tableNumber;
	private Date openedAt;
	
	private ComandaStatus status;
	private Waiter waiter;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<ComandaItem> items = new ArrayList<>();
	
	public Comanda() {
	}
	
	public Comanda(Integer tableNumber, Date openedAt, ComandaStatus status,Waiter waiter) {
		super();
		this.tableNumber = tableNumber;
		this.openedAt = openedAt;
		this.waiter = waiter;
		this.status = status;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Opened at: ");
		sb.append(sdf.format(openedAt) + "\n");
		sb.append("Table: ");
		sb.append(tableNumber + "\n");
		sb.append("Status: ");
		sb.append(status + "\n");
		sb.append("Waiter: ");
		sb.append(waiter + "\n");
		
		sb.append("Items: \n");
		for(ComandaItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Subtotal: $");
		sb.append(String.format("%.2f", subTotal()) + "\n");
		sb.append("Service fee (10%): $");
		sb.append(String.format("%.2f", serviceFee()) + "\n");
		sb.append("Total: $");
		sb.append(String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
}	
