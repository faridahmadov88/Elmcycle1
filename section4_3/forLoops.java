package section4_3;
import java.util.Scanner;
public class forLoops {

	public static void main(String[] args) {
		//custom ();
		
		/*
		 * reverse the given string
		 * hello - olleh
		 * o
		 * l
		 * l
		 * e
		 * h
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));

		}
		
			
		}
		
		
		
		
		
	
		
	

	

	public static void custom () {
		System.out.println("Please enter number:");
		  Scanner input =new Scanner(System.in);
		  int num = input.nextInt();
		    int counter = 0;
		    int sum = 0;
				while (counter <= num) {
		      if (num>0){
		        sum = sum + counter;

					counter++;
		        
		      }else {
		        System.out.println("Invalid Input!");
		      }

					
				}
				System.out.println("Sum : " + sum);
		    
		  }
		
	}

		



