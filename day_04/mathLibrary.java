package day_04;
import java.util.Scanner;

public class mathLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
			int a;
			int b;
			//int c:
			
			System.out.println("Please type first number: ");
			a = in.nextInt();
			System.out.println("Please type second number : ");
			b=in.nextInt();
		  //  int greatest = Math.max(a,b);
		    
		    
		   // int smallest =Math.min(a, b);
		  // double power = Math.pow(greatest,smallest);
		   // double squareRoot =Math.sqrt(power);
		   // System.out.println(" greatest number : "+greatest);
		   // System.out.println("power number : "+power);
		  //  System.out.println("Square root ="+squareRoot);
		   // double singleLine = Math.min(a, b),Math.max(a, b),Math.pow(greatest,smallest),Math.sqrt(power);
		    System.out.print(Math.sqrt(Math.pow(Math.min(a, b),Math.min(a, b))));
		    
					
		    //int smallest = Math.min(a, Math.min(b, Math.min(c, d)));
			
		

	}

}
