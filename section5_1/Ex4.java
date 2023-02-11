package section5_1;

public class Ex4 {

	public static void main(String[] args) {
		
		
		
	}
		public static boolean isThere(int [] arr, int target) {
			
			for (int i = 0; i<arr.length; i++) {
				
				for (int a = 0; a < arr.length; a++) {
					
					if(arr[i] + arr[a] == target && i!=a) {
						
						return true;
					}
					
				}
				
			}
			return false;
			
		



	}

}
