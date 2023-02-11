package section4_2;

import java.util.Scanner;

public class Homework4_3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positive = 0;
		int negative = 0;
		int zero = 0;
		char respond = 'Y';
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		do {

			System.out.println("Please input a number: ");
			int num1 = input.nextInt();
			

			if (num1 > 0) {
				positive++;
				 
			
			} else if (num1 == 0) {
				zero++;
			} else if (num1 < 0) {
				negative++;
			
			}
			if (num1 > largest) {
				largest = num1;
			}
			
			if (num1 < smallest) {
				smallest = num1;
				
			}
			
			
			System.out.println("Do you wish to continue (Y/N):");
			respond = input.next().charAt(0);

		} while (respond == 'Y');
		System.out.println("Positive numbers entered:" + positive);
		System.out.println("Negative numbers entered:" + negative);
		System.out.println("Zeros entered:" + zero);
		System.out.println("The largest number entered:" + largest);
		System.out.println("The smallest number entered:" + smallest);

	}

}