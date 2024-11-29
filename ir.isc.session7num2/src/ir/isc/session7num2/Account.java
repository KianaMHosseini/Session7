package ir.isc.session7num2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	

	private String name;
	@JsonProperty("balances")
	private int balance;
	private Transaction transaction;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", transaction=" + transaction + "]";
	}

}
