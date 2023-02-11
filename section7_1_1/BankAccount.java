package section7_1_1;

public class BankAccount {
	
	
	
	String accountHolder;
	double accountbalance;
	static String bankname="Elm";
	
	
	
	public void deposit(double d) {
		
		accountbalance+=d;
	}
	
	
	public void withdraw(double d,String name) {
		if (d>accountbalance) {
			System.out.println("Insufficent Balance");
			return;
		}
		
		if (name.equals(bankname) ) {
			accountbalance-=d;
			
		}else {
			double percent= d * 0.03;
			double total= percent+d;
			accountbalance-=total;
		}
	}
	public void print() {
		System.out.println("Account holder: "+accountHolder  );
		System.out.println("Account balance: "+ "$"+accountbalance);
		System.out.println("Bank name: "+ bankname);
	}

}
