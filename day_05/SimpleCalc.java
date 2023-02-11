package day_05;
import java.util.Scanner;
public class SimpleCalc {

	
	public static void main(String[] args) {
		
		System.out.println("Please input 2 numbers:");
		Scanner in= new Scanner(System.in);
		int firstNum =in.nextInt();
		int secondNum =in.nextInt();
		
		add(5,5);
		sub(5,5);
		Multp(5,5);
		division (5,5);
	}

public static void add (int a, int b) {
		
		System.out.println(a+b);
	}
	
public static void sub (int a, int b) {
		
		System.out.println(a-b);

}
public static void Multp (int a, int b) {
		
		System.out.println(a*b);
}
public static void division (int a, int b) {
	
	System.out.println(a/b);
}
}