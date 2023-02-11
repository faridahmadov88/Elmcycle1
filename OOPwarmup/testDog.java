package OOPwarmup;

public class testDog {

	public static void main(String[] args) {
		
//		Animal animal = new Animal("Black", 4);
//		System.out.println(animal.color);
//		System.out.println(animal.numLegs);
		
		Dog dog =new Dog("Black", 4);
		System.out.println(dog.breed);
		System.out.println(dog.color);
		System.out.println(dog.numLegs);
		dog.printFields();

	}

}
