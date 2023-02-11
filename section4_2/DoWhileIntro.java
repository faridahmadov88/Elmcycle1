package section4_2;

import java.util.Scanner;

public class DoWhileIntro {

	public static void main(String[] args) {
	
		
		do {
			System.out.println("Please enter digit :");
			Scanner input = new Scanner(System.in);
			int password = input.nextInt();
			System.out.println(password);
			
			if (password == storedPassword) {
				System.out.println("You logged in.");
				return;
			}if (password == storedPassword) {
				System.out.println("Please enter 4 digit password:");
				 password = input.nextInt();
			}
				 
			}while(true);
			
		
		}
		
		
		
		

	}
	
	
	


