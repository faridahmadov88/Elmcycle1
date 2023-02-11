package section5_2;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		
		
		
		
		int [] arr = new int [10];

		for (int i = 0 ; i < arr.length; i++) {
			
			
			arr [i]= i;
			
			
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		int [] copy = new int [arr.length];

		for (int i = 0 ; i < copy.length ; i++ ) {
			
			copy [i]= arr[i];
			
		}
		System.out.println(Arrays.toString(copy));
		
		int[] copy3rdTo6thElements = Arrays.copyOfRange( copy, 2, 5);

		System.out.println( Arrays.toString( copy3rdTo6thElements ) );

	}

}
