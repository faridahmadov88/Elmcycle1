package section3_4;
import java.util.Scanner;
public class ElmStoreFromRedmi {
	
	
	/**ELM Book Store
**This exercise covers almost everything we have covered. Be patient and try to solve :)

This is a store that users can buy purchase educational materials.
For special users store provides membership card
There are 3 types of membership card
Silver - provides 5% discount
Gold - provides 10% discount
Platinum - 20% discount

You'll need to create a Scanner object and import it from util package. 

Declare:
String varibales: book1, book2, book3, membershipType, report
double varibales: price1, price2, price3, subTotal, totalPrice
boolean variable: isMember


Once user starts shopping Store greets them. 
Then user enter what they want to buy and its price. If user has any membership card you should give discount based on card type. And print subtotal before discount and print total after discount. 
*If total is less than 0. Print a message "Invalid purchase!!!" and stop the code by the help of return

Then create a custom method which accepts 3 double arguments and returns the greatest one. Attach that greatest value to you the report as "Most Expensive Book Value"

Take a look at examples

Example1:
"Welcome to ELM store!"

"Please enter book1 name and price:"
Java
45.5

"Please enter book2 name and price:"
Selenium
25.0

"Please enter book3 name and price:"
SQL
15.5

"Do you have membership card?"
true

"What kind of membership card do you have?"
gold

Book1: Java - $45.5, Book2: Selenium - $25.0, Book3:SQL - $15.5 | Most Expensive Book Value - $45.5

Subtotal: $86.0
Total: $73.1

Example2:
"Welcome to ELM store!"

"Please enter book1 name and price:"
Java
30.4

"Please enter book2 name and price:"
Selenium
20.2

"Please enter book3 name and price:"
SQL
14.5

Do you have membershib card?
false

Book1: Java - $30.3, Book2: Selenium - $15.0, Book3:SQL - $19.8 | Most Expensive Book Value - $30.3

Subtotal: $65.1
Total: $65.1
*/
	
	public static void main(String []args) {
		
		Scanner input =new Scanner(System.in);
		String  book1, book2, book3, membershipType, report ;
		double  price1, price2, price3, subTotal, totalPrice ;
		boolean  isMember;
		System.out.println("Welcome to ELM store!");
		System.out.println("Please enter book name and price:");
		book1 =input.next();
		price1=input.nextDouble();
		System.out.println("Please enter book2 name and price:");
		book2=input.next();
		price2=input.nextDouble();
		System.out.println("Please enter book3 name and price:");
		book3=input.next();
		price3=input.nextDouble();
		System.out.println(isMember());
		
	}

	public static boolean isMember () {
		Scanner input =new Scanner(System.in);
		System.out.println("Do you have membership card?");
		return true;
	}
	
}

