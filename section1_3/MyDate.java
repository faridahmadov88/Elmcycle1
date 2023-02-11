package section1_3;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String weekDay = "Friday";
		byte monthDay = 5;
		 
		String month = "July" ;


		short year = 2019;

		System.out.println("EU format:");

		System.out.print("Today is"+" ");

		System.out.print(weekDay+",");

		System.out.println(monthDay+"th of"+" " +month +" " +year);

		System.out.println("US format:");

		System.out.println("Today is"+" "+ weekDay+","+ month+" "+ monthDay+"th"+" "+year);

		 

	}

}
