package section4_1;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {

		absolute();
		
		
		
	}
	
	public static void absolute () {
		int positive;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter negative number to convert it to positive:");
		int num =input.nextInt();
	if (num <0) {
		positive= num*-1;
		System.out.println(positive);
	}else {
		System.out.println("number is not negative");
	}
	
	
	}
	
	
	
	
	
	

}
