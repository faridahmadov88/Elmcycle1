package section8_6;

public class Cat extends Animal implements Pet{
	
	public void sound() {
		System.out.println("Cat meowing.");
	}

	@Override
	public void play() {

		System.out.println("This is for interface ");
	}
	public static void sing() {
		System.out.println("Cat is singing songs");
	}

}
