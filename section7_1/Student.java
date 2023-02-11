package section7_1;

public class Student {
	
	 String name ;
	long id;

	public void insertData(String n, long i) {
		name= n;
		id=i;
		
	}
	
	
	public void print() {
		
		System.out.println(id+ " "+name);
	}
}
