package dayInfinity;
import java.util.Scanner;


public class MyTime_ver5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What time do you started working :");
		
		double startTime = scan.nextDouble();
		
        System.out.print("What is a current time :");
		
		double currentTime = scan.nextDouble();
		
		double result = currentTime - startTime;
		
		System.out.println("Time took to complete the task : " + result);
	}
	 public static void calculateAndPrint(int startTime, int currentTime) {
		 
	 }
	

}
