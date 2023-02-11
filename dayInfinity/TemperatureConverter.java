package dayInfinity;


import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		celciusCon ();
		
		
		

	}
	public static void celciusCon () {
		Scanner in= new Scanner(System.in);
		double c;
		double f;
		
		System.out.print("Please enter Celsius temp: ");
		c = in.nextDouble();
		f = c*9/5.0+32;
	
		
		System.out.print("Converted to F will be:  " + Math.round(f));
		
	}

}
