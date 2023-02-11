package section8_6;

public class Zoo {

	public static void main(String[] args) {
		
		Pet pet1 = new Cat();
		pet1.play();

		Animal animal1 = new Dog();
		animal1.sound();
		Animal animal2 = new Cat();
		
		if (animal2 instanceof Dog) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		//System.out.println(animal1.name);

		Animal[] animals = { animal1, animal2 };

		for (Animal ann : animals) {
			if (ann instanceof Cat) {

				((Cat)ann).sound();
			}
			
		}
	}
}
