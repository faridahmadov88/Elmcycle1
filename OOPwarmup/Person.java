package OOPwarmup;

public class Person {
	private String name;
	private int age;
	private String adress;
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public void setAdress(String adress) {
		this.adress=adress;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAdress() {
		return adress;
	}
	
	
	public Person (String name, int age ,String adress) {
		this.setName(name);
		this.setAge(age);
		this.setAdress(adress);
		
	}

}
