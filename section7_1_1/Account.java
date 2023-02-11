package section7_1_1;

public class Account {
	int account_no;  
    String accountHolder;  
    double amount;  
    static String Bankname= "Chase";

    void insert(int i, String s, double d) {  
        account_no = i;  
        accountHolder = s;  
        amount = d;  
    }  

    void deposit(double d) {  
    	if (d<0) {
    		System.out.println("you can not deposit negative");
    	}else {
        amount += d;  
        System.out.println( d + " deposited"); 
    	}
    }  

    void withdraw(double d) {  
        if( amount < d) { 
            System.out.println("Insufficient Balance");  
        } else {  
            amount -= d;  
            System.out.println(d + " withdrawn");  
        }  
    }  

    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }  

    void display() {
        System.out.println("Bank name"+ " "+Bankname+" "+account_no + " " + accountHolder + " " + amount);
    }  
}  

