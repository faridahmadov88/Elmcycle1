package OOPwarmup;

public class testPerson {

	public static void main(String[] args) {
		
		
		Person person = new Person("John Doe",30, "250 Main str");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		person.setAdress( "123 Elm St.");
		System.out.println(person.getAdress());
	}
}
