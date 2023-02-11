package section3_1;

public class CheckPositivity {

	public static void main(String[] args) {
		checkPositivity3(5);

	}

	public static void checkPositivity1(int number) {

		if (number > 2) {
			System.out.println(number + " number is bigger than 2");

		} else if (number == 2) {

			System.out.println(number + " number is equal to 2.");

		} else {
			System.out.println(number + " number is smaller than 2");
		}

	}

	public static void checkPositivity2(int number) {

		if (number > 0) {
			System.out.println(number + " is a positive number.");

		} else {
			if (number == 0) {
				System.out.println(number + " is a zero!");
			} else {
				System.out.println(number + " is a negative number!");
			}
		}

	}

	public static void checkPositivity3(int number) {
		if (number >= 0) {
			// if it is greater or equal to 0
			if (number > 0) {
				System.out.println(number + " number is positive number.");
			} else {
				System.out.println(number + " number is zero.");
			}

		} else {
			System.out.println(number + " number is a negative number");
		}

	}
}