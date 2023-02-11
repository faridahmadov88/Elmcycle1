package dayInfinity;
import java.util.Scanner;

public class coinMachine {

	public static void main (String [] args){
		
		
		Scanner in = new Scanner(System.in);
		
		int pennies;
		int nickels  ;
		int dimes  ;
		
		int quarters ;
		
		System.out.println("how many pennies :");
		pennies = in.nextInt();
		System.out.println("how many nickels: ");
		nickels = in.nextInt();
		nickels = nickels *5;
		System.out.println("how many dimes :");
		dimes = in.nextInt();
		dimes = dimes* 10;
		System.out.println("how many quarters :");
		quarters = in.nextInt();
		quarters = quarters *25;
		
		int totalCents = pennies+nickels +dimes+quarters;
		System.out.println("you have total of "+ totalCents + " cents.");
		int percentTotalCents = totalCents /10;
		System.out.println("The machine charges you 10%, which is "+ percentTotalCents+" cents.");
		int afterPercentOff= totalCents-percentTotalCents;
		System.out.println("This leaves you with "+afterPercentOff+" cents.");
		
		int dollar = afterPercentOff / 100;
		//System.out.println("This makes " + dollar + " dollars," );
		int revQuarter = afterPercentOff % 100 /25;
		//System.out.println("This makes " + dollar + " dollars,"+ revQuarter +"quarters." );
		int reversedNickels = revQuarter  /5;
		System.out.println("This makes " + dollar + " dollars,"+ revQuarter +"quarters."+reversedNickels+ "nickels" );
		
	}
	
	
	
	
	
	
	
}
