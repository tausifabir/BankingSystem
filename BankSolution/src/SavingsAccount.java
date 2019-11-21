
public class SavingsAccount extends BankAccount {
	
	private int interestRate;
	
	public SavingsAccount(String acc_name, String acc_number, int balance, int interestRate) {
		super(acc_name, acc_number, balance);
		this.interestRate = interestRate;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String withdraw(int amount) {
		if(super.getBalance() - amount >=500) {
			int remainingbalance = super.getBalance() - amount;
			super.setBalance(remainingbalance); 
			return "Your Account has been debited Tk.  "+amount;
		}
		else {
		return "Your Account has Infficent Balance!!";
		}
	}



	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	}
	
	
	
	

}
