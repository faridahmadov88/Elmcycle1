package dayInfinity;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		// custom();

		// Calc();
		// sWitch();
		// repating();
		repatingIf();
	}

	public static void custom() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number :");
		int number = input.nextInt();
		if (number > 0) {
			System.out.println("number is positive");
		} else if (number == 0) {
			System.out.println("number is zero");
		} else {
			System.out.println("number os negative");
		}

	}

	public static void Calc() {
		Scanner input = new Scanner(System.in);

		System.out.println("please input num 1");
		int num1 = input.nextInt();
		System.out.println("Please input operator");
		char operator = input.next().charAt(0);
		System.out.println("please input num2");
		int num2 = input.nextInt();
		if (operator == '+') {
			System.out.println(num1 + num2);

		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		}

	}

	public static void sWitch() {

		Scanner input = new Scanner(System.in);
		System.out.println("please input number between 1-5 ::");

		int choice = input.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Walk");
			break;
		case 2:
			System.out.println("Run");
			break;
		case 3:
			System.out.println("Crawl");
			break;
		case 4:
			System.out.println("Swim");
			break;
		case 5:
			System.out.println("Fly");
			break;
		default:
			System.out.println("Please enter 1 to 5");
		}

	}

	public static void repating() {

		Scanner input = new Scanner(System.in);
		System.out.println("please input number");
		int number = input.nextInt();

		switch (number) {

		case 1:
			System.out.println("diwlerini yu");
			break;
		case 2:
			System.out.println("yerine gir");
			break;
		case 3:
			System.out.println("su ich");
			break;
		default:
			System.out.println("1 den 3 kimi sec");
		}

	}

	public static void repatingIf() {
		Scanner input = new Scanner(System.in);

		System.out.println("nomre sec");
		int number = input.nextInt();

		if (number == 1) {

			System.out.println("get yatmaga");
		}else if (number==2) {
			System.out.println("toilete gir");
			
		}else if (number ==3) {
			System.out.println("vitamin ich");
		}
		else {
			System.out.println("1 den 3 kimi sec dana");
		}
			

	}
}
