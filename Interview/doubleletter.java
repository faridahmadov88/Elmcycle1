package Interview;

import java.util.*;

public class doubleletter {

	public static void main(String[] args) {

		// find out how many times double letters repeated in string

		String str = "aabbbccc";
		char[] arr = new char[str.length()];
		System.out.println(arr);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}

			}
			System.out.println(count);
		}

	}
}