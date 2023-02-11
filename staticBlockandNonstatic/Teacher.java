package staticBlockandNonstatic;

public class Teacher {
	
	
	String name;
	int id;
	
	
	static String school="Amigo";
	//1 static block gets executed before anything else
	//2 it only gets executed once
	static {
		System.out.println("This is static block");
		school= "Elm";
	}
	
	
	public Teacher () {
		System.out.println("Default costructor");
	}
	
//	{
//		System.out.println("this is non static block");
//		name ="farid";
//		//school= "Dell";
//	}
	public Teacher (String name, int id ) {
		this.name=name;
		this.id=id;
		this.print();
	}
	
	public static void print() {
		System.out.println("This is static print method");
	}
	public static void printFields() {
		
	}
}
