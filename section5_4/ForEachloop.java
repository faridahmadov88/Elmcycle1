package section5_4;
import java.util.Arrays;
public class ForEachloop {

	public static void main(String[] args) {
		
		
		
		int arr [][] = { {2,3,5,6,1,11,-6},{9,8,-45} };
		
		
		for ( int [] nums: arr) {
		//	System.out.println(Arrays.deepToString(arr));
			
			for (int number: nums) {
				System.out.println((number));
				
				
			}
			
		}
		
		

	}


}