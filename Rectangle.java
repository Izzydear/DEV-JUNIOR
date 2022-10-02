package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
		
	}
	
	public double diagonal() {
		double x = (width * width) + (height * height);
		return Math.sqrt(x);
	}

	@Override
	public String toString() {
		return "Rectangle Width = " + width + ", Height = " + height + "";
	}

	
}
