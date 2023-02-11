package section6_1;

public class ReverseString {
	
	// reverse given string - book-> koob
	
	public static void main (String [] args) {
		String Book = "Farid";
		String  reversed = "";
		
		for (int i =Book.length()-1;i>= 0; i-- ) {
			
			reversed =  (reversed+Book.charAt(i));
			
			
			
			
		}
	
		System.out.println(reversed);
	}
	
	

}
