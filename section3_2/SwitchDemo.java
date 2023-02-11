package section3_2;

public class SwitchDemo {

	public static void main(String[] args) {
		//daysOfWeel(9);
		weekDayOrWeekEnd(6);
		//switchdays(4);
		
		

	}
	/**
	 * This method accepts an int as a parameter
	 * based on this day value it prints name of the day
	 * @param day
	 */
	public static void daysOfWeel(int day) {
		
		if (day ==1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		}else if (day == 3) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");			
		}else if (day == 6) {
			System.out.println("Saturday");			
		}else if (day==7) {
			System.out.println("Synday");
		}else {
			System.out.println("This is not a week day");
		}
		
	}
	public static void switchdays (int day) {
		
		switch (day) {
			
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Not a week day.");
			
		}
	}
	public static void weekDayOrWeekEnd(int day) {

		switch (day) {
			
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5 :
			System.out.println("Weekday");
			break;
		case 6:
			
		case 7:
			System.out.println("Weekend");
			break;
		default :
			System.out.println("Not a week day.");
			
		}
		
	}
}	