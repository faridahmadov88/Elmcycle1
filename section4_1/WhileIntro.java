package section4_1;

public class WhileIntro {

	public static void main(String[] args) {
		countdown(10);
	//	multiplicationTable(5);
	}
	public static void countdown (int secondsLeft) {
		
	
		  if (secondsLeft < 0) {
		        System.out.println( "Seconds left can't be a negative number" );
		        return;
		    }
		    
		    while (secondsLeft > 0) {
		        System.out.println(secondsLeft); 
		        secondsLeft--; 
		    } 

		    System.out.println("Happy New Year!"); 
		}
	
}
