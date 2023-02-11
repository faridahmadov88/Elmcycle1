package section5_1;
import java.util.Arrays;
public class ArrayMethods {

	public static void main(String[] args) {
		
		
		
		
		//length => returns length
		//Arrays.toString() => converts arrays to string
		
		
		
		
		int [] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		//Arrays.copyOf() => it copies original array
		
		int [] copy = Arrays.copyOf(numbers, numbers.length);
		
		System.out.println(Arrays.toString(copy));
		
		//Arrays.copyOfRange(original array , from which index(included) , until index(excluded))

		int [] copyRange = Arrays.copyOfRange(numbers, 0, 5);
		System.out.println(Arrays.toString(copyRange));
		
		//Arrays.sort() = > sorting numbers
		
		int [] values = {8,1,3,45,-10,78};
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		//find difference between largest and smallest number
		
		int diff = values [values.length-1] - values[0];
		System.out.println(diff);
		

	}

}
