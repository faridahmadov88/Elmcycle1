package CodingBat;
//*Provide 2 integers input by using Scanner class

//Your code should add all numbers from start(included) until end (exclued) and print sum;
//If end point less than start point. Print a message: "End point cannot be less than Start point!"
//If end point equals to start point then sum will be 0

import java.util.Arrays;
import java.util.Scanner;

public class Shalina {

	public static void main(String[] args) {

		System.out.println(toThePower(2, 3));
	}

	public static int toThePower(int a, int b) {

		// 0 (zero) is a special unique case,
		// therefore we can create an initial conditional check
		// and if user asks to return a value to the power of 0
		// we'll just retun '1', and not even bother with the rest of the method
		if (b == 0) {
			return 1;
		}

		// a ^ b (a to the power of b)
		// 2 ^ 3 = 2 * 2 * 2 = 8 => a * a * a (b times, which is 3)
		// 3 ^ 2 = 3 * 3 = 9 => a * a (b times, which is 2)

		int poweredUpValue = 0;

		// create a loop that repeats 3 times
		for (int i = 1; i <= b; i++) {

			
			 if (i == 1) { poweredUpValue = a * 1; continue; }
			  
			 
			poweredUpValue = poweredUpValue * a;

		}

		return poweredUpValue;
	}
}