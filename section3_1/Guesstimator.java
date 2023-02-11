package section3_1;

import java.util.Scanner;

public class Guesstimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letsPlay();

	}

	public static void letsPlay() {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		checker(number);

	}

	public static void checker(int number) {
		int secNum = 6;
		if (number == 6) {
			System.out.println("Congratulations! You guessed the right number!");
			System.out.println("The secret number is " + secNum);
		} else {
			System.out.println("I'm sorry. Your guess is wrong and it is greater than the secret number.\r\n"
					+ "The secret number is " + secNum);
		}

	}

}
