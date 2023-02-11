package section003;
import java.util.Scanner;
public class MethodPractices {
	 /* Program: Email Assistant
		 * Requirements:
		 * 		Write a program that will ask you to login to your email
		 * 	using login and password.
		 * 		Then the program will tell you how many unread emails you currently
		 * 	and it will ask you how many emails have you finished reading now.
		 * 		After you tell the program how many emails you read,
		 * 	it will print out how many emails are still left to read.
		 * 
		 * Specifications:
		 * 		When you login, the program should ask for your username and password,
		 * 	and then print it to the screen saying: 
		 * 	"You've successfully logged in with this 'username' and 'password'."
		 * 
		 * 		When you check your email, the program will randomly generate a number
		 * 	of 'unread' emails (from 0 to 100).
		 * 		Then it will print and ask how many emails you are reading, 
		 * 	and will simply find the difference between emails unread and emails read
		 * 	and print out: "You still have 'number of emails' emails to read."
		 */
		

	public static void main(String[] args) {
		login();
		unreadEmail();
		
		
		
	}
	public static void unreadEmail() {
		int  unreadEmail =(int) (Math.random()* 100);
		
		
		System.out.print("How many emails have you read? ");
		Scanner input = new Scanner(System.in);
		int readEmails = input.nextInt();
		int remainingUnreadEmails =unreadEmail- readEmails;
		
		System.out.println("\"You still have "+remainingUnreadEmails+"  emails to read.");
		
		
	}
	
	
	
	public static void login() {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to your Email");
		
		System.out.println("Please enter your username: ");
		String username = input.nextLine();
				
		System.out.println("Please enter your password: ");
		String password = input.nextLine();
		
		System.out.println("You've successfully logged in with this " + username + " and " + password);

		
		
		
		
	}

}
    
