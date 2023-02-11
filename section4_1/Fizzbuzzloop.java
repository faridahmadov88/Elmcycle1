package section4_1;

import java.util.Scanner;

public class Fizzbuzzloop {

	public static void main(String[] args) {
		

		int num = 1;
		Scanner scan = new Scanner(System.in);

		while (num <= 16) {

			if (num % 3 == 0) {
				System.out.print(" ");
				System.out.print("Fizz");

			}
			
			if (num % 5 == 0) {
				System.out.print(" ");
				System.out.print("Buzz");
			}
			
			if (num % 3 != 0 && num % 5 != 0)
				System.out.print(" ");
			    System.out.print(num);
		}

		num++;
	}

}
