package section6_2;

import java.util.*;

public class paranthesis {

	public static void main(String[] args) {
		
		System.out.println(paranthesis("(2 + 1) * 2)"));
	}
		
public static boolean paranthesis (String str) {
	int left = 0;
	int right = 0;
	
	
	
	char[] arr = str.toCharArray();
	Arrays.sort(arr);
	System.out.println(arr);
	int lidx = str.indexOf('(');
	int ridx = str.indexOf(')');

	for (int i = 0; i < arr.length; i++) {
		 System.out.println(arr[i]);

		if (arr[i] == '(') {

			left = left + 1;
			System.out.println(left);
		}if (arr[i] == ')') {
			right += 1;
			System.out.println(right);

		}

		if (left == right && ridx>lidx) {
			return true;
		}
	}

	return false;

	

		
	}

}
