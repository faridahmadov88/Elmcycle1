package section1_3;

public class MyTimeProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int currentHour = 23;
		int currentMinute = 59;
		    System.out.println("Current time is " + currentHour + ":" + currentMinute + ".");
		    
		    int hoursLeft = 24 -currentHour;
		    int minutesLeft = 60 - currentMinute ;
		    int totalMinutesLeft = hoursLeft * 60 +minutesLeft ;
		    int totalSecondsLeft = (hoursLeft * 60 +minutesLeft) *60;
		    System.out.println("There are " +hoursLeft+" hours and " + minutesLeft+ " minutes or " + totalMinutesLeft + " minutes or "+totalSecondsLeft +"seconds left until the end of the day.");
		
	}

}
