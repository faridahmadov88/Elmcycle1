package section2_3;

public class MethodsAcceptingValues {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		 methodWithoutParameter();
		 methodAcceptsStringParameter("meow");
		 printAge(5);		 

	}
	//public static void methodWithoutParameter() = method signature
	public static void methodWithoutParameter() {
		
		System.out.println("Hi there");		
		
	}
	public static void methodAcceptsStringParameter(String argument) {
		String localString =argument;
		System.out.println(localString);
		
	}
	
	public static void printAge (int age) {
		System.out.println("Person age: "+age);
		
	}

}
