package section6_2;

import java.util.Arrays;

public class Homework6_2_3 {

	public static void main(String[] args) {
		//hasCorrectParenthesis() accepts a single String argument and returns a boolean that is true if the String parameter has ')' (closed parenthesis) for each '(' (open parenthesis). 
		//If the String is null or empty, or it doesn't have parenthesis at all, it returns true. For example: 

	//	System.out.println(reverseTheString("abc"));
	//	System.out.println(palindrome(""));
	//	System.out.println(areAnagrams("caat", "taac"));
System.out.println(hasCorrectParenthesis("Java SE (Standard Edition"));
}

	public static String reverseTheString(String str) {
		String reversed = "";
		
		if (str.length()<1) {
			return str="";
		}else {

		for (int i = str.length() - 1; i >= 0; i--) {

			reversed = reversed + str.charAt(i);

		}

		return reversed;
		}

	}
	
	public static boolean palindrome(String str) {
		
		String reversed = "";
		if( str==null) {
			return true;
		}
		if(str.length()<1) {
			return true;
		}
		for (int i = str.length() - 1; i>= 0; i--) {
			
			reversed = reversed + str.charAt(i);
			
			if (reversed.equals(str)) {
				return true;
			}
		}
		return false;
		
		
	}
	
	public static boolean areAnagrams(String str1 ,String str2) {
		//using toLowercase to bring strings to same level.
		str1 = str1.toLowerCase();
		str2= str2.toLowerCase();
		//then we need to check if their length is same or not
		if(str1.length()==str2.length()) {
			//if their length is equal then we will convert them to char array
			char [] array1 = str1.toCharArray();
			char [] array2 = str2.toCharArray();
			//after we converted them to char , now we can sort them
			Arrays.sort(array1);
			Arrays.sort(array2);
			array1.equals(array2);
			return true;
		}else {
		
		
		
		
		return false;
		}
	}
	
	public static boolean hasCorrectParenthesis(String arg) {
		int left=0;
		int right=0;
				
		for(int i = 0 ; i< arg.length()-1; i++) {
			
			System.out.println(arg.charAt(i));
			if(arg.charAt(i)==('(')){
				left +=1;
				System.out.println(left);
			}
			if (arg.charAt(i)==(')')) {
				right+=1;
				System.out.println(right);
			}
			if (left==right) {
				return true;
			}
				
			}
			
		return false;
	}
}