package section2_3;
import java.util.Scanner;
public class maximusMinimus_ver_3 {
	public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please input 3 values:");
	int number1= in.nextInt();
	int number2= in.nextInt();
	int number3 =in.nextInt();
	maximus(number1,number2,number3);
	minimus(number1,number2,number3);
	
	
	}
	public static void maximus( int number1 , int number2 , int number3) {
		int max = Math.max(number3 ,Math.max(number1, number2 ));
	
		
		System.out.println("Max= "+max);
		
		
	}
	public static void minimus(int number1, int number2, int number3) {
		int min = Math.min(number3 ,Math.min(number1, number2 ));
		System.out.println("Min= "+min);
		
		
	}

}


