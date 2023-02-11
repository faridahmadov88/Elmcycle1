package dayInfinity;


import java.util.Scanner;

public class scannerDeffect {
	
	public static void main(String[]args) {
		
		Scanner in= new Scanner(System.in);
		
		String name;
		int age;
		String dummy;
		
		System.out.print("What is your age? "); 
		age = in.nextInt(); 
		//if you do not add dummy scanner it will not wait for your respond in next line
		dummy = in.nextLine();
		
		System.out.print("What is your name? "); 
		name = in.nextLine(); 

		

		System.out.println("Hello " + name + ", age " + age); 
		
		
	}

}
