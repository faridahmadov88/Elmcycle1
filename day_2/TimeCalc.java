package day_2;

public class TimeCalc {
	
	public static void main (String [] args) {
		

		int currentHour = 23;
		int currentMinute = 42;
		    System.out.println("Current time is " + currentHour + ":" + currentMinute + ".");
		    
		    
		    
		    int hoursLeft = 24 -currentHour;
		    int minutesLeft = 60-currentMinute;
		    int inTotalMinutes= hoursLeft * 60 +minutesLeft ;
		    int inTotalSecondsLeft = inTotalMinutes*60;
		   // System.out.println(hoursLeft);
		   // System.out.println(minutesLeft);
		   // System.out.println(inTotalMinutes);
		   // System.out.println(inTotalSecondsLeft);
		    System.out.println("There are " + hoursLeft + " hours and " + minutesLeft + " minutes or " + inTotalMinutes +" minutes or "+ inTotalSecondsLeft+" seconds left until end of the day." );
		
        
	}

}
