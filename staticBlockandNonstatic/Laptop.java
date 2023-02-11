package staticBlockandNonstatic;

public class Laptop {

	String model;
	String make;
	int serial;
	
	
	void Laptop(String model,String make,int serial) {
		
		this.model=model;
		this.make=make;
		this.serial=serial;
		this.printthis();
		
		
	}
	public   void print() {
		
		System.out.println(model);
		System.out.println(make);
		System.out.println(serial);

		
		
	}
	public void printthis() {
		System.out.println("Print this");
	}
			
	}
	
	



