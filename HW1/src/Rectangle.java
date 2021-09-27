/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md
*/


public class Rectangle {
	
	// fields
	private double length;
	private double width;
	
	// default constructor (takes no parameters)
	public Rectangle() {
		// length and width assigned default values (4 for length and 2 for width)
		this.length = 4;
		this.width = 2;
	}
	
	// constructor 
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// WRITE an appropriate 
	//     (1) toString method
	//     (2) getter and setter methods for the length field
	//     (3) getter and setter methods for the width field 
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length = " + length + ", width = " + width + "]";
	}

	public static void main(String[] args) {
		// Reminder: don't write methods within other methods.
		// Test out toString() method and getters and setters here! (Main method testing) 
		Rectangle r1 = new Rectangle(6,5); 
		Rectangle r2 = new Rectangle();
		
		System.out.println(r1);
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		r1.setWidth(9);
		System.out.println(r1);
		System.out.println(r1.getWidth());
		
		System.out.println(r2);
	}

}