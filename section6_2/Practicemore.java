package section6_2;

public class Practicemore {

	public static void main(String[] args) {
		
		
		String str = "I eat apple everyday.";
		
		String returnVowel = "";
		for ( int i = 0 ; i < str.length(); i ++) {
			
			// System.out.println(str.charAt(i));
			 
			 if (str.charAt(i) == 'i' || str.charAt(i) == 'e') {
		
				 returnVowel= returnVowel + str.charAt(i);
				 
				 
			 }
			
		
		
	}
		 System.out.println(returnVowel);
	}
}
