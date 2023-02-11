package section7_1_1;
import java.util.*;
public class SavingAccount {
//(1) calculate for the interest return, and (2) to limit the number of transactions the account holder can conduct.
	String accountName ;
	double balance;
	double rate = 5;
	double time = 3;
	//Simple Interest = (P × R × T)/100
	
	void insertData(String aname, double b) {
		accountName = aname;
		balance = b;
		System.out.println("Account holder name: "+aname + " Balance: "+b);
	}
	
	void calculateinterest () {
		double interest;
		System.out.println("Your interest will be for 3 years with 5% interest rate :");
		
		interest = (balance* rate*time)/ 100;
		System.out.println("Interest "+interest);
	}
	
	void transactions(double d, double w) {
		int limit = 6;
		
		while(limit !=0) {
			
			System.out.println("Would you like to deposit or withdraw? enter W or D");
			
			
			
			
		}

		
		
	}
}
