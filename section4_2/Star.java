package section4_2;

import java.util.Scanner;
import java.lang.*;

public class Star {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		do {
			System.out.println("Please input a positive integer:");
			int positive = scan.nextInt();
			
			if(positive > 0 ) {
				System.out.println(positive +" is a positive integer.");
				//primeorNot (positive);
				return;
				
			} else  {
				System.out.println(positive +" is not a positive integer.");
			}
			
				
			}while(positive > 0 && );
			
		
		}
		

	}

}
