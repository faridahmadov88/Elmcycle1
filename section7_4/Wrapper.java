package section7_4;

public class Wrapper {

	public static void main(String[] args) {

		String str = "a1b2c3";
		System.out.println(returnStr("a1b2c3"));

	}
	
	public static int returnStr(String str) {
		int sum = 0 ;
		
		for(int i = 0; i < str.length(); i++ ) {
			
			char ch=str.charAt(i);
			
			if (Character.isDigit(ch)) {
				//System.out.println(ch);
				sum+=Integer.valueOf(""+ch);
				
			}
			
		}
		
		
		return sum;
	}
}