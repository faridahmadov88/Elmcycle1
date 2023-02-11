package day_2;

public class practices {
	public static void main (String[] args) {
		
		
		//4. You will be provided days. I want you to calculate how many years, months, weeks and days is in given number
				int totalDays = 439; // 1 year(365), 2 months(30), 2 weeks, 0 days
				
				//int totalDays = 1523; // 1 year(365), 2 months(30), 2 weeks, 0 days
				// 439 - 1*365 = 74
				int years = totalDays / 365; //1
				
				totalDays = totalDays - years*365; //74
				
				int months = totalDays / 30; //2
				
				totalDays = totalDays - months * 30; // 14
						
				int weeks = totalDays / 7; //2
				
				totalDays = totalDays - weeks * 7;
				
				int days = totalDays / 1;
						
				System.out.println(years +" years, " + months + " months, "+ weeks+ " weeks, "+ days + " days" );
		
		
	}

}
