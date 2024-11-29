package ir.isc.session7num2;

public class Transaction {
	
	private int to;
	private int amount;
	private String desc;
	
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Transaction [to=" + to + ", amount=" + amount + ", desc=" + desc + "]";
	}

	
	
}