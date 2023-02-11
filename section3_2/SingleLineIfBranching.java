package section3_2;

import java.util.Scanner;

public class SingleLineIfBranching {

	public static void main(String[] args) {
		// custom(0);
		// ternary(8);
		custom3();
	}

	public static void custom(int number) {

		String sign = (number > 0) ? "Positive" : (number == 0) ? "Zero" : "negative";
		System.out.println(sign);
//		if (number>0) {
//			sign= "Positive";
//			System.out.println(sign);
//		}else if (number==0) {
//			sign="Zero";
//			System.out.println(sign);
//		}else {
//			sign="Negative";
//			System.out.println(sign);
	}

	public static void custom2() {
		// importing scanner
		Scanner input = new Scanner(System.in);

		System.out.println("please input 2 values,java will print out greatest one");
		int num1 = input.nextInt();
		System.out.println("please input 2 values,java will print out greatest one");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1==num2){
			System.out.println("numbers are equal");
		}else {
			System.out.println(num2);
		}
		
		return;
	}
	public static void custom3 () {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter quantity from 1-20 :");
		int quantity = input.nextInt()*100;
		
		
		if (quantity>1000) {
			int quantityAfterDiscount= (quantity*100); 
			System.out.println("you get discount price will equal to"+ (quantityAfterDiscount-(.1 * quantityAfterDiscount*100)));
		}else
			System.out.println("no discount");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}