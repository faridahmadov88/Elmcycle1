package section3_1;

import java.util.Scanner;

public class SmartScanner {

	public static void main(String[] args) {
		smartScan();

	}

	/**
	 * Create a method that verifies the user's input to be of double before
	 * anything else test values : 2.5,-2,"test",k
	 */
	public static void smartScan() {

		double userInput;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input a floating point number :");
		if (!scanner.hasNextDouble()) {
			System.out.println("The value you entered is not a floating point number.");
			return;
		}

		userInput = scanner.nextDouble();

		System.out.println(userInput + " is a valid floating point number.");

	}

}
