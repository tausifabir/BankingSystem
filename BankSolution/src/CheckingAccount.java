
public class CheckingAccount extends BankAccount{
	private int serviceCharge;
	private int upperlimit;
	
	public CheckingAccount(String acc_name, String acc_number, int balance, int serviceCharge, int upperlimit) {
		super(acc_name, acc_number, balance);
		this.serviceCharge = serviceCharge;
		this.upperlimit = upperlimit;
	}

	@Override
	public String withdraw(int amount) {
		if(super.getBalance() - amount >upperlimit) {
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
		return "CheckingAccount [serviceCharge=" + serviceCharge + ", upperlimit=" + upperlimit + "]";
	}

	
	
	
	
}
