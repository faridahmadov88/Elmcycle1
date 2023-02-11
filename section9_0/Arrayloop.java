package section9_0;
import java.util.ArrayList;
public class Arrayloop {

	public static void main(String[] args) {
		
		
		
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(9);
		numbers.add(18);
		numbers.add(20);
		numbers.add(7);
		numbers.add(5);

		ArrayList <Integer> nums = new ArrayList<>();
		for (Integer arr:numbers) {
			if (arr%2==0) {
				nums.add(arr);
			}
		}
		
		
		System.out.println(nums);

	}
	

}
