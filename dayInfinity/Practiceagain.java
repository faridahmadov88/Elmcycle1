package dayInfinity;

import java.util.Scanner;

public class Practiceagain {

	public static void main(String[] args) {
	//	comparision();
	//	andIfOr ();
     smartScan();
	}

	public static void comparision() {

		int a = 3;
		int b = 3;

		boolean comparision = (a != b);
		System.out.println(comparision);
		
		String fruit1 ="apple";
		String fruit2 = "apple";
		boolean comprasion = fruit1.equals(fruit2);
		System.out.println(comprasion);
	}
	public static void andIfOr () {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number to dvide by 100");
		int number = input.nextInt();
		
		if(number>0 && number<100) {
			System.out.println(100/number);
			if (number==0) {
				System.out.println("you cant dvide bye 0");
				
			}
		}else
			System.out.println("number is not in range 1-100");
		
	}
	public static void smartScan() {
        int number;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a nuumber: ");
        if ( ! scanner.hasNextInt() ) {
            String wrongInput = scanner.next();
            System.out.println(wrongInput + " is not a number.");
            return;
        }

        number = scanner.nextInt();
        System.out.println(number + " is a valid number.");
    }
}
