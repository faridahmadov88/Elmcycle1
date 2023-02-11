package OOPwarmup;

public class Bank {

	String bankName = "BankOfAmerica";
	String accountHolder;
	long accountNumber;
	int balance;
	int withdrawal;
	int limit;

	public Bank(String accountHolder, long accountNumber ,int balance ) {

		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance=balance;
		System.out.println("Welcome to BankOfAmerica \nYou can withdraw only 5 times");
		
		

	}
	public void withDrawal (int withdrawal) {
		if (withdrawal>balance) {
			System.out.println("Withdrawal amount is greater than balance.");
			this.balance =balance;
		}else {
			System.out.println("Balance after withdrawal:");
			this.balance=balance-withdrawal;
		}
	}
}
