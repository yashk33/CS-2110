/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md
*/

public class Circle {

	private Point p;
	private double radius;

	public Circle(Point c, double rad) {
		p = c;
		radius = rad;
	}

	public Circle() {
		p = new Point(0, 0);
		radius = 1;
	}

	public Point getPoint() {
		return p;
	}

	public void setPoint(Point p1) {
		this.p = p1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public boolean equals(Object o) {
		if (this.getPoint().getX() == (((Circle) o).getPoint().getX())
				&& this.getPoint().getY() == (((Circle) o).getPoint().getY())
				&& this.getRadius() == ((Circle) o).getRadius())
			return true;
		return false;
	}

	public static void main(String[] args) {

		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Circle c1 = new Circle(p1, 3);
		Circle c3 = c1;
		Circle c2 = new Circle(p2, 5);
		Circle c4 = new Circle(p1,3);

		String s = "3.1415";
		double pi = Double.parseDouble(s);
		
		System.out.print("Expected: True, "+ "Returned: ");
		System.out.println(c1.equals(c3));
		System.out.print("Expected: True, "+ "Returned: ");
		System.out.println(c1.equals(c4));
		System.out.print("Expected: False, "+ "Returned: ");
		System.out.println(c1.equals(c2));
	}
	

	@Override
	public String toString() {
		return "<" + p + ", " + "radius: " + radius + ">";
	}

}