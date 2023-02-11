package section9_0;

import java.util.ArrayList;

public class uniqueLetter {

	public static void main(String[] args) {

		String word = "Google";
		System.out.println();

		ArrayList<Character> charList = new ArrayList<>();//[g,o,l,e]
		//`					[g,o,o,g,l,e]
		for (char c : word.toCharArray()) {
			//c = 'g'
			if (!charList.contains(c)) {
			charList.add(c);
			}
		}
	}

}
