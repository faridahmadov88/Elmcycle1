package section2_3;

public class ExperimentingWithMethods {

	public static void printHi() {
		System.out.println("Hi");

		
	}
	
	public static void printBye () {
		
		System.out.println("bye");
		System.out.println("bye");
		
	}
	
	public static void main (String [] args) {
		System.out.println("Print first");
		printHi();
		printBye ();
		System.out.println("Print last");
	}
}