package section3_2;

import java.util.Scanner;

public class ExamMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Which of the following is NOT a conditional operator:");
		System.out.println("a. &&");
		System.out.println("b. |");
		System.out.println("c. !");
		System.out.println("d. ==");

		System.out.print("Please enter a, b, c or d as your choice:");
		char choise = input.next().charAt(0);
		
		if (choise == 'a') {
			System.out.println("Invalid choice.");
		} else if (choise == 'b') {
			System.out.println("Invalid choise");
		} else if (choise == 'c') {
			System.out.println("Invalid choise");

		} else if (choise == 'd') {
			System.out.println("Congratulations!");
		} else {
			System.out.println("Bad choice.");
		}
	}
}
//Which of the following is NOT a conditional operator:
//a. &&
//b. |
//c. !
//d. ==
//
//Please enter a, b, c or d as your choice: a
//Invalid choice.