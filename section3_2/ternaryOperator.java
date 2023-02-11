package section3_2;

public class ternaryOperator {

	public static void main(String[] args) {
	//	ifElse(4);
		ternary(3);
	}

	
	
	
	
	
public static void ifDemo (int num	) {
	
	
	
	
	
}
	
	
public static void ifElse(int number) {
	
		if (number % 2==0) {
			System.out.println("this is even number");
		}else 
			System.out.println("this is odd number");
		
	}
	
	public static void ternary(int number) {
	
	
		//System.out.println( (number % 2 == 0) ?"This number is even" : "This number is odd");
		String message =(number % 2 == 0) ? "This number is even " : "This number is odd";
		System.out.println(message);
	}
	
}