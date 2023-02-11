package day_03;
import java.util.Scanner;
public class FindEach {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner(System.in);
		int number;
		int number100;
		int number10;
		int number1;
		
		System.out.println("Please type number");
		number = scan.nextInt();
		number100= number /100;
		number10= number /10;
		number1= number /1;
		
		System.out.println("there are:"+number100+" "+ "hundreds"+" "+  + number10 +" tens"+ " singles "+ number1 );
		
		
		
		//System.out.println("there are "+ number10 );
		
		

	}

}
