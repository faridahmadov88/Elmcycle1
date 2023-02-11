package section6_1;

public class CheckingOverloaded {

	public static void main(String[] args) {
	
		boolean flag=true;
		boolean flag2= false;
		char c= 'y';
		
		//boolean flag3 = flag2+flag;
		
		double number = (2.0);
		int nums= (1);
	
	//	String a = "Farid";
	//	String b = "Ahmadov";
		
	//	String d = a+b;
	//	System.out.println(d);
		
		
		String arr[] = {"meow", "bray", "moo"};
        String a = "meow";
        System.out.println(arr[0] == a);
	
        int num1 = 10;
        int num2 = 20;
        boolean result = num1 > num2 && num1++ < num2++;
        System.out.println( result );
        System.out.println( "number 1: " + num1 );
        System.out.println( "number 2: " + num2 );
		

	}

}
