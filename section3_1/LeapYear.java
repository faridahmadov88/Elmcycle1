package section3_1;
import java.util.Scanner;
public class LeapYear {
	public static void main (String [] args) {
		custom(2021);
	}
	
	
	
	
	public static void custom(int year) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a year to check:");
		 year =input.nextInt();
		
		if (year %4==00) {
			System.out.print(year+" is a leap year.");
		}else 
			System.out.print(year +" is not a leap year.");
		
	}

}
