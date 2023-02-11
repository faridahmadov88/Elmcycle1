package section4_3;

import java.util.Scanner;

public class Homework4_2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		custom() ;

	}

	public static void custom() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input number");
		int number =input.nextInt();
		
		
		if (number==0 || number<0) {
			System.out.println("this is an invalid entry");
			return;
			
		}
		for (int i =1; i <= number;i++) {
			System.out.println(i);
			
			
		}
		

	}
}
