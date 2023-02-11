package section8_3;

public class Animals {
	
     String name ;
	 int age;
	 {
		 System.out.println("This is non -static block from animal");
	 }
//	 static{
//		 System.out.println("This is static block from animal");
//	 }
	 
	 public void eat () {
		 System.out.println("animals love to eat");
	 }
	 
	 
	 public void move () {
		 
		 System.out.println(name + " is " + age + " years old and moving. ");
		 
	 }
	
}