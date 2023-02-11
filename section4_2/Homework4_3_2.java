package section4_2;

import java.util.Scanner;

public class Homework4_3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		char respond;
		
		do {
			
			System.out.println("Input number 1:");
			int num1 =input.nextInt();
			System.out.println("Input number 2:");
			int num2 =input.nextInt();
			System.out.println("The total is:"+(num1+num2));
			System.out.println("Do you wish to continue (Y/N):");
			 respond =input.next().charAt(0);
			
			
			
		}while (respond =='Y');
				System.out.println("The calculator is terminated.");
		
		
		

	}

}
