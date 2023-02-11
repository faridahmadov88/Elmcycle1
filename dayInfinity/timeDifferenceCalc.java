package dayInfinity;
import java.util.Scanner;

public class timeDifferenceCalc {
	
	public static void main (String []args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Please input your current time zone in GMT:"  );
		int currentTz=in.nextInt();
		
		System.out.print("Please input the time zone of the other city in relation to GMT:");
		int otherTz = in.nextInt();
		
		int difference =Math.abs(currentTz - otherTz);
		
		System.out.println("The time difference between Current city time Zone and Other city time zone is "+difference+" hours.");
		
	}



}
