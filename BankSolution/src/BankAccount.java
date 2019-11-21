
public abstract class BankAccount {

	private String acc_name;
	private String acc_number;
	private int balance;
	
	
	public BankAccount(String acc_name, String acc_number, int balance) {
		super();
		this.acc_name = acc_name;
		this.acc_number = acc_number;
		this.balance = balance;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String deposit(int amount) {
		balance += amount;
		return "Your Account has been credited Tk. "+amount;
	}
	
	public abstract String withdraw(int amount);
	
	
	@Override
	public String toString() {
		return "BankAccount [acc_name=" + acc_name + ", acc_number=" + acc_number + ", balance=" + balance + "]";
	}
	
	
	 
}
