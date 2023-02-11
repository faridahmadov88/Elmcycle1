package section8_6;

public class Dog extends Animal implements Pet{
	
	String name ="Bim";
	
	public void sound () {
		System.out.println("Dog is barking");
	}

	@Override
	public  void play() {
		// TODO Auto-generated method stub
		
	}
	public static void sing() {
		System.out.println("Dog is singing songs");
	}
	

}
