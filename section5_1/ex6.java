package section5_1;

public class ex6 {

	
	public static void main(String[] args) {
		
		
		int [] nums = {1,5,10,48,6,7,2};
		
		System.out.println(evenornot(nums,54));
			 
			 
		 }
		
	

	public static void  arr1 ( ) {
		
		
		int [] numbers = {8,2,5,1,5};
		int sum= 0;
		
		for (int i  =0 ; i < numbers.length ; i++) {
			
		//	System.out.println(numbers[i]);
			sum= sum + (numbers[i]);
			
	
			
			
			
		}
		System.out.println(sum);
	
	}
	
	
	
	public static boolean evenornot(int []nums , int target) {
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			for (int b =0 ; b < nums.length ; b++) {
				
				if (nums[i]+nums[b] == target && i !=b) {
					
					return true;
				}
				
			}
			
			
		}
		return false;
		
		
		
		
		
	}
	
}


