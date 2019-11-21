
public class BankMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Steven Rogers","0712",5000,15);
		CheckingAccount ca = new CheckingAccount("John Wick","0002",4000,15,2000);
		
		System.out.println("After created Account");
		System.out.println("=========");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());
		
		System.out.println("\nDeposit");
		System.out.println("=========");

		System.out.println(sa.deposit(500));
		System.out.println(ca.deposit(2500));
		
		
		System.out.println("\nAfter deposit Account");
		System.out.println("=========");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());
		
		System.out.println("\nWithdraw ");
		System.out.println("=========");
		
		System.out.println(sa.withdraw(1800));
		System.out.println(ca.withdraw(120000));
		
		
		System.out.println("\n After withdraw");
		System.out.println("=========");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());
	}

}
