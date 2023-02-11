package section8_5_1;

public  class Triangle  extends Shape implements Drawable{
	
	
	public  void perimeter() {
		System.out.println("This method calculates perimeter...");
		
	}
	
	public  void area() {
		System.out.println("This method calculates area...");
	}


	public void draw() {
	
		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		
		
	}

}
