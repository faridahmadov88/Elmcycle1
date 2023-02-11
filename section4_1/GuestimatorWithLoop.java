package section4_1;

import java.util.Scanner;

public class GuestimatorWithLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int hiddenNum =10;
		int counts = 0;
	
		while (true) {
			System.out.print("Please enter number:");
		
			int guess = input.nextInt();
		
			
			if ( hiddenNum == guess) {
				
				System.out.println("Congratulations! You guessed the right number!");
				
			}else if (hiddenNum > guess) {
				
				System.out.println("I'm sorry. Your guess is lower than the secret number.");
				
			}else if (hiddenNum < guess) {
				
				System.out.println("I'm sorry. Your guess is higher than the secret number.");
			}
			
			
		}
		
	}
	
	}
	
	

