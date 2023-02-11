package section6_4;

public class StringBufferIntro {

	public static void main(String[] args) {

	}

	
	public static String concatWithString ( ) {
		
		
		
		String str = "Farid";
		
		for (int i = 0 ; i < 10000 ; i++) {
			
			str= str + " best guy,";
			
			
			
		}
		return str;
		
		
		
	}
	public static String concatStringBuffer() {
		
StringBuffer str = new StringBuffer("Farid");
		
		for (int i = 0 ; i < 10000 ; i++) {
			
			str.append("is the best");
			
			
			
		}
		return str.toString();
		
		
	}
	
	
}
