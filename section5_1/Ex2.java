package section5_1;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		
		int[] a = new int[10]; //1,2,3,4,5
		int idx = 0;
		int value = 0;
		
		while (idx < a.length) {
			
			a[idx] = value;
			idx++;
			value+=2;
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
		for (int  index = 0; index < a.length ; index ++) {
			
			a[index]++;
			
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	
	
public static void swap(String[] args) {
	//swap the values at index 0 and 1
			String [] names = {"Fred", "John"}; //{"John", "John"}
			
			System.out.println(names[0] +" " + names[1]);
			String temp = names[0]; //"Fred"
			names [0] = names[1];
			names[1] = temp;
			
			System.out.println(names[0] +" " + names[1]);
}
}
