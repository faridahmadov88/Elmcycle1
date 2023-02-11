package section1_3;

public class BankCalc {
	
	public static void main (String [] args ) {
		
		int totalBalance = 58000; //$580
		
		int withdrawel = 2500;  //$25
		
		int deposit = 1000;  //$10
		
		int remainingBalance = totalBalance - withdrawel + deposit;
		
		System.out.print("Balance: $" );
		System.out.println(remainingBalance / 100);
		
		
	}


}
