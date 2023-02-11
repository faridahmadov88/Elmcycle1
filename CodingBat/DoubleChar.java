package CodingBat;

public class DoubleChar {

	public static void main(String[] args) {

		
		char [] arr = {'1','2','3','4'};
		String str = "the book contains pages";
		
		String pages= str.copyValueOf(arr, 1, 2);
		
		System.out.println("the book contains "+ pages + " pages.");
		
		//"Python Exercises" ends with "se"? false                                                                      
		//"Python Exercise" ends with "se"? true
		
		
		String str3 = "Python exercises";
		String str4 = "Python exercise";
		
		System.out.println("Python Exercises ends with se? " + str3.endsWith("se"));
		
		//"Stephen Edwin King" equals "Walter Winchell"? false                                                          
		//"Stephen Edwin King" equals "stephen edwin king"? true 
		
		
		String str5 = "Stephen Edwin King";
		String str6 = "stephen edwin king";
		System.out.println(str5.equalsIgnoreCase(str6));
		
		
		
		String str8 = "Help";
		
		
		System.out.println(str8.charAt(0).concat(str8.charAt(1)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
