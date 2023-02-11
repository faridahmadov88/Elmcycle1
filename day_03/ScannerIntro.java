package day_03;


import java.util.Scanner;


public class ScannerIntro {
	public static void main (String [] args) {
		
		int birthYear;
		String name;
		
		
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("What is your name");
		name = scan.nextLine();
		
		
		System.out.println("Please enter your birth year");
		birthYear = scan.nextInt();
		
		System.out.println("hi " + name +" you are "+(2022- birthYear));
		
		
		
		
		
	}

}
