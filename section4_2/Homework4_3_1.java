package section4_2;

import java.util.Scanner;

public class Homework4_3_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		//intOrNot();
		
		do {
			System.out.println("Please input a positive integer:");
			int positive = scan.nextInt();
			
			if(positive > 0 ) {
				System.out.println(positive +" is a positive integer.");
				primeorNot (positive);
				return;
				
			} else  {
				System.out.println(positive +" is not a positive integer.");
				
				
			}
			
			
				
			}while(true);
			
		
		}
		


public static void primeorNot (int num) {
	
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}


	


