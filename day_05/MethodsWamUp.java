package day_05;
import java.util.Scanner;
public class MethodsWamUp {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		
		personalInfo();
		

	}
	
	public static void personalInfo() {
		
		String yourName= "Farid";
		int yearOfBirth = 1988;
		int currentYear= 2022;
		int age= currentYear- yearOfBirth;
		System.out.println("Name: "+yourName);
		System.out.println("year of birth: "+yearOfBirth);
		System.out.println("Age:"+age);
		
		
	}
	
	

}
