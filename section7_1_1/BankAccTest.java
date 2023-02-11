package section7_1_1;

public class BankAccTest {

	public static void main(String[] args) {

		
		
		BankAccount ba1 = new BankAccount();
		ba1.accountHolder= "Johnny Depp";
		ba1.accountbalance= 100;
		
		ba1.deposit(0);
		ba1.withdraw(99, "chace");
		ba1.print();
		
		
		
		
	}

}
