package section6_1;

public class PrintHalf {

	public static void main(String[] args) {
		
		
		String str ="farida";
		
		if ( str.length()% 2==0) {
			
			int len = str.length()/2;
			
			String half = str.substring(len);
			
			System.out.println(half);
			
		}
		
		
		
		
	}

}
