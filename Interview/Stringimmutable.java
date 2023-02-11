package Interview;

public class Stringimmutable {

	public static void main(String[] args) {
		
		//Why main is static?-one reason why main() has to be static is that is does not require an object to be created,
//it can be called as is.

		
		/*
		 * Static helps us to manage memory allocation
		 * Static belongs to the class itself not to objects
		 * We can't call non static fields in static method
		 * Only way is calling those(non-static) fields through object
		 * */
		
		
		
		
		//why string is immutable ?
		//sTRING IS IMMUTABLE because it is unchangable it is unmodifible, we just creating new one.
		
		//reverse string 
		
		String str ="reverse";
		String reversed = "";
		
		for (int i =str.length()-1; i>=0; i--){
			
		reversed = reversed+str.charAt(i);
			
		}
		
		
		System.out.println(reversed);
		
		
	}

}
