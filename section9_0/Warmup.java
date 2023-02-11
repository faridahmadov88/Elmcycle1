package section9_0;

import java.util.ArrayList;
import java.util.Collections;

public class Warmup {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(78);
		numbers.add(-1);
		numbers.add(-1);
		numbers.add(0);

		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(10);
		numbers2.add(81);
		numbers2.add(3);
		numbers2.add(9);
		numbers2.add(-1);
		numbers2.add(50);

		System.out.println(returnCommons(numbers,numbers2));

	}

	public static ArrayList<Integer> returnCommons(ArrayList<Integer> numbers,ArrayList<Integer> numbers2) {
		ArrayList<Integer> numbers3 = new ArrayList<>();
		for (Integer arr : numbers) {
			if(numbers2.contains(arr)) {
				numbers3.add(arr);
			}
			
				
			
			
		}
		return numbers3;
		
		
		

	}
}
