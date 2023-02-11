package section6_1;

public class Strprac {

	public static void main(String[] args) {
		/*
		 * kate.wilson
		 * 
		 **/
		email("farid.ahmadov@gmail.com");

	}

	public static void email(String str) {

		int dot =str.indexOf('.');
	//	System.out.println(dot);
		
		String firstName = str.substring(0,dot);
		System.out.println(firstName);
		
		int symbol= str.indexOf('@');
		
		String lastName = str.substring(dot+1,symbol);
		
		System.out.println(lastName);
		
		String domain = str.substring(symbol+1);
		System.out.println(domain);

	
	}
}
