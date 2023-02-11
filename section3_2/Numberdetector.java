package section3_2;

import java.util.Scanner;

public class Numberdetector {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("press any key that has one of the numbers between 0 and 9, both inclusive:");
		int number = input.nextInt();

		switch (number) {
		case 0:
			System.out.println("Press a number key: " + number + "You pressed zero.");
			break;
		case 1:
			System.out.println("Press a number key: " + number + "You pressed one.");
			break;
		case 2:
			System.out.println("Press a number key: " + number + "You pressed two.");
			break;
		case 3:
			System.out.println("Press a number key: " + number + "You pressed three.");
			break;
		case 4:
			System.out.println("Press a number key: " + number + "You pressed four.");
			break;
		case 5:
			System.out.println("Press a number key: " + number + "You pressed five.");
			break;
		case 6:
			System.out.println("Press a number key: " + number + "You pressed six.");
			break;
		case 7:
			System.out.println("Press a number key: " + number + "You pressed seven.");
			break;
		case 8:
			System.out.println("Press a number key: " + number + "You pressed eight.");
			break;
		case 9:
			System.out.println("Press a number key: " + number + "You pressed nine.");
			break;
		default:
			System.out.println("Not allowed.");

		}
	}

}
