package studio7;

public class Rectangle {

	private int length;
	private int width; 
	
	public Rectangle(int instlength, int instwidth) {
		length = instlength;
		width = instwidth; 
	}
	
	public String toString() {
		return (length + "x" + width);
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int area() {
		return length*width; 
		
	}
	
	public int perimeter() {
		return length*2 + width*2; 
	}
	
	public boolean isSquare() {
		if(width == length) {
			return true;
		}else {
			return false; 
		}
	}
	
	public boolean smallerThan(Rectangle rectangle1, Rectangle rectangle2) {
		if (rectangle1.area() < rectangle2.area()) {
			return true;
		} else {
			return false; 
		}
	}
}
