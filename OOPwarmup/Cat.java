package OOPwarmup;

public class Cat extends Animal {

	public Cat(String name, int age, double weight) {
		super(name, age, weight);

	}

	String breed;

	public void setBreed(String breed) {
		this.breed = breed;

	}

	public String toString() {

		return this.name + " " + this.age+" " + this.weight +" "+ this.breed;
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat("Fluffy", 5, 10);
		cat1.breed = "Siamese";
		System.out.println(cat1);

	}

}
