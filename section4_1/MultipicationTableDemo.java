package section4_1;

public class MultipicationTableDemo {

	public static void main(String[] args) {
		multipication(2);
		multipication(3);
		multipication(4);

	}

	/**
	 * multipilication numbers
	 * 
	 */
	public static void multipication(int number) {

		int multiplier = 2;

		while (multiplier < 10) {

			int result = number * multiplier;

			System.out.print(result + " ");

			multiplier++;
		}

		System.out.println(" ");

	}



public static void multipicationtable () {
	
}
}