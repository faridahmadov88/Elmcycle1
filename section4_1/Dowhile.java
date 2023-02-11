package section4_1;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//absolute();
	//	fizzbazz();
		naturalNumbersInReverse();

	}
	public static void  practice () {
	Scanner input = new Scanner (System.in);
		
		
		System.out.println("Please enter number:");
		int negative =input.nextInt();
		//also number needs to be between 1 and 10
		
	
		while (negative >0) {
			
			if(negative >= 1 && negative <= 10) {
				
				System.out.println("number is between 1 and 10");
			}
			
			System.out.println("Number you entered is positive please enter negative number:");
			negative = input.nextInt();
		}
		
		System.out.println("you entered negative number");
	}

	
	
	
	
	
	
	public static void absolute () {
		Scanner input = new Scanner (System.in);
		System.out.println("Please  enter negative number");
		
		int num= input.nextInt();
		
		if (num == 0) {
			System.out.println("You entered zero ");
			return;
		} 
	
		
		while (num >0) {
			System.out.println("Number you entered is positive ,please enter negative number: ");
			 num= input.nextInt();
		}
		int result= num *-1;
		System.out.println("Absolute value of number you entered is :"+ result);
	}

	
	
	
	
	public static void fizzbazz() {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please  enter  number");
		
		int num= input.nextInt();
		System.out.println("please enter limit :");
		int limit = input.nextInt();
		
		while (num > limit) {
			
			if (num % 3 == 0) {
				
				System.out.print(" Fizz ");
				
			
			}
			
			if (num % 5 == 0) {
				System.out.print(" Buzz ");
				
			}
			
			if  ( num % 3 != 0 && num % 5 != 0) {
				System.out.print(num);
			}
			
			num--;
		}
		System.out.println(" ");
	}

	
	public static void naturalNumbersInReverse () {
		Scanner input = new Scanner (System.in);
		System.out.println("Please  enter  number");
		int num = input.nextInt();
		
		
		while (num >= 1) {
			
			System.out.print(num *-1);
			num--;
			
		}
		System.out.println("complete");
		
		
	}

}

