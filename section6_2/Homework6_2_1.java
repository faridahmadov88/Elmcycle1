package section6_2;

public class Homework6_2_1 {

	public static void main(String[] args) {

/*
 * 
	
	joinAll() method has a single String array (String[]) parameter and it returns a String made of all Strings within the array, separated by a comma (,) and a space ( );
	Overload lengthAll() and joinAll() so that both accept boolean, char, int and double arrays as parameters, too.
 * */		
		System.out.println(isEmpty("Farid"));
		String [] arr= {"Farid","Fidan","Sevinc"};
		System.out.println(lengthAll(arr));
		System.out.println(joinAll(arr));
	}
	
	
	public static int lengthAll(String []arr) {
		int sum= 0 ;
		
		for (String a: arr) {
			sum= sum+a.length();
		}
		return sum;
		
	}

	public static  boolean isEmpty (String str) {

		
		if (str.length()>1) {
			return true;
		}

		return false;
	}
	

	public static String joinAll(String arr[]) {
		String join = "";
		
		for (String a: arr) {
			
			join= join +a+" ,";
			
			
		}
		return join.substring(0,join.length()-2);
	}
}
