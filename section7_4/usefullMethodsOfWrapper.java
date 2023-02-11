package section7_4;

public class usefullMethodsOfWrapper {

	public static void main(String[] args) {
	
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		
		String a = "123";
		Double b = Double.parseDouble(a);
		System.out.println(a);
		
		
		char c = '?';
		boolean flag =Character.isAlphabetic(c);
		System.out.println(flag);
		
		char d = '5';
		boolean flag2 =Character.isDigit(c);
		System.out.println(flag2);


	}

}
