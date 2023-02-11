package CodingBat;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {
		
	//	exercise();
		//exercise2();
	//	exercise3();
		factorial();

	}
public static void exercise () {
	Scanner input =new Scanner (System.in);
	System.out.println("please enter number");
	int num =input.nextInt();
	
	while(num < 1 || num > 10) {
		System.out.println("please enter number between 1 and 10:");
		  num = input .nextInt();
	
	}
	
	System.out.println("number is between 1 and 10");
	
}
public static void exercise2 () {
	int num=0;
	int sum =0;
	while (num <=10) {
		System.out.println(num);
		num++;
		sum +=num;
	}
	System.out.println(sum);
	
	
}
public static void exercise3 () {
	Scanner input =new Scanner (System.in);
	System.out.println("please enter number");
	
	int num = input.nextInt();
	int counter=1;
	
	while (counter <= 10) {
		
		System.out.println(counter *num);
		counter++;
	
	}
	
	
	
	
	
}




public static void factorial () {
	Scanner input =new Scanner (System.in);
	System.out.println("please enter number");
	
	int fact = input.nextInt();
	int counter=1;
	
	
	while (counter <= fact) {
		
		fact= fact *counter;
		counter++;
	
	}
	
	System.out.println("Factorial of "+counter +" is: "+fact);
	
	
	
}















}