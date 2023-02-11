package section6_2;
import java.util.Arrays;
public class practicemoreandmore {

	public static void main(String[] args) {
	
	//System.out.println(isEmpty("ds"));
	
	
	String arr[] = {"Fidan","Farid","Leyla"};
	
	lengthAll(arr);

	}
	
	
	public static boolean isEmpty(String str) {
		
		if ((str.length()==0 )){
			
			return false;
			
		}else 
		return true;
		
	}
	
	//lengthAll() method has a single String array (String[]) parameter and it returns an int as the sum of lengths of Strings within the array
	public static void lengthAll(String [] arr) {
		
		int sum= 0;
		
		
		for (int i = 0 ; i < arr.length-1; i++) {
			
			
			System.out.println();
			
		}
		
		System.out.println(sum);
		
	}
}