package OOPwarmup;

public class SavingAccount {
	double balance;
	int interest;
	int limit = 3;
	int withdraw;

	double rate = 5;
	double time = 3 ;
	
	
	

	public void withdraw(int withdraw) {

		if (limit <= 0) {
			System.out.println("You have reached limit of transactions");
			return;}
		limit--;
		

			if (withdraw > balance) {
			System.out.println("Withdraw ammount is greater than balance.");
			} else {
			balance = balance - withdraw;
			System.out.println("Your balance after withdrawal is : " + balance);
			
			}
		
	}

	public void deposit(int deposit) {
		if (limit <= 0) {
			System.out.println("You have reached limit of transactions");
			return;
			
		}else {
			balance= balance+deposit;
		}
		limit--;

	}
	public void calculateinterest () {
		double interest;
		System.out.println("Your interest will be for 3 years with 5% interest rate :");
		
		interest = (this.balance* rate*time)/ 100;
		double total= balance+interest;
		System.out.println("Interest "+interest+" Your total money after 3 years will be :"+total);
}
}
