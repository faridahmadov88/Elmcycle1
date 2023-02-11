package dayInfinity;

import java.util.Arrays;

public class Prac {

	public static void  main(String[] args) {
//
//		int[] arr = new int [5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			arr[i]=i+1;
//			System.out.println(arr[i]);
//			
//			String a []= {"Fred","John"};
//			a[0]= "John";
//			
//			String b[]= {"Fred"};
//			a[1] = b[0];
//			Arrays.toString(a);
//			System.out.println(Arrays.toString(a));
//			System.out.println(a[0]+ " " + a[1]);
//			
//			

		int arr[] = { 1, 3, 10, 9, 5, 6, 7, 8 };
		
		System.out.println(arr(arr,25));
		
	
}
	
	public static boolean arr(int [] arr, int target) {
		
		for (int i = 0 ; i < arr.length; i++) {
			for (int a = 0 ; a < arr.length ; a++) {
				
				if (arr[i]+arr[a]==target) {
					return true;
					
				}
			}
		}
		
		
		
		return false;
	}
}
