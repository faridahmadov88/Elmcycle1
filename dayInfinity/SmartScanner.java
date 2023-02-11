package dayInfinity;

import java.util.Scanner;

public class SmartScanner {
	
	
	public static void main () {
		smartScan();
		
	}
	/**
	 * Create a method that verifies the user's input to be of double before anything else
	 */
	public static void smartScan() {
		
		double userInput;
		Scanner input =new Scanner (System.in);
		
		System.out.println("Please input a floating point number :");
		userInput =input.nextDouble();
		System.out.println(userInput + "is a valid floating point number.");
		
	}

}
