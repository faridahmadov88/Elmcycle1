package OOPwarmup;

public class testBank {

	public static void main(String[] args) {
		
		SavingAccount save1 = new SavingAccount() ;
		save1.balance= 1000;
		save1.withdraw(100);
		save1.withdraw(100);
		save1.deposit(200);
		
		
		save1.calculateinterest ();


	
	}

}
