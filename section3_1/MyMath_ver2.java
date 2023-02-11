package section3_1;

public class MyMath_ver2 {

	public static void main(String[] args) {
		avrageFinder(15, 20, 35);
		ageFinder(2022, 1988);
		triangleArea(18, 6);
		sumOfDigits(23);
		areaOfTriangle(12.5, 15);
		evenOrOdd(10);
		divider(5, 5);

	}

	public static void avrageFinder(int a, int b, int c) {

		// avarage find formula is to calculate numbers then dvide it to count of
		// numbers.

		int avarage = (a + b + c) / 3;
		System.out.println("Avarage of numbers is :" + avarage);
	}

	// agefinder - finds our age from current year- year of birth.
	public static void ageFinder(int a, int b) {
		int ageFinder = (a - b);
		System.out.println("Age will be:" + ageFinder);

	}

	// formula to calculate area of triangle A = 1/2 × b × h.
	public static void triangleArea(int a, int b) {
		int area = (a * b) / 2;
		System.out.println("Area of triangle will be:" + area);

	}

	public static void areaOfTriangle(double a, double b) {
		int radius;
		double pi = 3.142, area;
		radius = 5;
		// calculating the area of the circle
		area = pi * radius * radius;
		// printing the area of the circle
		System.out.println("Area of circle is :" + area);
	}

	// Finds the sum of the digits in a short
	public static void sumOfDigits(int a) {

		short firstNum = (short) (a / 10);
		short secondNum = (short) (a % 10);
		short sum = (short) (firstNum + secondNum);
		System.out.println("Sum equals to " + sum);

	}

	public static void evenOrOdd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}

	public static void divider(int a, int b) {

		if (a == 0 || b == 0) {
			System.out.println("Division by 0 is not allowed");
		} else
			System.out.println(a / b);
	}

	public static void obviousNumbers(double number) {

	}

}
