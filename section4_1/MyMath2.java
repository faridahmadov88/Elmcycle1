package section4_1;

public class MyMath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAll(1, 10);
		sumEven(1,4);
		sumOdd(1,5);

	}

	public static void SumAll(int counter, int num) {

		int sum = 0;
		while (counter <= num) {

			sum = sum + counter;

			counter++;
		}
		System.out.println("Sum = " + sum);
	}

	public static void sumEven(int num1, int num2) {

		int sum = 0;

		while (num1 <= num2) {
			if (num1 % 2 == 0) {
				sum = sum + num1;
			} else {
				sum = sum + 0;
			}
			num1++;
		}
		System.out.println("Sum = " + sum);
	}

	public static void sumOdd(int num1, int num2) {

		int sum = 0;
		while (num1 <= num2) {
			if (!(num1 % 2 == 0)) {
				sum = sum + num1;
			} else {
				sum = sum + 0;
			}
			num1++;
		}
		System.out.println("Sum = " + sum);

	}
}
