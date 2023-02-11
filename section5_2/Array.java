package section5_2;

public class Array {

	public static void main(String[] args) {
		
		
		
		int array[] = {1,2,3,4,8};
		  
		search(array,8);
		sum(array);
		
	
		
		
		
		
		
		
		

	}

	public static void sum (int [] arr) {
		int total = 0;
		for (int i = 0 ; i <arr.length ; i++) {
			
			total = total+arr[i];
			
			
		}
		System.out.println(total);
	}
	
	
	
	
	
	
	public static int search (int [] array ,int target) {
		
		for (int i=0; i < array.length; i++ ) {
			
			if (array[i]==target) {
				
				return i;
			}
			
		}
		return target;
		
		
		
	}
	
	
	
	
	
}
