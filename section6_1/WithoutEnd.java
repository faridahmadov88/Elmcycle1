package section6_1;

public class WithoutEnd {

	public static void main(String[] args) {
		custom ();
	
		printShortFirst();

		String str= "java";
		
		String replaced =  str.substring(1,str.length()-1);
		
		System.out.println(replaced);
	}

	public static void printShortFirst() {
	String a = "Himamamia";
	String b= "Hello";
	String combo = "";
	String secondCombo= "";
	if (a.length()>b.length()) {
		
		combo = b+a+b;
		System.out.println(combo);
		
		
	}else {
		
		secondCombo = a+b+a;
		System.out.println(secondCombo);
		
	}
		
	}
	
	public static void custom () {
		
		
		String a = "Hello";
		
		String b = "There";
		
		
		String c = a.substring(1)+b.substring(1);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
