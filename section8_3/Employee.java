package section8_3;

public class Employee {

	Person person;
	Adress adress;
	// Add a constructor to the Employee class that takes a Person object and an
	// Address object as parameters.

	public Employee(Person person1,Adress adress1) {
		this.person =person1;
		this.adress =adress1;
		
		//Add a method to the Employee class that returns the employee's full address (street, city, state, and zip code).
		
		
		}
	public String printAdress() {
		
		   return adress.adress + adress.city + adress.state + adress.zipCode;
	}
	
	//Creates an Address object with street "123 Main St.", city "Anytown", state "XX", and zip code "12345"
	public static void main(String[] args) {
		Person person1 =new Person("John Doe", 35);
		Adress adress1 =new Adress("123 Main St.", "Anytown", "XX", "12345");
		Employee employee1 = new Employee(person1,adress1);
		System.out.println(employee1.printAdress());
		
	}

}
