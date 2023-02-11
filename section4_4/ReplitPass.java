package section4_4;

import java.util.Scanner;

public class ReplitPass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 
		   System.out.println("Please enter start point:");
		    int startPoint =input.nextInt();
		    
		    System.out.println("Please enter end point:") ;
		    int endPoint =input.nextInt() ;
		   
		    if (endPoint < startPoint) {
		       System.out.println("End point cannot be less than Start point!");
		      return;
		    } 
		    if (endPoint==startPoint){
		      System.out.println();//this enter makes problem
		    }
		     
		    int sum= 0 ;
		    
		    while (startPoint < endPoint) {

		      sum = sum + startPoint;

		      startPoint++;
		    

		    }
		    System.out.println("Sum: " + sum);
		   

		  }
		

		  }



