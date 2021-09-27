import java.util.Scanner;

public class PointsInAPlane {

	public static void main(String[] args) {
		// you'll put your tests here
		System.out.println(points(3.2,4.2));
		System.out.println(points(-4.0, -2.0));
		System.out.println(points(7.7, -3.7));
		System.out.println(points(5.3, 7.4));
		System.out.println(points(0,0));
		System.out.println(points(3,4));

	}
	public static double points(double x, double y) {
		if(x>0 & y>0) 
			return x*y;
		
		else if(x<0 & y>0)
			return x-y;
		
		else if(x<0 & y<0)
			return x/y;
		
		else return x+y;
	}
}