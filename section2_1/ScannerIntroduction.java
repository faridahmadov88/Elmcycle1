package section2_1;



	
	

		import java.util.Scanner;	
		
		public class ScannerIntroduction {
			public static void main(String []args ) {
				
			Scanner input = new Scanner(System.in);
				
				//String name = ("Enter your name :"+ input);
				
				
				
			System.out.print("Enter first name:");
				String name = input.nextLine();
				System.out.print("Enter first lastname:");
				
				//System.out.println("Enter your name :"+ name);
				
				String lastName = input.nextLine();
				//System.out.println("Enter your Lastname :"+ lastName);
				
				
				
				
				System.out.println("Your fullname will be "+" "+ name+" "+lastName );


			}

		


	}


