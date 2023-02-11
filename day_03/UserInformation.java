package day_03;

import java.util.Scanner;

public class UserInformation {

	public static void main (String [] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int width;
		int length;
		
		
		
		System.out.println("Please enter length : ") ;
		length=scan.nextInt();
		System.out.println("Please enter age width : ") ;
		width = scan.nextInt();
		System.out.println("Area" + length*width) ;
		System.out.println("perimeter" + (length+width)*2) ;
		
		
		
		

	}

}
