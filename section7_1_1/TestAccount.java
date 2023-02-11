package section7_1_1;

public class TestAccount {

	public static void main(String[] args) {
		
		
		Account ac1 = new Account();
		
		ac1.insert(13321, "Farid", 100);
		ac1.deposit(-500);
		ac1.withdraw(0);
		ac1.checkBalance();
		ac1.display();
		
	}

}
