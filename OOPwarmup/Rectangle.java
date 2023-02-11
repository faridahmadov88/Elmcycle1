package OOPwarmup;

public class Rectangle {
	private double length;
	private double width;
	
	
	public void setWidth(double width) {
		this.width=width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	
	
	public Rectangle (double length,double width) {
		this.setLength(length);
		this.setWidth(width);
	}
	//Add a method calculateArea to the Rectangle class that returns the area of the rectangle (length x width).
	public void  calculateArea() {
		double area= width*length;
		
		System.out.println(" width: "+this.width+" length: "+length+" Area: "+area);
	}
	//Add a method calculatePerimeter to the Rectangle class that returns the perimeter of the rectangle (2 x length + 2 x width).
	public void calculatePerimeter() {
		double perimeter = (width+length)*2;
	
		System.out.println(" width: "+ this.width+" length: "+this.length+ " Perimeter: "+perimeter);
	}
	

}
