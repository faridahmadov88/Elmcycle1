package section5_2;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		
		//given a double Array,
		//Write a code that increases each element of given array to square of it
		//then assign those to corresponding indexes.
		
		double [] arr = {3.0,5.0,-8.0,10};
		double sum = 0;
		
		for (int i = 0; i < arr.length ; i++ ) {
			
			
			arr[i]= Math.pow(arr[i], 2);
			
		
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
