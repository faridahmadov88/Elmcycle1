package section3_1;

import java.util.Scanner;

public class TempratureConverter_v3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input the degrees: ");

		int degrees = in.nextInt();

		System.out.println("Please input the scale (C for Celsius or F for Fahrenheit):");
		char choise = in.next().charAt(0);

		if (choise == 'C') {
			celciusToF(degrees);
		} else if (choise == 'F') {
			Ftocelcius(degrees);

		}

	}

	public static void celciusToF(int degrees) {
		int fahrenheit = (int) (degrees * 9 / 5.0 + 32);
		System.out.println(degrees + " Celsius is equal to " + fahrenheit + " Fahrenheit ");

	}

	public static void Ftocelcius(int degrees) {
		int celcius = (int) ((degrees - 32) * 5) / 9;
		System.out.println(degrees + " Fahrenheit  is equal to " + celcius + " Celcius ");
	}
}
//public static void celciusCon () {
//	Scanner in= new Scanner(System.in);
//	double c;
//	double f;
//	
//	System.out.print("Please enter Celsius temp: ");
//	c = in.nextDouble();
//	f = degrees*9/5.0+32;
