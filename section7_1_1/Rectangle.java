package section7_1_1;

public class Rectangle {

	int width;
	int length;
	int perimeter;
	int area;
	
	public Rectangle(int w, int l) {
		width = w;
		length = l;
	}
	
	public void perimeter() {
		
		perimeter= (width+length)*2;
		System.out.println("perimeter = "+perimeter);
		
		
	}
	public void area () {
		
		area= width*length;
		System.out.println("area=" +area);
	}
}
