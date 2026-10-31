package miniprova.model.entities;

import miniprova.model.exceptions.WalletException;

public class Wallet {
	
	private Double balance;
	private Double limit;
	
	public Wallet() {
	}

	public Wallet(Double balance, Double limit) {
		this.balance = balance;
		this.limit = limit;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}
	
	public void pay(double amount) {
		
		if(amount > getLimit()) {
			throw new WalletException("Amount exceeds the payment limit");
		}
		if(amount > getBalance()) {
			throw new WalletException("Not enough balance");
		}
		
		balance = getBalance() - amount;
	}
	
	public String toString() {
		return "Current balance: " + "$" + String.format("%.2f", getBalance());
	}
}
