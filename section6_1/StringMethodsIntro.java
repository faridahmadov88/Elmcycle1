package section6_1;

public class StringMethodsIntro {
	
	
	public static void main (String [] args) {
		
		//toUpperCase()
		//toLowerCase()
		//replace()
		//by equals() method
		//by == operator
		//	by compareTo() method
		
		String str = "java";
		
		str.toUpperCase();
		
		System.out.println(str);
		
		str = str.toUpperCase();
		
		System.out.println(str);
		
		str.replace("v", "b");
		
		str = str.replace("V" ,"B");
		
		System.out.println(str);
		
		
		
		String str1 = "Farid";
		String str2= "FARID";
		String str3 = "Farid";
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str2.compareTo(str3));
		
		
		String text = "\tThis text is one tab in.\r\n";
		
		System.out.println(text);
		
		
		
		String sentence = "My name is farid";
		for(int i= 0; i < sentence.length();i++) {
			
			System.out.println(sentence.charAt(i));
			
		}
		
		
		
		
		
	}

}
