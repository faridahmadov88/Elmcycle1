package OOPwarmup;

public class Animal {
	String name;
	int age;
	double weight;
	
	
	
	
	public void setName(String name) {
		this.name=name;	
	}
	public void setAge (int age) {
		this.age=age;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getWeight() {
		return this.weight;
	}
	
	
	public Animal(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
}
